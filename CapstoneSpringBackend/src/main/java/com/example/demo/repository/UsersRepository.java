package com.myapp.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myapp.spring.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, String> {
	public Users findByEmail(String email);
}
