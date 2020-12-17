package com.songshao.test.utils;

import lombok.Data;


@Data
public class DataResult<T> {
    private Boolean success;
    private T Data;
    private int count;
    private String msg;

}
