package dao;

import entity.BookEntity;
import entity.BookshelfEntity;

import java.util.List;

public interface BookDAO {
    public void save (BookEntity book);
    public void insertBook(String name, BookshelfEntity bookshelfEntity);
    public void deleteBook(Integer id);
    public void updateBook(int idB,String name, String bookshelfEntity);
    public List<BookEntity> getBook(int idB);
    public List<BookEntity> getBooks(int idB);
    public List<BookEntity> getAllBooks();
}
