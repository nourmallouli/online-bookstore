package com.example.onlinebookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.example.onlinebookstore.entity.Book;
import com.example.onlinebookstore.entity.BookCategory;

@SpringBootApplication
public class OnlinebookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlinebookstoreApplication.class, args);
	    
	}
	
	@Bean
	public RepositoryRestConfigurer repositoryRestConfigurer()
	{
	    return RepositoryRestConfigurer.withConfig(config -> {
	        config.exposeIdsFor(Book.class);
	        config.exposeIdsFor(BookCategory.class);
	    });
	}

}
