package com.jeep.bai_tap_2_validate_thong_tin_bai_hat.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class SongDto {
    private Integer id;

    @NotEmpty
    @NotBlank
    @Size(min = 1, max = 800)
    @Pattern(regexp = "[A-Za-z0-9]+")
    private String name;

    @NotEmpty
    @NotBlank
    @Size(min = 1, max = 300)
    @Pattern(regexp = "[A-Za-z0-9]+")
    private String artist;

    @NotEmpty
    @NotBlank
    @Size(min = 1, max = 1000)
    @Pattern(regexp = "[A-Za-z0-9,]+")
    private String musicType;


    public SongDto() {
    }

    public SongDto(String name, String artist, String musicType) {
        this.name = name;
        this.artist = artist;
        this.musicType = musicType;
    }

    public SongDto(Integer id, String name, String artist, String musicType) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.musicType = musicType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getMusicType() {
        return musicType;
    }

    public void setMusicType(String musicType) {
        this.musicType = musicType;
    }

}
