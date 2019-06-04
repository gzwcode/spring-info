package com.gzw.bean;

import com.gzw.consts.ConstsValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResultVO<T> {
    private String code;

    private String msg;

    private T data;


    public static ResultVO success() {
        return new ResultVO(ConstsValue.SUCCESS_CODE, ConstsValue.SUCCESS_MSG, null);
    }
}
