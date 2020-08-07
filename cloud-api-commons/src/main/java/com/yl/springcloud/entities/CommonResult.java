package com.yl.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yanglin
 * @version V1.0
 * @Package com.yl.springcloud.entities
 * @date 2020/8/6 23:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    // 404 not found
    private Integer code;
    private String message;
    private T       data;


    public CommonResult(Integer code, String message) {
        this(code,message,null);
    }

}
