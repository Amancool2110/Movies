package com.capgemini.onlinemovie_service;

import com.capgemini.onlinemovie_exception.MovieException;
import com.capgemini.onlinemovie_entity.Movie;

public interface IMovieService {
	public Movie addMovie(Movie movie)throws MovieException;

	public Movie updateMovie(Movie movie) throws MovieException;

	public Boolean deleteMovieById(int movieId) throws MovieException;

	public Movie getMovieById(int movieId);
	public boolean validateMovieId(int movieId)throws MovieException;
}
