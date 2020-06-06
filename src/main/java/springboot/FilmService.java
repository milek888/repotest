package springboot;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FilmService {

    private List<Film> films = new ArrayList<>(Arrays.asList(new Film(1, "Sherlock Holmes", "Crime story"),
            new Film(2, "Indiana Johnes", "Adventure action film"),
            new Film(3, "Zootopia", "Cartoon")));

    public List<Film> getFilms() {
        return films;
    }

    public Film getFilm(int id) {
        System.out.println("Szedl Grzes przez wies");
        System.out.println("Ala ma kota);
        Film topic = films.stream().filter(t -> t.getId() == id).findFirst().get(); //TODO Warning:(22, 78) 'Optional.get()' without 'isPresent()' check
        return topic;
    }

    public void addFilm(Film topic) {
        films.add(topic);
    }

    public void updateFilm(Film topic, int id) {
        for (int i = 0; i < films.size(); i++) {
            if (films.get(i).getId() == id) {
                films.set(i, topic);
            }
        }
    }

    public void deleteFilm(@PathVariable int id) {
        //films.removeIf(t->t.getId() == id);

        for (int i = 0; i < films.size(); i++) {
            if (films.get(i).getId() == id) {
                films.remove(i);
            }
        }
    }

}
