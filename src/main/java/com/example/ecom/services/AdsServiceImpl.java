package com.example.ecom.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.ecom.exceptions.UserNotFoundException;
import com.example.ecom.models.Advertisement;
import com.example.ecom.models.Preference;
import com.example.ecom.models.User;
import com.example.ecom.repositories.AdvertisementRepository;
import com.example.ecom.repositories.PreferencesRepository;
import com.example.ecom.repositories.UserRepository;

@Service
public class AdsServiceImpl implements AdsService {

    private final UserRepository userRepository;
    private final PreferencesRepository preferencesRepository;
    private final AdvertisementRepository advertisementRepository;

    public AdsServiceImpl(UserRepository userRepository, PreferencesRepository preferencesRepository, AdvertisementRepository advertisementRepository) {
        this.userRepository = userRepository;
        this.preferencesRepository = preferencesRepository;
        this.advertisementRepository = advertisementRepository;
    }

    public Advertisement getAdvertisementForUser(int userId) throws UserNotFoundException {
        Optional<User> optionalUser = userRepository.findById(userId);
        if (optionalUser.isEmpty()) {
            throw new UserNotFoundException("user not found!");
        }
        User user = optionalUser.get();

        List<Preference> userPreferences = user.getPreferences();
        for (Preference preference : userPreferences) {
            Optional<Advertisement> optionalAdvertisement = advertisementRepository.findByPreference(preference);
            if (optionalAdvertisement.isPresent()) {
                return optionalAdvertisement.get();
            }
        }

        List<Advertisement> advertisements = advertisementRepository.findAll();
        return advertisements.isEmpty() ? null : advertisements.get(0);
    }
}