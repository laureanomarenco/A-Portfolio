import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProgsComponent } from './progs.component';

describe('ProgsComponent', () => {
  let component: ProgsComponent;
  let fixture: ComponentFixture<ProgsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProgsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ProgsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
