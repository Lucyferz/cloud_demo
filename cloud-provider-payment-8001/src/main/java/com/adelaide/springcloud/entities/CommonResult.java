package com.adelaide.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;// 状态码
    private String message;// 错误提示
    private T data;// 具体实体类

    public CommonResult(Integer code, String message){
        this(code, message, null);
    }
}
