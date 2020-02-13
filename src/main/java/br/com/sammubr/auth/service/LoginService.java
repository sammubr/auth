package br.com.sammubr.auth.service;

import br.com.sammubr.auth.entity.Authority;
import br.com.sammubr.auth.entity.OrganizationEntity;
import br.com.sammubr.auth.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final UserService userService;
    private final OrganizationService organizationService;

    public UserEntity register(String username, String password, String organization) {

        OrganizationEntity organizationEntity = this.organizationService.create(OrganizationEntity.builder()
                .description(organization)
                .build());

        UserEntity user = UserEntity.builder()
                .username(username)
                .password(new BCryptPasswordEncoder().encode(password))
                .authorities(Arrays.asList(Authority.ADMIN, Authority.USER))
                .accountNonExpired(true)
                .accountNonLocked(true)
                .credentialsNonExpired(true)
                .enabled(true)
                .organizations(Collections.singletonList(organizationEntity.getId()))
                .build();

        return this.userService.save(user);

    }

}
