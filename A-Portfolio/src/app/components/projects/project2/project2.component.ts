import { Component, OnInit } from '@angular/core';
import { NavbarComponent } from '../../navbar/navbar.component';

@Component({
  selector: 'app-project2',
  templateUrl: './project2.component.html',
  styleUrls: ['./project2.component.css']
})
export class Project2Component implements OnInit {

  pdfFilePath = "https://drive.google.com/file/d/1PGhp_QwtEDw3DoW7-4gopjSWbboqIdSc/view?usp=sharing"

  constructor() { }

  ngOnInit(): void {
  }

}
