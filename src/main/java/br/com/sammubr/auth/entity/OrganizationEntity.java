package br.com.sammubr.auth.entity;

import br.com.sammubr.auth.dto.Integration;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.boot.autoconfigure.mail.MailProperties;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Document(value = "organization")
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@CompoundIndexes({
        @CompoundIndex(name = "organization_description", def = "{'description' : 1}", unique = true)
})
public class OrganizationEntity extends AbstractEntity {

    @NotNull
    private String description;

    private MailProperties mailProperties;

    private Integration integration;

}
