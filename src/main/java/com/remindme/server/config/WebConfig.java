package com.remindme.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc //вкл режима веб мвс и рест контроллеров
@ComponentScan("com.remindme.server")
public class WebConfig extends WebMvcConfigurerAdapter{

}
