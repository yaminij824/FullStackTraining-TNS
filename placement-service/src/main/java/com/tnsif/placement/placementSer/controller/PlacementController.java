package com.tnsif.placement.placementSer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.placement.placementSer.entity.Placement;
import com.tnsif.placement.placementSer.service.PlacementService;

@RestController
@RequestMapping("/placements")
public class PlacementController {

    @Autowired
    private PlacementService placementService;

    @GetMapping
    public List<Placement> getAllPlacements() {
        return placementService.getAllPlacements();
    }

    @PostMapping
    public Placement addPlacement(@RequestBody Placement placement) {
        return placementService.addPlacement(placement);
    }

    }


