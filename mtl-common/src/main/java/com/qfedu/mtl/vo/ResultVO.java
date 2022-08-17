package com.qfedu.mtl.vo;

import lombok.Data;
import lombok.ToString;

import java.util.List;
@Data
@ToString
public class ResultVO {
    private int code;
    private String msg;
    private Object data;

    public ResultVO(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultVO(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
