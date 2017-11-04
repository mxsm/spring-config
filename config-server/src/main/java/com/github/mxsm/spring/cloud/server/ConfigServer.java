package com.github.mxsm.spring.cloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * 
 * @author ant
 * @Date 2017-10-30
 * Dscription:Spring cloud Server
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServer 
{
    public static void main( String[] args )
    {
       SpringApplication.run(ConfigServer.class, args);
    }
}
