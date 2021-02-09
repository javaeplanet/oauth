package com.javaeplanet.oauth.data.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.javaeplanet.oauth.data.entites.User;
import com.javaeplanet.oauth.data.repos.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepos;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepos.findByName(username);
		return new org.springframework.security.core.userdetails.User(user.getName(), user.getPassword(),
				user.getRoles());
	}

}
