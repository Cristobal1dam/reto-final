package org.springframework.samples.petclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.samples.petclinic.model.Offer;

public interface OfferRepository extends JpaRepository<Offer, Integer>{
	
}
