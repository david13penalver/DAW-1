package com.fpmislata.examen2.persistence.repository.impl;

import com.fpmislata.examen2.common.container.DirectorIoC;
import com.fpmislata.examen2.domain.entity.Director;
import com.fpmislata.examen2.domain.entity.Movie;
import com.fpmislata.examen2.persistence.dao.ActorDao;
import com.fpmislata.examen2.persistence.dao.DirectorDao;
import com.fpmislata.examen2.persistence.dao.MovieDao;
import com.fpmislata.examen2.persistence.repository.MovieRepository;
import com.fpmislata.examen2.persistence.repository.mapper.DirectorMapper;
import com.fpmislata.examen2.persistence.repository.mapper.MovieMapper;

import java.util.List;

public class MovieRepositoryImpl implements MovieRepository {

    MovieDao movieDao;
    DirectorDao directorDao;
    public MovieRepositoryImpl(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    public MovieRepositoryImpl(DirectorDao directorDao) {
        this.directorDao = DirectorIoC.getDirectorDao();
    }


    @Override
    public List<Movie> findAll() {
        return MovieMapper.toMovieList(movieDao.findAll());
    }

    @Override
    public Movie findById(int id) {
        return MovieMapper.toMovie(movieDao.findById(id));
    }





    @Override
    public Movie insert(Movie movie) {
        return null;
    }

//    @Override
//    public Movie insert(Movie movie) {
//        return MovieMapper.toMovieEntity(movieDao.insert(movie));
    //      o
//        return movieDao.insert(MovieMapper.toMovieEntity(movie));
//    }

}
