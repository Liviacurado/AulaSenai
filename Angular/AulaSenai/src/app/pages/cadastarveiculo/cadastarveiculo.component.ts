import { Component } from '@angular/core';

@Component({
  selector: 'app-cadastarveiculo',
  standalone: true,
  imports: [],
  templateUrl: './cadastarveiculo.component.html',
  styleUrl: './cadastarveiculo.component.css'
})
export class CadastarveiculoComponent  {
   
    constructor(){
    }
    ngOnInit(): void {
  
    }
    title = 'senai';
  
    displayMessage(msg: String) { 
      alert('O carro com a placa ' + msg + ' foi cadastrado!'); }
  
  
    soma(a: String, b: String){
      let numA = Number(a);
      let numB = Number(b);
      return numA + numB;
    }
  }

