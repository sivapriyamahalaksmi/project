import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Quiz } from '../quiz';
import { QuizService } from '../quiz.service';

@Component({
  selector: 'app-addquiz',
  templateUrl: './addquiz.component.html',
  styleUrls: ['./addquiz.component.css']
})
export class AddquizComponent implements OnInit {

 
  public quiz: Quiz;
  constructor(private service: QuizService, private router: Router) {
    this.quiz = new Quiz();
  }

  addQuiz() {
    this.service.addQuiz(this.quiz).subscribe(data => {
      this.quiz = new Quiz();
      alert("Added successfully");
      this.router.navigate(['/'])
    });


};
ngOnInit() {
}

}
