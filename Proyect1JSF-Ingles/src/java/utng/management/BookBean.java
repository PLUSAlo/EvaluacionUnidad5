package utng.management;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import utng.data.AuthorDAO;
import utng.data.BookDAO;
import utng.model.Author;
import utng.model.Book;

/**
 *
 * @author Alondra
 */

@ManagedBean(name = "bookBean")
@SessionScoped
public class BookBean implements Serializable {

    private List<Book> books;
    private Book book;
    private List<Author> authors;

    public BookBean() {
        book = new Book();
        book.setAuthor(new Author());
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    

    public String list() {
        BookDAO dao = new BookDAO();
        try {
            books = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Books";
    }

    public String delete() {
        BookDAO dao = new BookDAO();
        try {
            dao.delete(book);
            books = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Delete";
    }

    public String start() {
        book = new Book();
        book.setAuthor(new Author());
        try {
            authors = new AuthorDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Start";
    }

    public String save() {
        BookDAO dao = new BookDAO();
        try {
            if (book.getIdBook() != 0) {
                dao.update(book);
            } else {
                dao.insert(book);
            }
            books = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Save";
    }

    public String cancel() {
        return "Cancel";
    }

    public String edit(Book book) {
        this.book = book;
        try {
            authors = new AuthorDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Edit";
    }

}
