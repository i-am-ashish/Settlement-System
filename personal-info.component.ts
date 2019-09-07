import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-personal-info',
  templateUrl: './personal-info.component.html',
  styleUrls: ['./personal-info.component.css']
})


export class PersonalInfoComponent implements OnInit {

 personalInfos= [  
   {"clientId":"10", "email":"citi@citi.com", "mobile":"9900000000", "Address":"CitiCorp Pune"}
];
 


  constructor() {
    
   }
  ngOnInit(){}
  
}
