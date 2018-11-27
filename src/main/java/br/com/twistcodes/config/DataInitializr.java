package br.com.twistcodes.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.twistcodes.entity.User;
import br.com.twistcodes.repository.UserRepository;

@Component
public class DataInitializr implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		List<User> users = userRepository.findAll();


		if (users.isEmpty()) {
			createUser("Danilo Martins", "danilo@gmail.com");
			createUser("Teste", "teste@gmail.com");
			createUser("Teste2", "teste2@gmail.com");
		}
		
		User user = userRepository.findByNameIgnoreCase("Danilo Martins");
		System.out.println(user.getName() + " " + user.getEmail());
		
	}
	
	public void createUser(String nome, String email) {
		User user = new User(nome, email);
		userRepository.save(user);
	}
}