package com.example.AllFeatureAPI.service;

import com.example.AllFeatureAPI.exceptions.BookNotFoundException;
import com.example.AllFeatureAPI.model.Book;
import com.example.AllFeatureAPI.repository.BookRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
@Transactional
public class BookService {

    private final BookRepository bookRepository;

    public List<Book> getAllBooks(){
        log.info("Returning all books");
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        log.info("Getting book with ID {}",id);
        return bookRepository.findBookById(id)
                .orElseThrow(() -> new BookNotFoundException("Book with ID: "+id+" isn't found"));
    }

    public Book createBook(Book book) {
        log.info("Creating new Book: {}",book.getTitle());
        return bookRepository.save(book);
    }

    public Book updateBook(Book book) {

        getBookById(book.getId());

        log.info("Updating Book with ID: {}",book.getId());
        return bookRepository.save(book);
    }


    public void deleteBook(Long id){
        log.info("Deleting Book with ID {}",id);
        bookRepository.deleteById(id);
    }



}
