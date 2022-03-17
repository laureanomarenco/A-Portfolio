import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { HomeComponent } from './components/home/home.component';
import { Project1Component } from './components/projects/project1/project1.component';
import { Project2Component } from './components/projects/project2/project2.component';
import { Project3Component } from './components/projects/project3/project3.component';
import { Hobbie1Component } from './components/hobbies/hobbie1/hobbie1.component';

const routes: Routes = [
  { 
    path:'', component:HomeComponent
  },
  {
    path:'login', component:LoginComponent
  },
  {
    path: 'project1', component:Project1Component
  },
  {
    path: 'project2', component:Project2Component
  },  
  {
    path: 'project3', component:Project3Component
  },
  {
    path: 'hobbie1', component: Hobbie1Component
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
