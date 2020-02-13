package br.com.sammubr.auth.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.List;

@Document(value = "user")
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@CompoundIndexes({
        @CompoundIndex(name = "user_username", def = "{'username' : 1}", unique = true)
})
public class UserEntity extends AbstractEntity {

    @NotNull
    boolean accountNonExpired;

    @NotNull
    boolean accountNonLocked;

    @NotNull
    boolean credentialsNonExpired;

    @NotNull
    boolean enabled;

    @NotNull
    private String username;

    @NotNull
    private String password;

    @NotNull
    private List<Authority> authorities;

    @NotNull
    private List<String> organizations;

}

