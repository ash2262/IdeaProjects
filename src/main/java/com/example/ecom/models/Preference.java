package com.example.ecom.models;

import lombok.Data;
import lombok.EqualsAndHashCode;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Data
@EqualsAndHashCode(callSuper=true)
public class Preference extends BaseModel{
    private String category;
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id") // Ensure this column name matches your DB column.
    private User user;  // Back-reference to User
}
