import { Component, OnInit } from '@angular/core';
import { observable } from 'rxjs';
import { DataPortfolioService } from 'src/app/services/data-portfolio.service';
import { faEdit } from '@fortawesome/free-solid-svg-icons';
import { Person } from 'src/app/services/person/person';
import { PersonService } from 'src/app/services/person/person.service';

@Component({
  selector: 'app-port',
  templateUrl: './port.component.html',
  styleUrls: ['./port.component.css']
})
export class PortComponent implements OnInit {

  person:Person[];

  constructor(private personService:PersonService) {}

  ngOnInit(): void {
    this.personService.get().subscribe((pers: Person[]) =>
      this.person=pers);
  }
  faEdit = faEdit;
}
