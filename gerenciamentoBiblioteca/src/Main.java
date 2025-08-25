import models.Book;
import models.Student;
import services.Library;

public class Main {
    public static void main(String[] args) throws Exception {

        Book test = new Book("Renan","jkaja","2983");
        System.out.println(test);

        Student renan = new Student("Alex","alex@gmail.com","DS");
        System.out.println(renan);

        Library kaka = new Library();
        kaka.addUser(renan);
        

        renan.loanBook(test);
        renan.printBooks();
        renan.returnBook(test);
        renan.printBooks();
    }
}