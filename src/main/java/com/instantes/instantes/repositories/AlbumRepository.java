package com.instantes.instantes.repositories;

import com.instantes.instantes.entities.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
}
