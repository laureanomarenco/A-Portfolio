import { Component, OnInit } from '@angular/core';
import { observable } from 'rxjs';
import { DataPortfolioService } from 'src/app/services/data-portfolio.service';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.css']
})
export class AboutComponent implements OnInit {
  myPortfolio:any;
  constructor(private datos:DataPortfolioService) { }

  ngOnInit(): void {
    this.datos.obtenerDatos().subscribe(data =>
      this.myPortfolio=data);
  }
}