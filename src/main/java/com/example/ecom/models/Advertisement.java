package com.example.ecom.models;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Advertisement extends BaseModel{
    private String name;
    private String description;
    private Preference preference;
}
