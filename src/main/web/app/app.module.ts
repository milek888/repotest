import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http'
import { BrowserModule } from '@angular/platform-browser'

import { MyApp } from './app';
import { About } from './about';
import { Home } from './home';
import {FilmService} from "./film.service";

@NgModule({
  imports: [ BrowserModule, HttpModule ],
  declarations: [ MyApp, About, Home ],
    providers: [FilmService],
  bootstrap: [ MyApp ]
})
export class AppModule {}
