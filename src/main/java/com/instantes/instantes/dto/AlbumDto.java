package com.instantes.instantes.dto;

import com.instantes.instantes.entities.Album;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AlbumDto {
    private Long id;
    private String title;
    private UserDto user;

    public AlbumDto(Album entity){
        id = entity.getId();
        title = entity.getTitle();
        user = new UserDto(entity.getUser());
    }
}
