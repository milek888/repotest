import {Injectable} from "@angular/core";
import {Http, Response} from '@angular/http';
import 'rxjs/add/operator/map';

@Injectable()
export class FilmService {
    private url : string = "http://localhost:8090/films";

    constructor(private http:Http){
    }

    getFilms() {
        return this.http.get(this.url).map( (response:Response) => response.json() );
    }
}