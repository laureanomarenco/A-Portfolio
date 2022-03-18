import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Skills } from '../skills/skills';

@Injectable({
  providedIn: 'root'
})
export class LenguajesService {

  private url:string="http://localhost:8080/viewlenguajes";

  constructor( private http:HttpClient ) {

   }

   get(): any {
    return this.http.get(this.url);
  }
}
