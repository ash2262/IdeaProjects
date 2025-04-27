package com.example.ecom.services;

import org.springframework.stereotype.Service;

import com.example.ecom.exceptions.UserNotFoundException;
import com.example.ecom.models.Advertisement;

@Service
public interface AdsService {
    public Advertisement getAdvertisementForUser(int userId) throws UserNotFoundException;
}
