import { Component, OnInit } from '@angular/core';
import { observable } from 'rxjs';
import { DataPortfolioService } from 'src/app/services/data-portfolio.service';

@Component({
  selector: 'app-education',
  templateUrl: './education.component.html',
  styleUrls: ['./education.component.css']
})
export class EducationComponent implements OnInit {
  educationList:any;
  constructor(private datos:DataPortfolioService) { }

  ngOnInit(): void {
    this.datos.obtenerDatos().subscribe(data =>
      this.educationList=data.education);
   }
} 
