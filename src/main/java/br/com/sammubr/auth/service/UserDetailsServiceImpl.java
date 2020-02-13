package br.com.sammubr.auth.service;

import br.com.sammubr.auth.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetailsImpl loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = this.userService.findOneByUsername(username);
        if (userEntity == null) {
            throw new UsernameNotFoundException("Usuário não encontrado");
        }

        return new UserDetailsImpl(userEntity.getUsername(), "{bcrypt}" + userEntity.getPassword(), userEntity.isEnabled(), userEntity.isAccountNonExpired(),
                userEntity.isCredentialsNonExpired(), userEntity.isAccountNonLocked(), userEntity.getAuthorities().stream()
                .map(authority -> new SimpleGrantedAuthority(authority.toString()))
                .collect(Collectors.toList()), userEntity.getOrganizations());
    }

}
