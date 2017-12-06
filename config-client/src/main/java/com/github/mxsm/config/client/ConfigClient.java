package com.github.mxsm.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author ant
 * @Date 2017-10-30
 * Dscription:
 */
@SpringBootApplication
@RestController
public class ConfigClient 
{
    public static void main( String[] args )
    {
        SpringApplication.run(ConfigClient.class, args);
    }
}
