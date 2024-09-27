package com.instantes.instantes.dto;

import com.instantes.instantes.entities.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UserDto {
    private Long id;
    private String name;
    private String email;
    private String uriFoto;

    public UserDto(User entity){
        id = entity.getId();
        name = entity.getName();
        email = entity.getEmail();
        uriFoto = entity.getUriFoto();
    }
}
