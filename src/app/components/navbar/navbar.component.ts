import { Component, OnInit } from '@angular/core';
import { DataPortfolioService } from 'src/app/services/data-portfolio.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  constructor(private data:DataPortfolioService) { }

  ngOnInit(): void {
    this.data.obtenerDatos();
  }
}
