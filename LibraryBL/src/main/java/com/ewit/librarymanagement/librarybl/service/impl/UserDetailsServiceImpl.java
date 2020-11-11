package com.ewit.librarymanagement.librarybl.service.impl;

import com.ewit.librarymanagement.librarymodel.models.User;
import com.ewit.librarymanagement.libraryrepository.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> userOptional = repository.findByName(username);
        User user = userOptional.orElseThrow(()-> new UsernameNotFoundException(" No user with user name "+username+" found"));
        return new org.springframework.security.core.userdetails.User(
                user.getName(), user.getPassword(),
               true, true, true,
                true,getAuthorities("ADMIN"));
    }

    private Collection<? extends GrantedAuthority> getAuthorities(String role) {
        return Collections.singletonList(new SimpleGrantedAuthority(role));
    }
}
