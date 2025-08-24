package com.tnsif.placement.placementSer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tnsif.placement.placementSer.entity.Placement;

@Repository
public interface PlacementRepository extends JpaRepository<Placement, Long> {
}

