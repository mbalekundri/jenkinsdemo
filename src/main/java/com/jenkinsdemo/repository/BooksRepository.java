package com.jenkinsdemo.repository;
import org.springframework.data.repository.CrudRepository;
//repository that extends CrudRepository
import com.jenkinsdemo.model.Books;
public interface BooksRepository extends CrudRepository<Books, Integer>
{
}
