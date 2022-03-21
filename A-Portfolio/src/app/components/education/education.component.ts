import { Component, OnInit } from '@angular/core';
import { observable } from 'rxjs';
import { faEdit }  from '@fortawesome/free-solid-svg-icons';
import { EducationService } from 'src/app/services/education/education.service';
import { Education } from 'src/app/services/education/education';

@Component({
  selector: 'app-education',
  templateUrl: './education.component.html',
  styleUrls: ['./education.component.css']
})
export class EducationComponent implements OnInit {

  education: Education[];

  constructor(private educationService:EducationService) { 

  }

  ngOnInit(): void {
    this.educationService.get().subscribe((ed: Education[]) =>
      this.education=ed);
   }
   faEdit= faEdit;
} 
