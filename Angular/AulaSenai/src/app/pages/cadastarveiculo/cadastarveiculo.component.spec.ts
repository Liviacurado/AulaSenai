import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CadastarveiculoComponent } from './cadastarveiculo.component';

describe('CadastarveiculoComponent', () => {
  let component: CadastarveiculoComponent;
  let fixture: ComponentFixture<CadastarveiculoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CadastarveiculoComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CadastarveiculoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
