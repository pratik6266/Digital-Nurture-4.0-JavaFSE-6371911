package com.library.LibraryManagement;


import com.library.LibraryManagement.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}

