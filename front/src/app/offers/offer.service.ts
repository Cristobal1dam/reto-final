import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Offer } from './offer';



@Injectable({
  providedIn: 'root'
})
export class OfferService {

  constructor(private httpClient: HttpClient) { }

  getOffers(): Observable<Offer[]> {
    return this.httpClient.get<Offer[]>('http://localhost:3000/Offers');
  }
}
