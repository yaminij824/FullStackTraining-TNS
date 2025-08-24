package com.tnsif.placement.placementSer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.placement.placementSer.entity.Placement;
import com.tnsif.placement.placementSer.repository.PlacementRepository;

@Service
public class PlacementService {

    @Autowired
    private PlacementRepository placementRepository;

    public List<Placement> getAllPlacements() {
        return placementRepository.findAll();
    }

    public Placement addPlacement(Placement placement) {
        return placementRepository.save(placement);
    }
}
