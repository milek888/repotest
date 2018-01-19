import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';
import { AppModule } from './app.module';
import 'zone.js/dist/zone';
import 'reflect-metadata';

platformBrowserDynamic().bootstrapModule(AppModule);
