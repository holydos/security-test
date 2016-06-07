package com.vutichenko.sectest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by vutichenko on 07.06.2016.
 */
@EnableWebMvc
@Configuration
class WebMvcConfig extends WebMvcConfigurerAdapter {
}
