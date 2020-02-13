package br.com.sammubr.auth.service;

import br.com.sammubr.auth.entity.OrganizationEntity;
import br.com.sammubr.auth.exception.CreateEntityIdNotNullException;
import br.com.sammubr.auth.exception.RecordsNotFoundException;
import br.com.sammubr.auth.exception.UpdateEntityIdDiferentException;
import br.com.sammubr.auth.exception.UpdateEntityIdNullException;
import br.com.sammubr.auth.repository.OrganizationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrganizationService {

    private final OrganizationRepository organizationRepository;

    OrganizationEntity create(OrganizationEntity entity) {

        if (entity.getId() != null) {
            throw new CreateEntityIdNotNullException();
        }
        return this.organizationRepository.save(entity);

    }

    OrganizationEntity update(String id, OrganizationEntity entity) {

        if (entity.getId() == null) {
            throw new UpdateEntityIdNullException();
        }

        if (!id.equals(entity.getId())) {
            throw new UpdateEntityIdDiferentException();
        }

        if (this.existsById(id)) {
            return this.organizationRepository.save(entity);
        } else {
            throw new RecordsNotFoundException(id);
        }

    }

    private Boolean existsById(String id) {
        return this.organizationRepository.existsById(id);
    }

    OrganizationEntity findById(String id) {
        return this.organizationRepository.findById(id)
                .orElseThrow(RecordsNotFoundException::new);
    }
}

