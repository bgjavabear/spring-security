package terrormovies.service;

import terrormovies.model.Movie;

public interface MoviesService {
    Movie getMovieByName(String name);
}
