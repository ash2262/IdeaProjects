package com.example.ecom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ecom.models.Preference;

@Repository
public interface PreferencesRepository extends JpaRepository<Preference, Integer>{
}
