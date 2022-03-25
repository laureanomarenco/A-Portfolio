import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Experience } from './experience';

@Injectable({
  providedIn: 'root'
})
export class ExperienceService {

  private url:string="https://laureanomarencop.herokuapp.com/viewexperience";

  constructor( private http:HttpClient ) { 

  }

  get(): any {
    return this.http.get(this.url);
  }
}
