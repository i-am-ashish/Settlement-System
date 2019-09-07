import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-txn-table',
  templateUrl: './txn-table.component.html',
  styleUrls: ['./txn-table.component.css']
})
export class TxnTableComponent implements OnInit {

  Txn= [

    {"txn_id":1, "txn_type":"Buy", "share":"Apple", "Qty":100, "Amount":5000 },
    {"txn_id":1, "txn_type":"Buy", "share":"Apple", "Qty":100, "Amount":5000 },
    {"txn_id":1, "txn_type":"Buy", "share":"Apple", "Qty":100, "Amount":5000 },
    {"txn_id":1, "txn_type":"Buy", "share":"Apple", "Qty":100, "Amount":5000 },
    {"txn_id":1, "txn_type":"Buy", "share":"Apple", "Qty":100, "Amount":5000 },
    {"txn_id":1, "txn_type":"Buy", "share":"Apple", "Qty":100, "Amount":5000 },
    {"txn_id":1, "txn_type":"Buy", "share":"Apple", "Qty":100, "Amount":5000 },
    {"txn_id":1, "txn_type":"Buy", "share":"Apple", "Qty":100, "Amount":5000 },
    {"txn_id":1, "txn_type":"Buy", "share":"Apple", "Qty":100, "Amount":5000 },
    {"txn_id":1, "txn_type":"Buy", "share":"Apple", "Qty":100, "Amount":5000 }
  ];

  cols=[
    {field:'txn_id', header:"TXN ID"},
    {field:'txn_type', header:"BUY/SELL"},
    {field:'share', header:"STOCK"},
    {field:'Qty', header:"QUANTITY"},
    {field:'Amount', header:"AMOUNT"}
  ];

  constructor() { }

  ngOnInit() {
      
  }
}