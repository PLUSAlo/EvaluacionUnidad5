package utng.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Alondra
 */

@Entity
@Table(name="book")
public class Book implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_book")
    private Long idBook;
    @Column(name="name_book", length=40)
    private String nameBook;
    @Column(length=40)
    private String edition;
     @Column(length=40)
    private String editorial;
    
    @ManyToOne()
    @JoinColumn(name="id_author")
    private Author author;

    public Book(Long idBook, String nameBook, String edition, String editorial, Author author) {
        this.idBook = idBook;
        this.nameBook = nameBook;
        this.edition = edition;
        this.editorial = editorial;
        this.author = author;
    }


    public Book() {
        this(0L,"","","",null);
    }

    public Long getIdBook() {
        return idBook;
    }

    public void setIdBook(Long idBook) {
        this.idBook = idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" + "idBook=" + idBook + ", nameBook=" + nameBook + ", edition=" + edition + ", editorial=" + editorial + ", author=" + author + '}';
    }

    
    
}
