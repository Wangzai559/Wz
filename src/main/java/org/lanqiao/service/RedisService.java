package org.lanqiao.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author admin
 * @date 2019/10/28 10:20
 * redis服务类
 */
@Service
@PropertySource("classpath:redis.properties")
public class RedisService {
    private Environment env;
    private JedisPool jedisPool;
    private ObjectMapper objectMapper;

    private static final int timeout = 1000;        //超时时间

    public RedisService(Environment env){
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(20);
        config.setMaxIdle(2);
        config.setMinIdle(0);
        config.setBlockWhenExhausted(true);
        jedisPool = new JedisPool(config,env.getProperty("redis.dev.host"),
                Integer.parseInt(env.getProperty("redis.dev.port")),
                timeout,env.getProperty("redis.dev.pwd"));

        //根据操作系统判断本地环境还是线上环境
        String os = System.getProperty("os.name");

        if(os.startsWith("Windows")){           //本地环境
            System.out.println("当前是Windows系统");
            jedisPool = new JedisPool(config,env.getProperty("redis.dev.host"),
                    Integer.parseInt(env.getProperty("redis.dev.port")),
                    timeout,env.getProperty("redis.dev.pwd"));
        }else{          //线上环境
            System.out.println("当前是线上环境");
            jedisPool = new JedisPool(config,env.getProperty("redis.prod.host"),
                    Integer.parseInt(env.getProperty("redis.prod.port")),
                    timeout,env.getProperty("redis.prod.pwd"));
        }
        objectMapper = new ObjectMapper();
    }

    //获取jedi对象
    public Jedis getResource(){
        return jedisPool.getResource();
    }

    //添加缓存数据
    public void set(String key,String value){
        try{
            Jedis jedis = jedisPool.getResource();
            jedis.set(key,value);
        }catch (Exception e){
        }
    }

    //添加缓存数据，带过期时间
    public void set(String key,String value,int seconds){
        try{
            Jedis jedis = jedisPool.getResource();
            jedis.set(key,value);
            jedis.expire(key,seconds);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //添加对象到缓存，带获取时间
    public void set(String key,Object value,int seconds){
        try{
            Jedis jedis =jedisPool.getResource();
            jedis.set(key,objectMapper.writeValueAsString(value));
            jedis.expire(key,seconds);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //根据key获取相应的值
    public String get(String key){
        String value =null;
        try{
            Jedis jedis = jedisPool.getResource();
            value=  jedis.get(key);
        }catch (Exception e){
            e.printStackTrace();
        }
        return value;
    }

    //根据key获取对象
    public <T> T get(String key,Class<T> tClass){
        T obj = null;
        try{
            Jedis jedis = jedisPool.getResource();
            String value = jedis.get(key);
            if(value!=null){
                obj = objectMapper.readValue(value,tClass);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return obj;
    }

    //删除key
    public void del(String key){
        try{
            Jedis jedis = jedisPool.getResource();
            jedis.del(key);
        }catch (Exception e){
        }
    }
}
