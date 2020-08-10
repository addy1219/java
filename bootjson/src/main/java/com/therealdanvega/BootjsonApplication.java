package com.therealdanvega;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.therealdanvega.domain.User;
import com.therealdanvega.service.UserService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

@SpringBootApplication
public class BootjsonApplication 
{
	public static FileWriter file;
	public static void main(String[] args) {
		SpringApplication.run(BootjsonApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(UserService userService){
	    return args -> {
			// read JSON and load json
			ObjectMapper mapper = new ObjectMapper();
			
			TypeReference<List<User>> typeReference = new TypeReference<List<User>>(){};
			
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/users.json");
			try {
				List<User> users = mapper.readValue(inputStream,typeReference);
				userService.save(users);
				System.out.println("Users Saved!");
				
				// write JSON
				User user = new User();
				user.setId(11);
				user.setFirstName("Ravi");
				user.setLastName("Krishnan");
				user.setDob(2019);
				user.setEmail("ravi@rzt.com");
				user.setAddress("Juhu");
				user.setPhone(87890234);
				
				mapper.writeValue(new File("C:\\Users\\User\\eclipse-workspace\\bootjson\\src\\main\\resources\\json"),user);
			} 
			catch (IOException e){
				System.out.println("Unable to save users: " + e.getMessage());
			}
	    };
	}
}