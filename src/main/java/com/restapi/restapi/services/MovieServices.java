package com.restapi.restapi.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.*;

import com.restapi.restapi.entity.Movie;

@Service
public class MovieServices implements MovieService {
	List<Movie> list;

	public MovieServices() {
		super();
		list = new ArrayList<Movie>();
		list.add(new Movie(1, "Avatar: Way of Water", "Avartar is sci-fi based popular movie"));
		list.add(new Movie(2, "American Beauty", "Best movie ever"));
	}

	@Override
	public List<Movie> getMovies() {
		return this.list;
	}

	@Override
	public Movie getMovie(long id) {
		Movie x = null;

		for (Movie movie : list) {
			if (movie.getId() == id) {
				x = movie;
				break;
			}
		}
		return x;
	}

	@Override
	public Movie addMovies(Movie movie) {
		list.add(movie);
		return movie;
	}

	@Override
	public Movie updateMovies(Movie movie) {
		Movie x = null;
		for(int i=0; i<list.size(); i++) {
			Movie currentMovie = list.get(i);
			if(currentMovie.getId() == movie.getId()) {
				currentMovie.setName(movie.getName());
				currentMovie.setDescription(movie.getDescription());
				x = currentMovie;
			}
		}
		return x;
	}

	@Override
	public long deleteMovie(long id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				list.remove(i);
			}
		}
		return id;
	}

}
