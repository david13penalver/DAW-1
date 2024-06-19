package com.fpmislata.examendavidpenalver.common.container;

import com.fpmislata.examendavidpenalver.domain.service.MusicService;
import com.fpmislata.examendavidpenalver.domain.service.impl.MusicServiceImpl;
import com.fpmislata.examendavidpenalver.persistence.dao.MusicDao;
import com.fpmislata.examendavidpenalver.persistence.dao.impl.MusicDaoImpl;
import com.fpmislata.examendavidpenalver.persistence.repository.MusicRepository;
import com.fpmislata.examendavidpenalver.persistence.repository.impl.MusicRepositoryImpl;

public class MusicIoC {

    private static MusicDao musicDao;
    private static MusicRepository musicRepository;
    private static MusicService musicService;

    public static MusicDao getMusicDao() {
        if (MusicIoC.musicDao == null) {
            musicDao = new MusicDaoImpl();
        }
        return musicDao;
    }
    public static MusicRepository getMusicRepository() {
        if (MusicIoC.musicRepository == null) {
            musicRepository = new MusicRepositoryImpl(getMusicDao());
        }
        return musicRepository;
    }
    public static MusicService getMusicService() {
        if (MusicIoC.musicService == null) {
            musicService = new MusicServiceImpl(getMusicRepository());
        }
        return musicService;
    }

}
