package com.dio.productcatalogtwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.solr.SolrAutoConfiguration;

@SpringBootApplication(exclude = {SolrAutoConfiguration.class})
public class ProductCatalogtwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductCatalogtwoApplication.class, args);
	}

}
