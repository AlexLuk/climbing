package com.polytechnic.climbing.controllers;

import com.polytechnic.climbing.models.area.AreaDto;
import com.polytechnic.climbing.models.area.AreaForm;
import com.polytechnic.climbing.services.area.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class AreaController {

    @Autowired
    private AreaService areaService;

    @GetMapping("/area/{areaId}")
    public AreaDto getAreaById(@PathVariable Long areaId) {
        return areaService.getById(areaId);
    }

    @PostMapping("/area")
    public Long addArea(@RequestBody AreaForm areaForm) {
        return areaService.create(areaForm);
    }
}
