package models;

import interfaces.loan;

import java.util.ArrayList;

public class Teacher extends User implements loan {
    private String name;
    private String email;
    private String departament;
    public ArrayList<Book>loaningBook = new ArrayList<>();

    public Teacher(String name, String email,String departament){
        super(name,email);
        this.departament = departament;

    }



    public String getDepartament(){
        return departament;
    }

    @Override
    public void loanBook(Book userBook) {
        if (loaningBook.size() < 3){
            loaningBook.add(userBook);
            System.out.println("you loan a book| title: " + userBook.getName());
        } else {
            System.out.println("You not know to take this book");
        }
    }

    @Override
    public void returnBook(Book userBook) {
        loaningBook.remove(userBook);

        if (loaningBook.remove(userBook)){
            System.out.println("this book be to return");
        } else {
            System.out.println("Do you not have book for return ");
        }
    }

    public void printBooks(){
        System.out.println("Departament: " + departament);
        for (Book i : loaningBook){
            System.out.println("book name: " + i.getName() +
                    "book author: " + i.getAuthor());
        }
    }

    @Override
    public String toString() {
        return "Teacher information: " + super.toString() + "depatament: " + getDepartament();
    }



}
