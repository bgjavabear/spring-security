package terrormovies.service;

import org.springframework.security.access.annotation.Secured;
import terrormovies.model.Movie;

import java.util.HashMap;
import java.util.Map;

public class MoviesServiceImpl implements MoviesService {

    private static final Map<String, Movie> MOVIES = new HashMap<>();

    static {
        MOVIES.put("die hard", new Movie("Die Hard", "2000000"));
    }

    @Secured("ROLE_USER")
//    @RolesAllowed("ROLE_USER")
    public Movie getMovieByName(String name) {
        return MOVIES.get(name.toLowerCase());
    }
}
