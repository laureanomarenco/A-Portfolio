import { Component, OnInit } from '@angular/core';
import { observable } from 'rxjs';
import { DataPortfolioService } from 'src/app/services/data-portfolio.service';

@Component({
  selector: 'app-progs',
  templateUrl: './progs.component.html',
  styleUrls: ['./progs.component.css']
})
export class ProgsComponent implements OnInit {
  progsList:any;
  constructor(private datos:DataPortfolioService) { }

  ngOnInit(): void {
    this.datos.obtenerDatos().subscribe(data =>
      this.progsList=data.progs);
   }
} 

