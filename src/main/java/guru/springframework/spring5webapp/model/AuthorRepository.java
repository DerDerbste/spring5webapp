package guru.springframework.spring5webapp.model;

import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Book, Long>{}