package com.songshao.test.vo;

import lombok.Data;

@Data
public class ResultVO<T> {
    private Integer code;
    private String msg;
    private T data;
    private Integer totalCount;
}
