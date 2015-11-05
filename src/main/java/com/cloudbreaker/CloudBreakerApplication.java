package com.cloudbreaker;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;




@EnableCircuitBreaker
@EnableHystrixDashboard
@EnableDiscoveryClient
@SpringBootApplication
public class CloudBreakerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudBreakerApplication.class, args);
        System.out.println("Cloud Breakers");

    }

    @HystrixCommand(fallbackMethod = "defaultInvokeRemoteService")
    public String invokeRemoteService(String input) {
        return "FallBack Error: " + input;
    }
}
