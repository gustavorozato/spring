package com.example.spring.services;

import com.example.spring.models.Artist;
import com.example.spring.models.Song;
import com.example.spring.repositories.ArtistRepository;
import com.example.spring.repositories.SongRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataBaseLoader implements CommandLineRunner {

    private final ArtistRepository artistRepository;
    private final SongRepository songRepository;

    public DataBaseLoader(ArtistRepository artistRepository, SongRepository songRepository) {
        this.artistRepository = artistRepository;
        this.songRepository = songRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Artist jt = new Artist("System", "Of a Down");
        Song cryMeARiver = new Song("Sugar");

        artistRepository.save(jt);
        cryMeARiver.setArtist(jt);
        songRepository.save(cryMeARiver);
    }
}