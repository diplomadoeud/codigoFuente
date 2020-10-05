import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {AppprincComponent} from './appBase/princ/appprinc.component';
import {BlankComponent} from './formas/blank';
import {PaisesComponent} from './formas/paises';
import {AuthGuardHome} from './guards';

export const routes: Routes = [
  {

    path: '', component: AppprincComponent,
    children: [
      {path: 'enconst', component: BlankComponent, canActivate: []},
      {path: 'paisespru', component: PaisesComponent, canActivate: []},
      {path: 'paises', component: PaisesComponent, canActivate: []},
      {path: '', component: BlankComponent, canActivate: [AuthGuardHome]}]

  },
  {path: '**', redirectTo: ''}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
