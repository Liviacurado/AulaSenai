import { NgModule } from '@angular/core';
import {Routes,RouterModule}from'@angular/router';
import { MenuComponent } from './pages/menu/menu.component';
import { CadastarveiculoComponent } from './pages/cadastarveiculo/cadastarveiculo.component';
import { CadastrarAbastecimentoComponent } from './pages/cadastrar-abastecimento/cadastrar-abastecimento.component';
import { ListarveiculosComponent } from './pages/listarveiculos/listarveiculos.component';
import { CadastrardespesaComponent } from './pages/cadastrardespesa/cadastrardespesa.component';

export const routes: Routes = [
   { path: '', component: MenuComponent},
   { path:'cadastarveiculo',component:CadastarveiculoComponent},
   {path:'cadastrarabastecimento',component:CadastrarAbastecimentoComponent},
   {path:'listarveiculos',component:ListarveiculosComponent},
   {path:'cadastrardespesa',component:CadastrardespesaComponent}
];
@NgModule({
imports:[RouterModule.forRoot (routes)],
exports:[RouterModule]
})
export class AppRoutingModule{}