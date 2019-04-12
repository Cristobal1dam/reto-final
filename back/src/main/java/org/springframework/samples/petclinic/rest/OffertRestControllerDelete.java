package org.springframework.samples.petclinic.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.samples.petclinic.model.Offer;
import org.springframework.samples.petclinic.service.OfferService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/offer")
public class OffertRestControllerDelete {

	@Autowired
	private OfferService offser;
	
	@RequestMapping(value = "/{idOffer}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Void> deleteOffer(@PathVariable("idOffer") int idOffer){
		
		Offer offer = this.offser.findById(idOffer);
		
		if(offer == null){
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		
		this.offser.delete(idOffer);
		
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
}
