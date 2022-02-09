import { Component, OnInit } from '@angular/core';
import { AuthService } from 'src/app/services/auth.service';
import { FormsModule, FormBuilder, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  form:FormGroup;

    email = '';
    password = '';

  constructor(private authService: AuthService, private formBuilder: FormBuilder) { 
    this.form = this.formBuilder.group({
      password:['',[]],
      mail:['',[]] 
    })
  }

  logIn(){
    //if login true
    this.authService.login(this.email, this.password)
  }

  ngOnInit(): void {
  }

}
