package com.fpmislata.examen2.persistence.repository.impl;

import com.fpmislata.examen2.common.container.CharacterMovieIoC;
import com.fpmislata.examen2.common.container.DirectorIoC;
import com.fpmislata.examen2.domain.entity.Director;
import com.fpmislata.examen2.domain.entity.Movie;
import com.fpmislata.examen2.persistence.dao.CharacterMovieDao;
import com.fpmislata.examen2.persistence.dao.DirectorDao;
import com.fpmislata.examen2.persistence.dao.MovieDao;
import com.fpmislata.examen2.persistence.dao.entity.CharacterMovieEntity;
import com.fpmislata.examen2.persistence.dao.entity.DirectorEntity;
import com.fpmislata.examen2.persistence.dao.entity.MovieEntity;
import com.fpmislata.examen2.persistence.dao.impl.DirectorDaoImpl;
import com.fpmislata.examen2.persistence.repository.MovieRepository;
import com.fpmislata.examen2.persistence.repository.mapper.DirectorMapper;
import com.fpmislata.examen2.persistence.repository.mapper.MovieMapper;

import java.util.List;

import static com.fpmislata.examen2.common.container.CharacterMovieIoC.characterMovieDao;

public class MovieRepositoryImpl implements MovieRepository {

    private final MovieDao movieDao;

    public MovieRepositoryImpl(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    @Override
    public List<Movie> findAll() {
        return MovieMapper.toMovieList(movieDao.findAll());
    }

    @Override
    public Movie findById(int id) {
        DirectorDao directorDao = DirectorIoC.getDirectorDao();
        MovieEntity movieEntity =movieDao.findById(id);
        Movie movie = MovieMapper.toMovie(movieEntity);

        int directorId = movieEntity.getDirectorId();
        DirectorEntity directorEntity = directorDao.findById(directorId);
        Director director = DirectorMapper.toDirector(directorEntity);
        movie.setDirector(director);

        return movie;

    }
}
