package com.fpmislata.examendavidpenalver.persistence.repository.mapper;

import com.fpmislata.examendavidpenalver.domain.entity.Music;
import com.fpmislata.examendavidpenalver.persistence.dao.entity.MusicEntity;

import java.util.ArrayList;
import java.util.List;

public class MusicMapper {
    public static Music toMusic(MusicEntity musicEntity) {
        Integer id = musicEntity.getId();
        String title = musicEntity.getTitle();
        String author = musicEntity.getAuthor();

        return new Music(id, title, author);
    }

    public static List<Music> toMusicList(List<MusicEntity> musicEntityList) {
        List<Music> musicList = new ArrayList<>();

        for (MusicEntity musicEntity : musicEntityList) {
            musicList.add(toMusic(musicEntity));
        }

        return musicList;
    }
}
