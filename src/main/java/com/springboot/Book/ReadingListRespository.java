package com.springboot.Book;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReadingListRespository extends JpaRepository<Book,Long>{
    List<Book> findByReader(String reader);
}
