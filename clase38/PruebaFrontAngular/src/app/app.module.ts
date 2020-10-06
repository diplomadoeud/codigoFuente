import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {AppCargandoComponent} from './appBase/cargando/app.cargando.component';
import {AppMenuComponent, AppSubMenuComponent} from './appBase/menu/app.menu.component';
import {AppprincComponent} from './appBase/princ/appprinc.component';
import {AppSidebarComponent} from './appBase/sidebar/app.sidebar.component';
import {AppTopBarComponent} from './appBase/topbar/app.topbar.component';
import {AppFooterComponent} from './appBase/footer/app.footer.component';
import {ClockComponent} from './appBase/clock/clock.component';
import {XsegundoService} from './appBase/clock/xsegundo.service';
import {AppCargandoService} from './appBase/cargando/app.cargando.service';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {HttpConfigInterceptor} from './interceptors/httpconfig.interceptor';
import {HTTP_INTERCEPTORS, HttpClientModule} from '@angular/common/http';
import {PaisesComponent} from './formas/paises';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {AppMaterialModule} from './app.material.module';
import {DialogcreatpaisesComponent} from './formas/paises/diagcreatpaises.component';
import {PaisesService} from './services/paises.service';
import {HomeGuard, LoginGuard} from './guards';
import {DialogMessagesComponent} from './formas/paises/diagmessages.component';
import {DialogConfElimComponent} from './formas/paises/diagconfelim.component';
import {LoginComponent} from './formas/login';
import {LoginService} from './services/login.service';
import {BlankComponent} from './formas/blank';

@NgModule({
  declarations: [
    AppComponent,
    AppComponent,
    AppCargandoComponent,
    AppprincComponent,
    AppSidebarComponent,
    AppMenuComponent,
    AppSubMenuComponent,
    AppTopBarComponent,
    AppFooterComponent,
    ClockComponent,
    PaisesComponent,
    BlankComponent,
    LoginComponent,
    DialogcreatpaisesComponent,
    DialogMessagesComponent,
    DialogConfElimComponent
  ],
  entryComponents: [DialogcreatpaisesComponent, DialogMessagesComponent, DialogConfElimComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    ReactiveFormsModule,
    FormsModule,
    HttpClientModule,
    AppMaterialModule
  ],
  providers: [XsegundoService, AppCargandoService,  PaisesService, LoginService, LoginGuard, HomeGuard,
    {provide: HTTP_INTERCEPTORS, useClass: HttpConfigInterceptor, multi: true}],
  bootstrap: [AppComponent]
})
export class AppModule {
}
