package com.packt.example.clientauthorizationcode.security;

import com.packt.example.clientauthorizationcode.user.ClientUser;
import com.packt.example.clientauthorizationcode.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public class ClientUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository users;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<ClientUser> optionalUser = users.findByUsername(username);
        if(optionalUser.isPresent()) {
            return new ClientUserDetails(optionalUser.get());
        }
        else {
            throw new UsernameNotFoundException("invalid username or password");
        }
    }
}
