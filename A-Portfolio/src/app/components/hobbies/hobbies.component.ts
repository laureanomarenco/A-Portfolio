import { Component, OnInit } from '@angular/core';
import { faEdit } from '@fortawesome/free-solid-svg-icons';
import { DataPortfolioService } from 'src/app/services/data-portfolio.service';
import { Hobbies } from 'src/app/services/hobbies/hobbies';
import { HobbiesService } from 'src/app/services/hobbies/hobbies.service';

@Component({
  selector: 'app-hobbies',
  templateUrl: './hobbies.component.html',
  styleUrls: ['./hobbies.component.css']
})
export class HobbiesComponent implements OnInit {

  hobbies : Hobbies[];

  constructor(private hobbiesService:HobbiesService) { }

  ngOnInit(): void {
    this.hobbiesService.get().subscribe((hb : Hobbies[]) =>
      this.hobbies=hb);
   }
   faEdit = faEdit;
} 

