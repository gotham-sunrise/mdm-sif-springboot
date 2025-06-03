package com.mdm.controller;

import com.mdm.service.PartyService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/party")
public class PartyController {

    private final PartyService partyService;

    public PartyController(PartyService partyService) {
        this.partyService = partyService;
    }

    @GetMapping("/{id}")
    public String getParty(@PathVariable String id) {
        return partyService.getPartyById(id);
    }
}
