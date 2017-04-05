package com.example.security;

import com.example.entity.UserDetailsImpl;
import com.example.repository.UserDetailsImplRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by piotr on 04.04.17.
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {


    @Autowired
    UserDetailsImplRepository userDetailsImplRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        return userDetailsImplRepository.findByMail(s);
    }
}
