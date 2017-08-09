package model;

import java.util.Date;

public class Book {

    private Long id;
    private String titel;
    private String author;
    private Date releaseDate;
    private int isbn;
    private String genre;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (isbn != book.isbn) return false;
        if (id != null ? !id.equals(book.id) : book.id != null) return false;
        if (author != null ? !author.equals(book.author) : book.author != null) return false;
        if (releaseDate != null ? !releaseDate.equals(book.releaseDate) : book.releaseDate != null) return false;
        return genre != null ? genre.equals(book.genre) : book.genre == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (releaseDate != null ? releaseDate.hashCode() : 0);
        result = 31 * result + isbn;
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", titel='" + titel + '\'' + ", author='" + author + '\'' + ", releaseDate=" + releaseDate + ", isbn=" + isbn + ", genre='" + genre + '\'' + '}';
    }

    public Book(Long id, String titel, String author, Date releaseDate, int isbn, String genre) {
        this.id = id;
        this.titel = titel;
        this.author = author;
        this.releaseDate = releaseDate;
        this.isbn = isbn;
        this.genre = genre;
    }
}
