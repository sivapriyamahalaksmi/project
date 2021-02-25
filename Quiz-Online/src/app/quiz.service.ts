import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Quiz } from './quiz';

@Injectable({
  providedIn: 'root'
})
export class QuizService {

  private url:string;

  constructor(private http:HttpClient) { 
    this.url="http://localhost:9000/"
  }



  public addQuiz(qz:Quiz){

    return this.http.post<Quiz>(this.url+"addquiz",qz);
 
   }
}
