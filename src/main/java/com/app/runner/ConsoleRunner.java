package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
//import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;

import com.app.document.Product;
import com.app.repo.ProductRepository;
@Component
//@EnableMongoRepositories(basePackageClasses=ProductRepository.class)
public class ConsoleRunner implements CommandLineRunner {
  @Autowired
  private ProductRepository repo;
	@Override
	public void run(String... args) throws Exception {
		repo.deleteAll();
		repo.save(new Product(7,"A3W",3.0));
		repo.save(new Product(8,"A4W",4.0));
		repo.save(new Product(9,"A5W",5.0));
		repo.save(new Product(10,"A6W",6.0));
		//repo.findAll().forEach(System.out::println);

	}

}
