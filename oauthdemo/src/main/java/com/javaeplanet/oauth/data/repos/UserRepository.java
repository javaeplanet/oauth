package com.javaeplanet.oauth.data.repos;

import org.springframework.data.repository.CrudRepository;

import com.javaeplanet.oauth.data.entites.User;

public interface UserRepository extends CrudRepository<User, Integer> {
User findByName(String name);
}
