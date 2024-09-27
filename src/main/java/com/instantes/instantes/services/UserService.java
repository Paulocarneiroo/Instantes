package com.instantes.instantes.services;

import com.instantes.instantes.dto.UserDto;
import com.instantes.instantes.entities.User;
import com.instantes.instantes.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserService{

    @Autowired
    UserRepository repository;

    @Transactional(readOnly = true)
    public UserDto findByName(String name) {
        Optional<User> result = repository.findByName(name);
        User entity = result.get();
        return new UserDto(entity);
    }

    @Transactional(readOnly = true)
    public Page<UserDto> findAll(Pageable pageable){
        Page<User> result = repository.findAll(pageable);
        return result.map(x -> new UserDto(x));
    }
}
