package springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FilmController {

    @Autowired
    private FilmService filmService;

    @RequestMapping("/films")
    public List<Film> getAllFilms() {
        return filmService.getFilms();
    }

    @RequestMapping("/films/{id}")
    public Film getFilm(@PathVariable int id) {
        return filmService.getFilm(id);
    }

    @RequestMapping(value = "/films", method = RequestMethod.POST)
    public void addFilm(@RequestBody Film film) {
        filmService.addFilm(film);
    }

    @RequestMapping(value = "/films/{id}", method = RequestMethod.PUT)
    public void updateFilm(@RequestBody Film film, @PathVariable int id) {
        filmService.updateFilm(film, id);
    }

    @RequestMapping(value = "/films/{id}", method = RequestMethod.DELETE)
    public void deleteFilm(@PathVariable int id) {
        filmService.deleteFilm(id);
    }

}
