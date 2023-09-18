package com.heima.wemedia.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class WemediaGatewayAplication {

    public static void main(String[] args) {
        SpringApplication.run(WemediaGatewayAplication.class,args);
        log.info("启动成功");
    }
}
