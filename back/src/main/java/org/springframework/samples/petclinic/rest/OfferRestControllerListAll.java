package org.springframework.samples.petclinic.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.samples.petclinic.model.Offer;
import org.springframework.samples.petclinic.service.OfferService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class OfferRestControllerListAll {

	@Autowired
	OfferService offerService;
	
	@RequestMapping(value = "/offers", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Collection<Offer>> getOffers(){
		Collection<Offer> col = offerService.findAll();
		return new ResponseEntity<Collection<Offer>>(col, HttpStatus.OK);
	}
}
