package com.yan.cloud.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by huyan on 2020/12/1.
 * TIME: 9:20
 * DESC:
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate createRestTemplate() {
        return new RestTemplate();
    }
}
