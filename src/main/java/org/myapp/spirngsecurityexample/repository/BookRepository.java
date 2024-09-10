package org.myapp.spirngsecurityexample.repository;

import org.myapp.spirngsecurityexample.entity.Book.BookEntity;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@EntityScan(basePackages = "src/main/java/org/myapp/spirngsecurityexample/entity/Book")
public interface BookRepository extends JpaRepository<BookEntity, String> {
}
