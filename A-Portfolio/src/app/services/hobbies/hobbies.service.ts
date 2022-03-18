import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Hobbies } from './hobbies';

@Injectable({
  providedIn: 'root'
})
export class HobbiesService {

  private url:string="http://localhost:8080/viewhobbies";

  constructor( private http:HttpClient ) { 

  }

  get(): any {
    return this.http.get(this.url);
  }
}
