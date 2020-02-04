import { Component } from '@angular/core';
import { MyserviceService } from './myservice.service';
import { Http } from '@angular/http';
import 'rxjs/add/operator/map';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Angular';
  searchparam=4;
  jsondata;
  name;
  address;
  months = ["January", "Feburary", "March", "April", "May", 
  "June", "July", "August", "September",
  "October", "November", "December"];
  isavailable=true;
  myClickFunction(event) { 
    //just added console.log which will display the event details in browser on click of the button.
    alert("Button is clicked");
    console.log(event);
  }
  changemonths(event) {
    alert("Changed month from the Dropdown");
 }
 /*todaydate;
   constructor(private myservice: MyserviceService) {}
   ngOnInit() {
      this.todaydate = this.myservice.showTodayDate();
   }*/
   constructor(private http: Http) { }
   ngOnInit() {
      this.http.get("http://jsonplaceholder.typicode.com/users?id="+this.searchparam).
      map(
         (Response) => Response.json()
      ).
      subscribe((data) =>this.converttoarray(data))
   }
  converttoarray(data) {
      console.log(data);
      this.name = data[0].name;
   }
   onClickSubmit(data) {
      alert("Entered Email id : " + data.emailid);
   }
}

