import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-account-info',
  templateUrl: './account-info.component.html',
  styleUrls: ['./account-info.component.css']
})
export class AccountInfoComponent implements OnInit {
  
  accountInfos= [  
    {"demat":"121200000111", "fundBalance":"120000", "share":"20", "holdingValue":"100000"},
 ];
  constructor() { }

  ngOnInit() {
  }

}
