import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../user';
import { UserService } from '../user.service';

@Component({
  selector: 'app-validateuser',
  templateUrl: './validateuser.component.html',
  styleUrls: ['./validateuser.component.css']
})
export class ValidateuserComponent {

 
  private user: User;
  private uname:string;
  private pwd:string;
  constructor(private service: UserService, private router: Router) {
    }

  validateUser() {
    this.service.validateUser(this.uname,this.pwd).subscribe(data => {
      this.user = data;
     
            },err => {
             
              
      alert(JSON.stringify(err.error.text));
      // console.log(JSON.stringify(err));
      this.router.navigate(['/addquiz']);
      })


     }


}
