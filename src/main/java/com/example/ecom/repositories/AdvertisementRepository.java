package com.example.ecom.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ecom.models.Advertisement;
import com.example.ecom.models.Preference;

@Repository
public interface AdvertisementRepository extends JpaRepository<Advertisement, Integer>{
Optional<Advertisement> findByPreference(Preference preference);
}
