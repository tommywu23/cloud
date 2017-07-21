package cn.dianjingquan.service.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by tommy on 2017/7/18.
 * config
 * cn.dianjingquan.service.config.ConfigServer
 */
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class ConfigServer {
    public static void main(String[] args){
        SpringApplication.run(ConfigServer.class, args);
    }
}
