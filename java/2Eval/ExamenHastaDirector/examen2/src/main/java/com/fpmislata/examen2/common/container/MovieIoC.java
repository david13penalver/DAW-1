package com.fpmislata.examen2.common.container;


import com.fpmislata.examen2.domain.service.MovieService;
import com.fpmislata.examen2.domain.service.impl.MovieServiceImpl;
import com.fpmislata.examen2.repository.dao.MovieDao;
import com.fpmislata.examen2.repository.dao.impl.MovieDaoImpl;
import com.fpmislata.examen2.repository.repository.MovieRepository;
import com.fpmislata.examen2.repository.repository.impl.MovieRepositoryImpl;

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
