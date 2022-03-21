import { Component, OnInit } from '@angular/core';
import { faEdit } from '@fortawesome/free-solid-svg-icons';
import { DataPortfolioService } from 'src/app/services/data-portfolio.service';
import { Projects } from 'src/app/services/projects/projects';
import { ProjectsService } from 'src/app/services/projects/projects.service';

@Component({
  selector: 'app-projects',
  templateUrl: './projects.component.html',
  styleUrls: ['./projects.component.css']
})

export class ProjectsComponent implements OnInit {

  projects : Projects[];

  constructor(private projectsService:ProjectsService) { }

  ngOnInit(): void {
    this.projectsService.get().subscribe((pj: Projects[]) =>
      this.projects=pj);
   }
   faEdit = faEdit;
} 
