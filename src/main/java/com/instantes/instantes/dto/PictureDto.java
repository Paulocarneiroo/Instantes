package com.instantes.instantes.dto;

import com.instantes.instantes.entities.Picture;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class PictureDto {
    private String uri;

    public PictureDto(Picture entity){
        uri = entity.getUri();
    }
}
