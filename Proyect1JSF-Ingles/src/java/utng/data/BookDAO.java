package utng.data;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import utng.model.Book;

/**
 *
 * @author Alondra
 */
public class BookDAO extends DAO<Book>{
     public BookDAO() {
        super(new Book());
    }
    public Book getOneById(Book book) throws HibernateException {
        return super.getOneById(book.getIdBook()); 
    }
}
