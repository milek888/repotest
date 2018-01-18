import { Component } from '@angular/core';
import 'zone.js/dist/zone';
import 'reflect-metadata';
import {FilmService} from "./film.service";

@Component({
  selector: 'my-app',
  template: `
    <h1>Basic Webpack Starter</h1>
    <h2>{{description}}</h2>
    <ul>
        <li *ngFor="let film of films">{{film.name}}</li>
    </ul>
  `
})
export class MyApp {
  description: string = 'Application description';
  films = [];

  constructor(private filmService: FilmService) {
    this.filmService.getFilms().subscribe( resp => this.films = resp);
  }
}
