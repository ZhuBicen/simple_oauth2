package com.oauthserver.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class GitBookAuthenticationManager implements AuthenticationManager {

    private Environment environment;
    GitBookAuthenticationManager(Environment environment) {
        this.environment = environment;
    }

    private Logger logger = LoggerFactory.getLogger(GitBookAuthenticationManager.class);


    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        logger.info(authentication.getPrincipal().toString() + authentication.getCredentials());
        ArrayList<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("test"));
        return new UsernamePasswordAuthenticationToken(authentication.getPrincipal(),
                authentication.getCredentials(), authorities);
    }
}


