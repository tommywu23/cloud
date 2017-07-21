package cn.dianjingquan.service.config.client.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tommy on 2017/7/20.
 * config-client
 * cn.dianjingquan.service.config.client.controllers.TestController
 */
@RefreshScope
@RestController
public class TestController {
    @Value("${spring.jdbc.user}")
    private String source;

    @RequestMapping("/source")
    public String source(){

        return this.source;
    }
}
