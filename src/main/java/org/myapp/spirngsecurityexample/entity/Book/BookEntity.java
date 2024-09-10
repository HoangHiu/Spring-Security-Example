package org.myapp.spirngsecurityexample.entity.Book;

import jakarta.persistence.*;
import lombok.*;
import java.util.HashMap;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "books")
public class BookEntity {
    @Id
    @Column(name = "uuid")
    @GeneratedValue(strategy = GenerationType.UUID)
    private String uuid;

    @Column(name = "author")
    private String author;

    @Column(name = "category")
    private String category ;

    @Column(name = "cover")
    private String cover;

    @Column(name = "description", length = 2047)
    private String description;

    @Column(name = "faculty")
    private String faculty;

    @Column(name = "fileSize")
    private String fileSize;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "major")
    private String major;

    @Column(name = "pages")
    private String pages;

    @Column(name = "price")
    private String price;

    @Column(name = "publishYear")
    private String publishYear;

    @Column(name = "publisher")
    private String publisher ;

    @Column(name = "status")
    private String status ;

    @Column(name = "subject")
    private String subject ;

    @Column(name = "title")
    private String title;

    @Column(name = "token")
    private String token;

    @Column(name = "type")
    private String type ;

    @Column(name = "uploadDate")
    private String uploadDate;

    @Column(name = "uploader")
    private String uploader;
}

