package com.esfb.counterfeitnote;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
@EnableJpaRepositories

public class Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		 new Application().configure(new SpringApplicationBuilder(Application.class)).run(args);
	}
}
