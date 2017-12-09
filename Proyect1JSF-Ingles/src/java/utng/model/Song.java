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
@Table(name="song")
public class Song implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_song")
    private Long idSong;
    @Column(name="name_song", length=40)
    private String nameSong;
    @Column(length=40)
    private String singer;
    @Column(length=40)
    private String album;
    @Column(length=40)
    private String gender;
    
    @ManyToOne()
    @JoinColumn(name="id_author")
    private Author author;

    public Song(Long idSong, String nameSong, String singer, String album, String gender, Author author) {
        this.idSong = idSong;
        this.nameSong = nameSong;
        this.singer = singer;
        this.album = album;
        this.gender = gender;
        this.author = author;
    }

 
    public Song() {
        this(0L,"","","","",null);
    }

    public Long getIdSong() {
        return idSong;
    }

    public void setIdSong(Long idSong) {
        this.idSong = idSong;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Song{" + "idSong=" + idSong + ", nameSong=" + nameSong + ", singer=" + singer + ", album=" + album + ", gender=" + gender + ", author=" + author + '}';
    }

    
    
}
