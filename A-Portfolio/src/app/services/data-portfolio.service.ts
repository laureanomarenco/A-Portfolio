import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DataPortfolioService {

  constructor(private http:HttpClient) { }

    obtenerDatos():Observable<any>{
      return this.http.get('assets/data/dataPortfolio.json')
    }

}
