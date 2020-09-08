import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup} from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent  {
  constructor(private _fb : FormBuilder) {}
  loginForm : FormGroup = this._fb.group({
    userId : [''], password : ['']
  });
  
  signIn() : void {
    console.log(this.loginForm.value);
    this.loginForm.setValue({userId:[''], password : ['']});
  }
}
