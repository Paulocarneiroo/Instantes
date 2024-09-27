package com.instantes.instantes.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String uriFoto;

    @ManyToMany
    @Setter(AccessLevel.NONE)
    private Set<User> friends = new HashSet<>();

    @OneToMany(mappedBy = "user")
    @Setter(AccessLevel.NONE)
    private Set<Album> albums = new HashSet<>();

    public User(Long id, String uriFoto, String email, String name) {
        this.id = id;
        this.uriFoto = uriFoto;
        this.email = email;
        this.name = name;
    }
}
