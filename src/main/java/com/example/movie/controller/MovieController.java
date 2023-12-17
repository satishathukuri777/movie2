import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private MovieH2Service movieService;

    @GetMapping
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/{movieId}")
    public Movie getMovieById(@PathVariable int movieId) {
        return movieService.getMovieById(movieId);
    }

    @PostMapping
    public Movie createMovie(@RequestBody Movie movie) {
        return movieService.createMovie(movie);
    }

    @PutMapping("/{movieId}")
    public Movie updateMovie(@PathVariable int movieId, @RequestBody Movie updatedMovie) {
        return movieService.updateMovie(movieId, updatedMovie);
    }

    @DeleteMapping("/{movieId}")
    public void deleteMovie(@PathVariable int movieId) {
        movieService.deleteMovie(movieId);
    }
}
