package dao;

import entity.BookEntity;
import entity.BookshelfEntity;

import java.util.List;

public interface BookshelfDAO {
    public void save(BookshelfEntity B);
   // public void getBookshelf(String name);
    public List<BookshelfEntity> getBookshelfs();
    public List<BookshelfEntity> getBookshelfs(String name);
}