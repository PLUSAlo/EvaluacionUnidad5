package utng.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Alondra
 */
@Entity
@Table(name="author")
public class Author implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_author")
    private Long idAuthor;
    @Column(length=50)
    private String name;
    @Column(length=50)
    private String estate;
     @Column(length=50)
    private String prestige;

    public Author(Long idAuthor, String name, String estate, String prestige) {
        this.idAuthor = idAuthor;
        this.name = name;
        this.estate = estate;
        this.prestige = prestige;
    }

    public Author() {
         this.idAuthor=0L;
    }

    public Long getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(Long idAuthor) {
        this.idAuthor = idAuthor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEstate() {
        return estate;
    }

    public void setEstate(String estate) {
        this.estate = estate;
    }

    public String getPrestige() {
        return prestige;
    }

    public void setPrestige(String prestige) {
        this.prestige = prestige;
    }

    @Override
    public String toString() {
        return "Author{" + "idAuthor=" + idAuthor + ", name=" + name + ", estate=" + estate + ", prestige=" + prestige + '}';
    }

   
    
}
