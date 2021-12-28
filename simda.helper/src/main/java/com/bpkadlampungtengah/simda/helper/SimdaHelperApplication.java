package com.bpkadlampungtengah.simda.helper;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

@SpringBootApplication
public class SimdaHelperApplication {
	public static void main(String[] args) {
		SpringApplication.run(SimdaHelperApplication.class, args);
	}

}
