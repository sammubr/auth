package br.com.sammubr.auth.service;

import br.com.sammubr.auth.entity.UserEntity;
import br.com.sammubr.auth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntity findOneByUsername(String username) {
        return this.userRepository.findOneByUsername(username);
    }

    UserEntity save(UserEntity usuarioNovo) {
        return this.userRepository.save(usuarioNovo);
    }
}

