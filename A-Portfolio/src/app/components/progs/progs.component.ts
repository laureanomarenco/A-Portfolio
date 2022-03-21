import { Component, OnInit } from '@angular/core';
import { observable } from 'rxjs';
import { DataPortfolioService } from 'src/app/services/data-portfolio.service';
import {faEdit}  from '@fortawesome/free-solid-svg-icons';
import { Lenguajes } from 'src/app/services/lenguajes/lenguajes';
import { LenguajesService } from 'src/app/services/lenguajes/lenguajes.service';

@Component({
  selector: 'app-progs',
  templateUrl: './progs.component.html',
  styleUrls: ['./progs.component.css']
})
export class ProgsComponent implements OnInit {

  lenguajes: Lenguajes[];

  constructor(private lenguajesServices:LenguajesService) { }

  ngOnInit(): void {
    this.lenguajesServices.get().subscribe((leng : Lenguajes[]) =>
      this.lenguajes=leng);
   }
   faEdit = faEdit;
} 

