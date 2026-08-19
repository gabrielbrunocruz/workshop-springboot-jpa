package com.educandoweb.courseJavaNelio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.courseJavaNelio.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
