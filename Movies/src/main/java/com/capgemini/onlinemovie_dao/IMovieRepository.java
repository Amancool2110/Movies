package com.capgemini.onlinemovie_dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.onlinemovie_entity.Movie;

@Repository
public interface IMovieRepository extends JpaRepository<Movie, Integer> {
	public Movie getByMovieName(String movieName);
}