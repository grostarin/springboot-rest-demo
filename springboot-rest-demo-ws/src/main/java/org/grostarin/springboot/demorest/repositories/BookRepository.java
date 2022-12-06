package org.grostarin.springboot.demorest.repositories;

import java.util.List;

import org.grostarin.springboot.demorest.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}
