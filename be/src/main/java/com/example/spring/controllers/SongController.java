package com.example.spring.controllers;

import com.example.spring.models.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SongController {

    @Autowired
    private com.example.spring.services.SongService songService;

    public SongController(com.example.spring.services.SongService songService) {
        this.songService = songService;
    }

    @GetMapping("/songs")
    public List<Song> getAllSongs(){
        List<Song> result = songService.getAllSongs();
        return result;
    }
}