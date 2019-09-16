package com.assignment.camel;

import com.assignment.camel.domain.Pain001;
import com.assignment.camel.repository.Pain001Repository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CamelApplication {


	@Autowired
	private Pain001Repository pain001Repository;



	public static void main(String[] args) {
		SpringApplication.run(CamelApplication.class, args);

		System.out.println("Eminem");
	}



	@Bean
	InitializingBean sendDatabase() {
		return () -> {
			pain001Repository.save(new Pain001(10l,"20190916Monday","i like json and not xml"));
			pain001Repository.save(new Pain001(20l,"20190917Tuesday","i like xml and not json"));
		};
	}
}

