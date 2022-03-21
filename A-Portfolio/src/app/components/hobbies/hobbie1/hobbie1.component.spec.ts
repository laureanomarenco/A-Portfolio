import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Hobbie1Component } from './hobbie1.component';

describe('Hobbie1Component', () => {
  let component: Hobbie1Component;
  let fixture: ComponentFixture<Hobbie1Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ Hobbie1Component ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(Hobbie1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
