package terrormovies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import terrormovies.model.Movie;
import terrormovies.service.MoviesService;

@Controller
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MoviesService moviesService;

    @RequestMapping(method = RequestMethod.GET, value = "/{name}")
    @ResponseBody
    public String getMovieByName(@PathVariable String name) {
        Movie movie = moviesService.getMovieByName(name);
        return movie.toString();
    }
}
