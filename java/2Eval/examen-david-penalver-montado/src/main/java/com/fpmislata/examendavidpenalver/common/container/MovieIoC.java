package com.fpmislata.examendavidpenalver.common.container;

import com.fpmislata.examendavidpenalver.domain.service.MovieService;
import com.fpmislata.examendavidpenalver.domain.service.impl.MovieServiceImpl;
import com.fpmislata.examendavidpenalver.persistence.dao.MovieDao;
import com.fpmislata.examendavidpenalver.persistence.dao.impl.MovieDaoImpl;
import com.fpmislata.examendavidpenalver.persistence.repository.MovieRepository;
import com.fpmislata.examendavidpenalver.persistence.repository.impl.MovieRepositoryImpl;

public class MovieIoC {

    private static MovieService movieService;
    private static MovieRepository movieRepository;
    private static MovieDao movieDao;

    public static MovieService getMovieService() {
        if (movieService == null) {
            movieService = new MovieServiceImpl(getMovieRepository());
        }
        return movieService;
    }

    public static MovieRepository getMovieRepository() {
        if (movieRepository == null) {
            movieRepository = new MovieRepositoryImpl(getMovieDao());
        }
        return movieRepository;
    }
    public static MovieDao getMovieDao() {
        if (MovieIoC.movieDao == null) {
            MovieIoC.movieDao = new MovieDaoImpl();
        }
        return MovieIoC.movieDao;
    }
}
