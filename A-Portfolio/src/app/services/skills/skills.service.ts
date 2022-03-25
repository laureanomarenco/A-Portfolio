import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Skills } from './skills';

@Injectable({
  providedIn: 'root'
})
export class SkillsService {

  private url:string="https://laureanomarencop.herokuapp.com/viewskills";

  constructor( private http:HttpClient ) {

   }

   get(): any {
    return this.http.get(this.url);
  }
}
