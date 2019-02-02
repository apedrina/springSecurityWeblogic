package com.alissonpedrina.model;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.alissonpedrina.model.domain.User;
import com.alissonpedrina.model.repo.UserAPRepository;

@SpringBootApplication
public class ModelApplication {

	private static final Logger log = LoggerFactory.getLogger(ModelApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ModelApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(UserAPRepository repository) {
		return (args) -> {
			repository.save(new User("Jack"));
			repository.save(new User("Chloe"));

			log.info("-------------------------------");
			for (User customer : repository.findAll()) {
				log.info(customer.toString());
			}
			log.info("");
			
			List<User> todos = repository.findAll();
			todos.forEach(u -> {System.out.println("alisson000000000000" + u.getFirstName());});
		};
	}

}
