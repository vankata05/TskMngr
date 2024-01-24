package com.example.TaskMngr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@Configuration
@ComponentScan
@EnableJpaRepositories
@Import(RepositoryRestMvcConfiguration.class)
@EnableAutoConfiguration
public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(App.class, args);

		TaskRepo repository = ctx.getBean(TaskRepo.class);

		Task task = new Task();
		task.setTaskName("Test name");
		task.setTaskDescription("Test description");
		task.setTaskPriority("HIGH");
		task.setTaskStatus("ACTIVE");

		repository.save(task);
	}

}
