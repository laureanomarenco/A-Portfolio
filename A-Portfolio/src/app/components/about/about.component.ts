import { Component, OnInit } from '@angular/core';
import { observable } from 'rxjs';
import { DataPortfolioService } from 'src/app/services/data-portfolio.service';
import {  faEdit  }  from '@fortawesome/free-solid-svg-icons';
import { FormControlDirective, NgModel } from '@angular/forms';
import { FormControl } from '@angular/forms';
import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';
import { Person } from 'src/app/services/person/person';
import { PersonService } from 'src/app/services/person/person.service';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.css']
})

export class AboutComponent implements OnInit {
  closeResult= ''
  faEdit = faEdit;
  person:Person[];

  constructor(private personService:PersonService, private modalService: NgbModal) {}

  ngOnInit(): void {
    this.personService.get().subscribe((pers: Person[]) =>
      this.person=pers);
  }

  open(content:any) {
    this.modalService.open(content, {ariaLabelledBy: 'modal-basic-title'}).result.then((result) => {
      this.closeResult = `Closed with: ${result}`;
    }, (reason) => {
      this.closeResult = `Dismissed ${this.getDismissReason(reason)}`;
    });
  }
    private getDismissReason(reason: any): string {
      if (reason === ModalDismissReasons.ESC) {
        return 'by pressing ESC';
      } else if (reason === ModalDismissReasons.BACKDROP_CLICK) {
        return 'by clicking on a backdrop';
      } else {
        return `with: ${reason}`;
      }
  }
}