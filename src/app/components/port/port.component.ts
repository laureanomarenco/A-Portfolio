import { Component, OnInit } from '@angular/core';
import { observable } from 'rxjs';
import { DataPortfolioService } from 'src/app/services/data-portfolio.service';

@Component({
  selector: 'app-port',
  templateUrl: './port.component.html',
  styleUrls: ['./port.component.css']
})
export class PortComponent implements OnInit {
  myPortfolio:any;
  constructor(private datos:DataPortfolioService) { }

  ngOnInit(): void {
    this.datos.obtenerDatos().subscribe(data =>
      this.myPortfolio=data);
  }

}
