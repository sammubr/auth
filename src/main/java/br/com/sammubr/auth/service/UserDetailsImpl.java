package br.com.sammubr.auth.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;
import java.util.List;

public class UserDetailsImpl extends User {

    @Getter
    @Setter
    private List<String> organizations;

    public UserDetailsImpl(String username, String password, Collection<? extends GrantedAuthority> authorities, List<String> organizations) {
        super(username, password, authorities);
        this.organizations = organizations;
    }

    UserDetailsImpl(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired,
                    boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities, List<String> organizations) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
        this.organizations = organizations;
    }

    public String toString() {
        return super.toString();
    }

}
