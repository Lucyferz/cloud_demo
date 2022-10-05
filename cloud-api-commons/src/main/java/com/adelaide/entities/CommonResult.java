package com.adelaide.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult {
    private Integer code;
    private String message;
    private Object data;

    public CommonResult(Integer id, String message){
        this(id, message, null);
    }

}
