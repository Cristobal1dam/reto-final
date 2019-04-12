package org.springframework.samples.petclinic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Offer;
import org.springframework.samples.petclinic.repository.OfferRepository;
import org.springframework.stereotype.Service;

@Service
public class OfferService {

	@Autowired
	OfferRepository offerRepository;
	
	public List<Offer> findAll(){
		return offerRepository.findAll();
	}
	
	public Offer findById(int id) {
		return offerRepository.findOne(id);
	}
	
	public void delete(int id) {
		offerRepository.delete(id);
	}
	
	public void update(Offer offer) {
		offerRepository.save(offer);
	}
	
	public void insert(Offer offer) {
		offerRepository.save(offer);
	}
	
	
}
