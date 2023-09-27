package org.example;

import java.util.*;

public class LibraryManager {
    private static Book book1 = new Book(1,"War And Peace", "Lev Tolstoi", "Novel", 1789, true);
    private static Book book2 = new Book(2,"Three in the boat except for the dog", "Jerom K. Jerom", "Comedy Novel", 1890, true);
    private static Book book3 = new Book(3,"Shantaram", "Gregory Roberts", "Novel", 2004, false);
    private static Book book4 = new Book(4,"the clockwork orange", "Entony Berges", "Novel", 1962, true);
    private static Book book5 = new Book(5,"The dead souls", "Lev Tolstoi", "Novel", 1780, false);
    private static Book book6 = new Book(6,"Meister und Margarethe", "Mikhail Bulghakov", "Novel", 1900, true);
    private static Book book7 = new Book(7,"The great expectations", "Charles Dickens", "Novel", 1756, true);
    private static Book book8 = new Book(8,"Frankenstein", "Mary Shelly", "Novel", 1678, false);
    private static Book book9 = new Book(9,"The headless horseman", "Main Rid", "Adventure Novel", 1890, true);
    private static Book book10 = new Book(10,"The Pickwicks Club", "Charles Dickens", "Comedy Novel", 1750, true);


    private static List<Book> libraryCatalog = Arrays.asList(book1, book2, book3, book4, book5, book6, book7, book8, book9, book10);


    private static LibraryUser user1 = new LibraryUser(1,"Andrei", "andrew@gmail.com", "37123456745", new ArrayList<>(), new ArrayList<>());
    private static LibraryUser user2 = new LibraryUser(2,"Micle", "schonmikl@gmail.com", "37123456778", new ArrayList<>(), new ArrayList<>());
    private static LibraryUser user3 = new LibraryUser(3,"Klement", "antihype@gmail.com", "37123456305", new ArrayList<>(), new ArrayList<>());
    private static LibraryUser user4 = new LibraryUser(4,"Alex", "alexCool@gmail.com", "37120956745", new ArrayList<>(), new ArrayList<>());

    private static List<LibraryUser> libraryUsers = Arrays.asList(user1, user2, user3, user4);

    public static void main(String[] args) {

        System.out.println(new LibraryManager().listAvailableBooksByGenre("Novel"));
        System.out.println(new LibraryManager().listUserEmailsWithReservedBooks());
        new LibraryManager().borrowBook(user1, book5);
        System.out.println(user1);

    }

    public List<Book> listAvailableBooksByGenre(String genre) {
        List<Book> searchResults = new ArrayList<>();
        for (Book book : libraryCatalog) {
            if (book.getBookGenre().equals(genre)) {
                searchResults.add(book);
            }
        }
        return searchResults;
    }

    public Set<String> listUserEmailsWithReservedBooks() {
        Set<String> emailSet = new HashSet<>();
        for (LibraryUser libraryUser : libraryUsers) {
            if (libraryUser.getUserBooksReserved() != null) {
                emailSet.add(libraryUser.getUserEmail());
            }
        }
        return emailSet;
    }

    public void addBookToLibrary(Book book) {
        libraryCatalog.add(book);
    }

    public void removeBookFromLibrary(Book book) {
        if (libraryCatalog.contains(book)) {
            libraryCatalog.remove(book);
        }
    }

    public void borrowBook(LibraryUser user, Book book) {
        ArrayList<Book> bookList = user.getUserBooksBorrowed();
        bookList.add(book);
        user.setUserBooksBorrowed(bookList);
    }

    public void reserveBook(LibraryUser user, Book book) {
        ArrayList<Book> bookList = user.getUserBooksReserved();
        bookList.add(book);
        user.setUserBooksReserved(bookList);
    }
}