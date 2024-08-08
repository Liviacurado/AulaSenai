import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit{
  constructor(){}

  public modelo = '';

  ngOnInit(): void {
      
  }
  title = 'AulaSenai';

  Enviar(inputModelo:String){ 
    
    alert ('OPA '+inputModelo+ ' foi cadastrado');
  }
  
   soma (a:String,b:String){
    let numA = Number (a);
    let numB = Number (b);
    return numA + numB;
   }
  
}
