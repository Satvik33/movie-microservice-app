package com.stackroute.APIGatewayDemo;

import com.stackroute.APIGatewayDemo.filters.ErrorFilter;
import com.stackroute.APIGatewayDemo.filters.PostFilter;
import com.stackroute.APIGatewayDemo.filters.PreFilter;
import com.stackroute.APIGatewayDemo.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@EnableZuulProxy
public class SpringBootZuulGatewayProxyApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootZuulGatewayProxyApplication.class, args);
    }

    @Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }
    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }
    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }
    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }
}
