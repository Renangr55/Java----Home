package interfaces;

import models.Book;

public interface loan {

    void loanBook(Book userBook);

    void returnBook(Book userBook);
}
