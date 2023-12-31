package com.gutinhotech.gutodelivery.domain.entity;

import java.time.OffsetDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Category {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    
    public Category(final String name) {
        this.name = name;
        this.createdAt = OffsetDateTime.now();
    }

}
