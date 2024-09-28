package com.instantes.instantes.services;

import com.instantes.instantes.dto.AlbumDto;
import com.instantes.instantes.entities.Album;
import com.instantes.instantes.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class AlbumService {

    @Autowired
    AlbumRepository repository;

    @Transactional(readOnly = true)
    public Page<AlbumDto> findAll(Pageable pageable) {
        Page<Album> result = repository.findAll(pageable);
        return result.map(x -> new AlbumDto(x));
    }

    @Transactional(readOnly = true)
    public AlbumDto findById(Long id) {
        Optional<Album> result = repository.findById(id);
        Album entity = result.get();
        return new AlbumDto(entity);
    }
}
