package com.restapi.restapi.services;
import com.restapi.restapi.entity.Movie;
import java.util.*;

public interface MovieService {
	
	public List<Movie> getMovies();
	
	public Movie getMovie(long id);
	
	public Movie addMovies(Movie movie);
	
	public Movie updateMovies(Movie movie);
	
	public long deleteMovie(long id);
}
