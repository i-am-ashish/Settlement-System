import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TxnTableComponent } from './txn-table.component';

describe('TxnTableComponent', () => {
  let component: TxnTableComponent;
  let fixture: ComponentFixture<TxnTableComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TxnTableComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TxnTableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
