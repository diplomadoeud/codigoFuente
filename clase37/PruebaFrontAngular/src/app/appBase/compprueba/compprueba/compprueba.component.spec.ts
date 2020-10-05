import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ComppruebaComponent } from './compprueba.component';

describe('ComppruebaComponent', () => {
  let component: ComppruebaComponent;
  let fixture: ComponentFixture<ComppruebaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ComppruebaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ComppruebaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
