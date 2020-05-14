package com.capgemini.onlinemovie_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.onlinemovie_exception.MovieException;
import com.capgemini.onlinemovie_entity.Movie;
import com.capgemini.onlinemovie_dao.IMovieRepository;

@Service
public class MovieServiceImpl implements IMovieService {
	@Autowired
	IMovieRepository repo;

	@Override
	public Movie addMovie(Movie movie)throws MovieException {

		return repo.save(movie);
	}

	@Override
	public Movie updateMovie(Movie movie) throws MovieException {
		return repo.save(movie);
	}

	@Override
	public Boolean deleteMovieById(int movieId) throws MovieException {
		if (repo.existsById(movieId)) {
			repo.deleteById(movieId);
		} else {
			throw new MovieException("MovieId not Found");
		}
		return true;
	}

	@Override
	public Movie getMovieById(int movieId) {

		return repo.getOne(movieId);
	}

	@Override
	public boolean validateMovieId(int movieId) throws MovieException {
		String movie = Integer.toString(movieId);
		if (!(movie.length() >= 3 && movie.charAt(0)==3)) {
			throw new MovieException("MovieId must be minimum of 4 characters starting with 3");
		}
		return true;
	}

}
