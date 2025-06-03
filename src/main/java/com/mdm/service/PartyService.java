package com.mdm.service;

import org.springframework.stereotype.Service;

@Service
public class PartyService {

    public String getPartyById(String id) {
        // Mock SIF SOAP call to retrieve party details
        return "Retrieved Party with ID: " + id;
    }
}
