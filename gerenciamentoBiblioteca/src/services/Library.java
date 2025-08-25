package services;

import models.Book;
import models.Student;
import models.User;

import javax.xml.stream.events.StartDocument;
import java.util.ArrayList;
import java.util.Date;

public class Library {
    public ArrayList<Book>books = new ArrayList<>();
    public ArrayList<User>users = new ArrayList<>();

    // add book
    public Book addBook(Book book) throws Exception{
        try {
            books.add(book);
        } catch (Exception e){
            throw new Exception("Error in add book!! Sorry");

        }
        return book;
    }

    public User addUser(User user ) throws Exception{
        try {
            users.add(user);
        } catch (Exception e){
            throw new Exception("Error in user !!!");
        }
        return user;
    }






}
