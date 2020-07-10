package com.lukas.books.dao;

import com.lukas.books.model.Book;

import java.util.Collection;
import java.util.List;

public interface BookDao {
    public void addBook(Book book);
    public void updateBook(Book book);
    public List<Book> listBooks();
    public Book getBooksById(int id);
    public void removeBook(int id);
    Collection<Book> getBooks(String search);
}
