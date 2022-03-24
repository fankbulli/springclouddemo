/*
 * Copyright (c) 2022. Shanghai TongYan Civil Engineering Technology Corp., Ltd. All rights reserved.
 */
package com.springcloud.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: 一句话描述此类
 *
 * @author 钟鸣
 * @Date 2022/3/23 17:10
 */
@RestController("/client")
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello,client";
    }
}
