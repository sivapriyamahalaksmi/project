import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddquizComponent } from './addquiz/addquiz.component';
import { AdduserComponent } from './adduser/adduser.component';
import { ValidateuserComponent } from './validateuser/validateuser.component';


const routes: Routes = [
  {path:"adduser",component:AdduserComponent},
  {path:"validateuser",component:ValidateuserComponent},
  {path:"addquiz",component:AddquizComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
