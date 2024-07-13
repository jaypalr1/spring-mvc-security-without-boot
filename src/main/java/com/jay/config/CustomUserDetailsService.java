package com.jay.config;

import com.jay.user.AppUsers;
import java.util.Collections;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Slf4j
public class CustomUserDetailsService implements UserDetailsService {

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    return AppUsers.builder()
        .username("u")
        .password("$2a$10$g.PkHyPh3xZYAS5vsQEFd.1CqRdS4h4yimvqwq8IJB71xl0VQA8fq")
        .authorities(Collections.singleton("ROLE_USER"))
        .enabled(true)
        .accountNonLocked(true)
        .accountNonExpired(true)
        .credentialsNonExpired(true)
        .build();
  }
}
