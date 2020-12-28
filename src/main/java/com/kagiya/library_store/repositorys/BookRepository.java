package com.kagiya.library_store.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import com.kagiya.library_store.models.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findByNameOfBookContaining(String nameOfBook);
}
