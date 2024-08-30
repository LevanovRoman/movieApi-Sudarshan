package com.myapp.movieapisudarshan.repositories;

import com.myapp.movieapisudarshan.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
