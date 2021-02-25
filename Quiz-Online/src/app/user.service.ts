import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from './user';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class UserService {
  private url:string;

  constructor(private http:HttpClient) { 
    this.url="http://localhost:9000/"
  }



  public addUser(us:User){

    return this.http.post<User>(this.url+"adduser",us);
 
   }

   public validateUser(uname:string,pwd:string):Observable<User>{

    return this.http.get<User>(this.url+"validateuser/"+uname+"/"+pwd);
 
   }



}
