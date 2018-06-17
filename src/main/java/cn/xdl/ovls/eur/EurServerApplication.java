package cn.xdl.ovls.eur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer//启动eurekaserver
@SpringBootApplication
public class EurServerApplication {
	
	public static void main(String[] args){
		SpringApplication.run(EurServerApplication.class, args);
	}
}
