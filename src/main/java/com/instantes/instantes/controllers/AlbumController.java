package com.instantes.instantes.controllers;

import com.instantes.instantes.dto.AlbumDto;
import com.instantes.instantes.services.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/albums")
public class AlbumController {

    @Autowired
    private AlbumService service;

    @GetMapping
    public ResponseEntity<Page<AlbumDto>> findAll(Pageable pageable){
        return ResponseEntity.ok(service.findAll(pageable));
    }

}
