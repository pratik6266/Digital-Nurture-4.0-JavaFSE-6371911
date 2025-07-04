package org.example;

public class BookService {
    private BookRepository bookRepository;
    private LoggerService loggerService;

    // Constructor for LoggerService
    public BookService(LoggerService loggerService) {
        this.loggerService = loggerService;
    }

    // Setter for BookRepository
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String title) {
        loggerService.log("Adding book: " + title);
        bookRepository.saveBook(title);
    }
}
