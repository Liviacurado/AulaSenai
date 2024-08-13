import { Component } from '@angular/core';

@Component({
  selector: 'app-cadastrar-abastecimento',
  standalone: true,
  imports: [],
  templateUrl: './cadastrar-abastecimento.component.html',
  styleUrl: './cadastrar-abastecimento.component.css'
})
export class CadastrarAbastecimentoComponent {
  displaymessage (tipo:String,msg:String){
    alert(tipo + ' '+ msg +'foi cadastrado')
  }

}
