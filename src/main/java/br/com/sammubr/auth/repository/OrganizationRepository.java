package br.com.sammubr.auth.repository;

import br.com.sammubr.auth.entity.OrganizationEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends MongoRepository<OrganizationEntity, String> {

}

