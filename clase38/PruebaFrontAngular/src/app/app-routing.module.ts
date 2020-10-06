import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {AppprincComponent} from './appBase/princ/appprinc.component';
import {BlankComponent} from './formas/blank';
import {PaisesComponent} from './formas/paises';
import {HomeGuard, LoginGuard} from './guards';
import {LoginComponent} from './formas/login';

export const routes: Routes = [
  {

    path: '', component: AppprincComponent,
    children: [
      {path: 'paises', component: PaisesComponent, canActivate: [LoginGuard]},
      {path: '', component: BlankComponent, canActivate: [LoginGuard, HomeGuard]}]

  },
  {path: 'login', component: LoginComponent, canActivate: []},
  {path: '**', redirectTo: ''}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
