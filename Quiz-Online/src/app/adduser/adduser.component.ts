import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../user';
import { UserService } from '../user.service';
import {FormGroup, FormControl, FormBuilder,Validators,FormsModule,ReactiveFormsModule} from '@angular/forms'

@Component({
  selector: 'app-adduser',
  templateUrl: './adduser.component.html',
  styleUrls: ['./adduser.component.css']
})
export class AdduserComponent implements OnInit 
{
  registerForm: FormGroup;
  submitted = false;

  public user: User;
  constructor(private service: UserService, private router: Router,private formBuilder: FormBuilder) {
    this.user = new User();
  }

  get f() { return this.registerForm.controls; }
  // addUser() {
  //   this.service.addUser(this.user).subscribe(data => {
  //     this.user = new User();
  //     alert("Registered successfully");
  //     this.router.navigate(['/'])
  //   });


// };
onclick(){
  this.submitted = true;

  
  if (this.registerForm.invalid) {
    alert("please fill all the fields with proper mail id and password with min of six characters");
      return;
  }

  if(this.registerForm.valid){
  
        this.user = new User();
        alert("Registered successfully");
        this.router.navigate(['/']);
        }
      
}

ngOnInit() {
  this.registerForm  = this.formBuilder.group({
    fname: ['', Validators.required],
    lname: ['', Validators.required],
    mailId: ['', [Validators.required, Validators.email,Validators.pattern('^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$')]],
    uname: ['', Validators.required],
    pwd: ['', [Validators.required, Validators.minLength(6)]]
});



}


}
