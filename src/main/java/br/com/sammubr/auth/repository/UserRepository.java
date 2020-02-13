package br.com.sammubr.auth.repository;

import br.com.sammubr.auth.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserEntity, String> {

    UserEntity findOneByUsername(String username);
}

