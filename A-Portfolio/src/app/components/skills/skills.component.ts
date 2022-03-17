import { Component, OnInit } from '@angular/core';
import { observable } from 'rxjs';
import { DataPortfolioService } from 'src/app/services/data-portfolio.service';
import { faEdit } from '@fortawesome/free-solid-svg-icons';

@Component({
  selector: 'app-skills',
  templateUrl: './skills.component.html',
  styleUrls: ['./skills.component.css']
})
export class SkillsComponent implements OnInit {
  skillsList:any;
  constructor(private datos:DataPortfolioService) { }

  ngOnInit(): void {
    this.datos.obtenerDatos().subscribe(data =>
      this.skillsList=data.skills);
   }
   faEdit = faEdit;
} 
