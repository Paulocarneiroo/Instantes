package com.instantes.instantes.dto;

import com.instantes.instantes.entities.Album;
import com.instantes.instantes.entities.Picture;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AlbumDto {
    private Long id;
    private String title;
    private UserDto user;
    private Set<PictureDto> pictures = new HashSet<>();

    public AlbumDto(Album entity){
        id = entity.getId();
        title = entity.getTitle();
        user = new UserDto(entity.getUser());
        for (Picture p : entity.getPictures()){
            pictures.add(new PictureDto(p));
        }
    }
}
