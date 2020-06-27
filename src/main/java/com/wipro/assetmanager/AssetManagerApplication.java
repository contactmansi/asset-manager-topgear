package com.wipro.assetmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.wipro.assetmanager.components"})
@EntityScan("com.wipro.assetmanager.components")
@EnableJpaRepositories("com.wipro.assetmanager.components")
public class AssetManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssetManagerApplication.class, args);
	}

}
