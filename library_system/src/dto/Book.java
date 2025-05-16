package dto;

import lombok.*;

//
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//getter,setter,ToString 모두 포함 : Data
public class Book {

    private int id;
    private String title;
    private String author;
    private String publisher;
    private int publicationYear;
    private String isbn;
    private boolean available;

}
