package com.example.AllFeatureAPI.repository;

import com.example.AllFeatureAPI.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book,Long> {

    Optional<Book> findBookById(Long id);

}
