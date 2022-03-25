import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Education } from './education';

@Injectable({
  providedIn: 'root'
})
export class EducationService {

  private url:string="https://laureanomarencop.herokuapp.com/vieweducation";

  constructor( private http:HttpClient ) { 

  }
  
  get(): any {
    return this.http.get(this.url);
  }
}
