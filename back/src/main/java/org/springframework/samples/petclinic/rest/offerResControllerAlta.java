package org.springframework.samples.petclinic.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.samples.petclinic.model.Offer;
import org.springframework.samples.petclinic.service.OfferService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class offerResControllerAlta{

	
	@Autowired
	private OfferService offerService;
	
	@RequestMapping(method= RequestMethod.POST)
	public ResponseEntity<Offer> insertar(@RequestBody @Valid Offer offer) {
		
		BindingErrorsResponse errors = new BindingErrorsResponse();
		HttpHeaders headers = new HttpHeaders();
		if	(offer.getId()==null) {
		 
		 this.offerService.update(offer);
		 return new ResponseEntity<Offer>(offer,headers,HttpStatus.CREATED);
		 
	 }
		headers.add("error", errors.toJSON());
		return new ResponseEntity<Offer>(headers,HttpStatus.BAD_REQUEST);
		
		
		
	}
	
	
}
