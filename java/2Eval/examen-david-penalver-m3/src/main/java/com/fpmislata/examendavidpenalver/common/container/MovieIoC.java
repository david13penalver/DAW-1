package com.fpmislata.examendavidpenalver.common.container;

import com.fpmislata.examendavidpenalver.domain.service.MovieService;
import com.fpmislata.examendavidpenalver.domain.service.impl.MovieServiceImpl;
import com.fpmislata.examendavidpenalver.persistence.dao.MovieDao;
import com.fpmislata.examendavidpenalver.persistence.dao.impl.MovieDaoImpl;
import com.fpmislata.examendavidpenalver.persistence.repository.MovieRepository;
import com.fpmislata.examendavidpenalver.persistence.repository.impl.MovieRepositoryImpl;

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
