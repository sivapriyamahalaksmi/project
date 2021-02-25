import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdduserComponent } from './adduser/adduser.component';
import { ValidateuserComponent } from './validateuser/validateuser.component';
import {FormsModule,ReactiveFormsModule} from '@angular/forms';
import { UserService } from './user.service';
import {HttpClientModule} from '@angular/common/http';
import { AddquizComponent } from './addquiz/addquiz.component'
import { QuizService } from './quiz.service';



@NgModule({
  declarations: [
    AppComponent,
    AdduserComponent,
    ValidateuserComponent,
    AddquizComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [UserService,QuizService],
  bootstrap: [AppComponent]
})
export class AppModule { }
