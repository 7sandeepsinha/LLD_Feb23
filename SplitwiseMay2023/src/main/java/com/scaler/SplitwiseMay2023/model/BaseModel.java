package com.scaler.SplitwiseMay2023.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //Auditing fields
    @CreatedDate
    private Date createdDate;

    @LastModifiedDate
    private Date updatedDate;

//    private User createdBy;
//    private User updatedBy;

}
