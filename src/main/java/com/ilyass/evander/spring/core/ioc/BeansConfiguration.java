package com.ilyass.evander.spring.core.ioc;

import org.springframework.context.annotation.Bean;

public class BeansConfiguration {

	@Bean
	public User2 user2() {
		var user = new User2();
		user.setFirstName("John");
		user.setLastName("Smith");
		return user;
	}
	
	@Bean("customUser")
	public User2 user3() {
		var user = new User2();
		user.setFirstName("William");
		user.setLastName("Jackson");
		return user;
	}
}
