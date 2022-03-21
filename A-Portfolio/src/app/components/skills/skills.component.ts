import { Component, OnInit } from '@angular/core';
import { observable } from 'rxjs';
import { DataPortfolioService } from 'src/app/services/data-portfolio.service';
import { faEdit } from '@fortawesome/free-solid-svg-icons';
import { SkillsService } from 'src/app/services/skills/skills.service';
import { Skills } from 'src/app/services/skills/skills';

@Component({
  selector: 'app-skills',
  templateUrl: './skills.component.html',
  styleUrls: ['./skills.component.css']
})
export class SkillsComponent implements OnInit {
  
  skills : Skills[];

  constructor(private skillsService:SkillsService) { }

  ngOnInit(): void {
    this.skillsService.get().subscribe((sk : Skills[]) =>
      this.skills=sk);
   }
   faEdit = faEdit;
} 
