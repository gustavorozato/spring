package com.example.spring.services;

import com.example.spring.models.Song;
import com.example.spring.repositories.SongRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SongService {

    private SongRepository songRepository;

    public SongService(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public List<Song> getAllSongs() {
        return songRepository.findAll();
    }
}