package com.wipro.assetmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
/*
 * @ComponentScan({"com.wipro.assetmanager"})
 * 
 * @EntityScan("com.wipro.assetmanager")
 * 
 * @EnableJpaRepositories("com.wipro.assetmanager")
 */
public class AssetManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssetManagerApplication.class, args);
	}

}
