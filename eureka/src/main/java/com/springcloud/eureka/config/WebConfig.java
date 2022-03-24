/*
 * Copyright (c) 2022. Shanghai TongYan Civil Engineering Technology Corp., Ltd. All rights reserved.
 */
package com.springcloud.eureka.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Description: 一句话描述此类
 *
 * @author 钟鸣
 * @Date 2022/3/23 16:53
 */
@EnableWebSecurity
public class WebConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().ignoringAntMatchers("/eureka/**");
        super.configure(http);
    }
}
