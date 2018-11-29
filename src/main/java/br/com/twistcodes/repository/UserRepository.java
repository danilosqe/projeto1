package br.com.twistcodes.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.twistcodes.entity.User;

public interface UserRepository extends MongoRepository<User, Long> {

	User findByEmail(String email);
	
	User findByNameIgnoreCase(String name);
	
}

