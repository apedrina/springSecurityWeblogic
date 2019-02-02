package com.alissonpedrina.model.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.alissonpedrina.model.domain.User;

@Component
public interface UserAPRepository extends JpaRepository<User, Long>{
	
	List<User> findByFirstName(String name);

}
