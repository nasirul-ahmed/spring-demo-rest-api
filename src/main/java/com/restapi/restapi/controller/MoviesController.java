package com.restapi.restapi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.restapi.restapi.entity.Movie;
import com.restapi.restapi.services.MovieService;

@RestController
public class MoviesController {

	@Autowired
	private MovieService movieService;

	@GetMapping("/sayHello")
	public String sayHello() {
		return "Hello there! Welcome to spring!";
	}

	@GetMapping("/movies")
	public List<Movie> getMovies() {
		return this.movieService.getMovies();
	}

	@GetMapping("/movie/{id}")
	public Movie addMovie(@PathVariable Long id) {
		System.out.print("This is the id:::::::::::::::::; " + id);
		return this.movieService.getMovie(id);
	}

	@PostMapping("/addMovie")
	public Movie addMovie(@RequestBody Movie movie) {
		return this.movieService.addMovies(movie);
	}

	@PutMapping("/updateMovie")
	public Movie updateMovie(@RequestBody Movie movie) {
		return this.movieService.updateMovies(movie);
	}

	@GetMapping("/deleteMovie/{id}")
	public long deleteMovie(@PathVariable Long id) {
		return this.movieService.deleteMovie(id);
	}
}
