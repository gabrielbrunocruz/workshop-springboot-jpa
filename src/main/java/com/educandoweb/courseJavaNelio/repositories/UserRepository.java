package com.educandoweb.courseJavaNelio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.courseJavaNelio.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
