import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-settlement-details',
  templateUrl: './settlement-details.component.html',
  styleUrls: ['./settlement-details.component.css']
})
export class SettlementDetailsComponent implements OnInit {
client=[
  { "nettedAmt":2000, "netTradedAmt":"300000", "settlementCost":100}
];

nettedShares= [
  {"share":"Apple", "Qtyowed":"100"},
  {"share":"Infosys", "Qtyowed":"-200"},
  {"share":"Microsoft", "Qtyowed":"1500"},
  {"share":"Ibulls", "Qtyowed":"-5100"},
  {"share":"LT", "Qtyowed":"105"}
];
cols=[
  {field:'share', header:"Stock Name"},
  {field:'Qtyowed', header:"Quantity Owed"},
 
];
 

  
  constructor() { }

  ngOnInit() {
  }

}
