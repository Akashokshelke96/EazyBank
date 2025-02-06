package com.eazybytes.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@MappedSuperclass
@Getter @Setter @ToString
public class BaseEntity {

    @Column(updatable = false)//values are not updated with next insertion
    private LocalDate createdAt;

    @Column(updatable = false)
    private String createdBy;

    @Column(insertable = false)//values are not populated at the time of insertion
    private LocalDate updatedAt;

    @Column(insertable = false)
    private String updatedBy;

}
