package com.polytechnic.climbing.controllers;

import com.polytechnic.climbing.models.crag.CragDto;
import com.polytechnic.climbing.services.crag.CragService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CragController {

    @Autowired
    private CragService cragService;

    @GetMapping("/crag/{cragId}")
    public CragDto getCragById(@PathVariable Long cragId) {
        return cragService.getById(cragId);
    }
}
