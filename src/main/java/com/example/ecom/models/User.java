package com.example.ecom.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

import org.hibernate.type.TrueFalseConverter;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class User extends BaseModel{
    private String name;
    private String email;
    
    @OneToMany(fetch = FetchType.LAZY)
    private List<Preference> preferences;
}
