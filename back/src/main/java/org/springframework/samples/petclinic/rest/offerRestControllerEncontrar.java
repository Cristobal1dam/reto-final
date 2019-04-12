package org.springframework.samples.petclinic.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.samples.petclinic.model.Offer;
import org.springframework.samples.petclinic.service.OfferService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class offerRestControllerEncontrar {

	@Autowired
	private OfferService offerService;
	
	@RequestMapping(value = "/{offerId}", method= RequestMethod.GET)
	public ResponseEntity<Offer>getPet(@PathVariable("offerID") int offerId){
		Offer offer = this.offerService.findById(offerId);
		if(offer==null) {
			
			return new ResponseEntity<Offer>( HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Offer>(offer, HttpStatus.OK);
	}
	
}
