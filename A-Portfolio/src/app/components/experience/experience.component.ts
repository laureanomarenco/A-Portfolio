import { Component, OnInit } from '@angular/core';
import { observable } from 'rxjs';
import { faEdit } from '@fortawesome/free-solid-svg-icons';
import { ExperienceService } from 'src/app/services/experience/experience.service';
import { Experience } from 'src/app/services/experience/experience';

@Component({
  selector: 'app-experience',
  templateUrl: './experience.component.html',
  styleUrls: ['./experience.component.css']
})
export class ExperienceComponent implements OnInit {

  experience: Experience[];

  constructor(private experienceService:ExperienceService) { 

  }

  ngOnInit(): void {
    this.experienceService.get().subscribe((exp: Experience[]) =>
      this.experience=exp);
   }
   faEdit = faEdit;
} 