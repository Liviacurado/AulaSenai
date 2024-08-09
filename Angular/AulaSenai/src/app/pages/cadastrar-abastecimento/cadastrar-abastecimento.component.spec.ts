import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CadastrarAbastecimentoComponent } from './cadastrar-abastecimento.component';

describe('CadastrarAbastecimentoComponent', () => {
  let component: CadastrarAbastecimentoComponent;
  let fixture: ComponentFixture<CadastrarAbastecimentoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CadastrarAbastecimentoComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CadastrarAbastecimentoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
