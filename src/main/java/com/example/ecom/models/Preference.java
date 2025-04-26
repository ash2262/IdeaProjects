package com.example.ecom.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import jakarta.persistence.Entity;


@Data
@EqualsAndHashCode(callSuper=true)
@Entity
public class Preference extends BaseModel{
    private String category;
    private String description;
    private Date createdAt;
}
