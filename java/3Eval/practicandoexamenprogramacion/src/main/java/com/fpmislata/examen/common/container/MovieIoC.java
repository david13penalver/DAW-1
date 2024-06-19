package com.fpmislata.examen.common.container;

import com.fpmislata.examen.domain.service.MovieService;
import com.fpmislata.examen.domain.service.impl.MovieServiceImpl;
import com.fpmislata.examen.persistence.dao.MovieDao;
import com.fpmislata.examen.persistence.dao.impl.MovieDaoImpl;
import com.fpmislata.examen.persistence.repository.MovieRepository;
import com.fpmislata.examen.persistence.repository.impl.MovieRepositoryImpl;

public class MovieIoC {
    private static MovieDao movieDao;
    private static MovieRepository movieRepository;
    private static MovieService movieService;

    public static MovieDao getMovieDao() {
        if (movieDao == null) {
            movieDao = new MovieDaoImpl();
        }
        return movieDao;
    }

    public static MovieRepository getMovieRepository() {
        if (movieRepository == null) {
            movieRepository = new MovieRepositoryImpl(getMovieDao());
        }
        return movieRepository;
    }

    public static MovieService getMovieService() {
        if (movieService == null) {
            movieService = new MovieServiceImpl(getMovieRepository());
        }
        return movieService;
    }
}
