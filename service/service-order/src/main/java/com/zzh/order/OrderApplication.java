package com.zzh.order;

import com.zzh.common.anno.EnableUserLoginAuthInterceptor;
import com.zzh.common.anno.EnableUserTokenFeignInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.atguigu.spzx"})
@EnableUserTokenFeignInterceptor
@EnableUserLoginAuthInterceptor
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class , args) ;
    }

}
