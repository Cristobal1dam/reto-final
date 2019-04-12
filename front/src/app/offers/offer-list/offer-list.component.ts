import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { OfferService } from '../offer.service';
import { Offer } from '../offer';

@Component({
  selector: 'app-offer-list',
  templateUrl: './offer-list.component.html',
  styleUrls: ['./offer-list.component.css']
})
export class OfferListComponent implements OnInit {

  public offers: Array<Offer>;


  constructor(private offerService: OfferService, private router: Router) { }

  ngOnInit() {
    this.offerService.getOffers().subscribe(
      data => { this.offers = data; }
    );

   
  }

}
