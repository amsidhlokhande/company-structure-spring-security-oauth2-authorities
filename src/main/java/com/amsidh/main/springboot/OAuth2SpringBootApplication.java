package com.amsidh.main.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.amsidh.mvc.entities.Address;
import com.amsidh.mvc.entities.Car;
import com.amsidh.mvc.entities.Company;
import com.amsidh.mvc.entities.Department;
import com.amsidh.mvc.entities.Employee;
import com.amsidh.mvc.entities.Office;
import com.amsidh.mvc.entities.security.Authority;
import com.amsidh.mvc.entities.security.User;
import com.amsidh.mvc.repository.CompanyRepository;
import com.amsidh.mvc.repository.CompanyRepositoryImpl;
import com.amsidh.mvc.repository.UserRepository;

@EnableAutoConfiguration
@SpringBootApplication(exclude = JmxAutoConfiguration.class)
@ComponentScan(basePackages = { "com.amsidh.mvc" })
@EnableJpaRepositories(basePackageClasses = { CompanyRepository.class, UserRepository.class,
		CompanyRepositoryImpl.class })
@EntityScan(basePackageClasses = { Address.class, Car.class, Company.class, Department.class, Employee.class,
		Office.class, User.class, Authority.class })
public class OAuth2SpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(OAuth2SpringBootApplication.class, args);
	}
}
