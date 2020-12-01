package com.yan.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by huyan on 2020/11/30.
 * TIME: 18:56
 * DESC:
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudProviderPayment8001 {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment8001.class, args);
    }
}
