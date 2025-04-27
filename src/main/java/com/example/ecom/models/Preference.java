package com.example.ecom.models;

import lombok.Data;
import lombok.EqualsAndHashCode;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
@Data
@EqualsAndHashCode(callSuper=true)
public class Preference extends BaseModel{
    private String category;
    private String description;

    @ManyToOne
    private User user;  // Back-reference to User
}
