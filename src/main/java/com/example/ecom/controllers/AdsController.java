package com.example.ecom.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecom.dtos.GetAdvertisementForUserRequestDto;
import com.example.ecom.dtos.GetAdvertisementForUserResponseDto;
import com.example.ecom.dtos.ResponseStatus;
import com.example.ecom.models.Advertisement;
import com.example.ecom.services.AdsService;

@Controller
public class AdsController {

    AdsService adsService;

    @Autowired
    public AdsController(AdsService adsService) {
        this.adsService=adsService;
    }

    public GetAdvertisementForUserResponseDto getAdvertisementForUser(GetAdvertisementForUserRequestDto requestDto){
        GetAdvertisementForUserResponseDto responseDto=new GetAdvertisementForUserResponseDto();
        try{
            Advertisement advertisement=adsService.getAdvertisementForUser(requestDto.getUserId());
            ResponseStatus responseStatus=ResponseStatus.SUCCESS;
            responseDto.setAdvertisement(advertisement);
            responseDto.setResponseStatus(responseStatus);
        }
        catch(Exception ex){
            ResponseStatus responseStatus=ResponseStatus.FAILURE;
            responseDto.setResponseStatus(responseStatus);
        }
        return responseDto;
    }
}
