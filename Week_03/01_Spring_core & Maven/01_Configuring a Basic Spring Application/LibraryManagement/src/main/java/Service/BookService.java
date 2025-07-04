package Service;

import Repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String name) {
        bookRepository.saveBook(name);
        System.out.println("Book added by service: " + name);
    }
}
