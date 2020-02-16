package com.apap.tu03.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.apap.tu03.model.MovieModel;


@Service
public class InMemoryMovieService implements MovieService {
	private List <MovieModel> archiveMovie;
	
	
	public InMemoryMovieService() {
		archiveMovie = new ArrayList<>();
	}

	@Override
	public void addMovie(MovieModel movie) {
		// TODO Auto-generated method stub
		archiveMovie.add(movie);
		
	}

	@Override
	public List<MovieModel> getMovieList() {
		// TODO Auto-generated method stub
		return archiveMovie;
	}

	@Override
	public MovieModel getMovieDetail(String id) {
		// TODO Auto-generated method stub
		for(int i=0;i<archiveMovie.size();i++) {
			if(archiveMovie.get(i).getId().equals(id)) {
				return archiveMovie.get(i);
			}
		}
		return null;
	}

	@Override
	public void deleteMovie(MovieModel movie) {
		// TODO Auto-generated method stub
		archiveMovie.remove(movie);
	}

}