package com.fpmislata.examen2.persistence.repository.impl;

import com.fpmislata.examen2.common.container.DirectorIoC;
import com.fpmislata.examen2.domain.entity.Movie;
import com.fpmislata.examen2.persistence.dao.DirectorDao;
import com.fpmislata.examen2.persistence.dao.MovieDao;
import com.fpmislata.examen2.persistence.dao.entity.DirectorEntity;
import com.fpmislata.examen2.persistence.dao.entity.MovieEntity;
import com.fpmislata.examen2.persistence.repository.MovieRepository;
import com.fpmislata.examen2.persistence.repository.mapper.MovieMapper;

import java.util.List;

public class MovieRepositoryImpl implements MovieRepository {

    private MovieDao movieDao;

    public MovieRepositoryImpl(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    @Override
    public List<Movie> findAll() {
        return MovieMapper.toMovieList(movieDao.findAll());
    }

    @Override
    public Movie findById(int id) {
        MovieEntity movieEntity = movieDao.findById(id);
        Movie movie = MovieMapper.toMovie(movieEntity);
        DirectorDao directorDao = DirectorIoC.getDirectorDao();
        DirectorEntity directorEntity = directorDao.findById(movieEntity.getDirectorId());
        //mapear DirectorEntity a Director
        //Añadir Director a Movie

        return movie;
    }
}
