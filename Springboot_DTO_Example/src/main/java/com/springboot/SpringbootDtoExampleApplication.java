package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.model.Location;
import com.springboot.model.User;
import com.springboot.repository.LocationRepository;
import com.springboot.repository.UserRepository;

@SpringBootApplication
public class SpringbootDtoExampleApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDtoExampleApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private LocationRepository locationRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Location location = new Location();
		location.setPlace("Gujarat");
		location.setDescription("Gujarat is great city to live");
		location.setLongitude(40.5);
		location.setLatitude(30.6);
		locationRepository.save(location);
		
		User user1 = new User();
		user1.setFirstName("Khushali");
		user1.setLastName("Bhanushali");
		user1.setEmail("khushali@gmail.com");
		user1.setPassword("Khushi123");
		user1.setLocation(location);
		userRepository.save(user1);
		
		User user2 = new User();
		user2.setFirstName("Dhara");
		user2.setLastName("Sukhadiya");
		user2.setEmail("dhara@gmail.com");
		user2.setPassword("12345");
		user2.setLocation(location);
		userRepository.save(user2);
	}

}
