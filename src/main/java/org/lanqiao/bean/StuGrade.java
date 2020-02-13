package org.lanqiao.bean;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class StuGrade {
    private Integer judgeResId;

    public Integer getJudgeResId() {
        return judgeResId;
    }

    public void setJudgeResId(Integer judgeResId) {
        this.judgeResId = judgeResId;
    }
}