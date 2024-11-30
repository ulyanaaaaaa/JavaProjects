package org.example;

public class LibraryManager {
    private final Library library;

    public LibraryManager(Library library) {
        this.library = library;
    }

    public void manageLibrary() {
        Book book1 = new Book("Effective Java", "Joshua Bloch");
        Book book2 = new Book("Clean Code", "Robert C. Martin");

        library.addBook(book1);
        library.addBook(book2);

        Member member1 = new Member("Alice", 1);
        Member member2 = new Member("Bob", 2);

        library.addMember(member1);
        library.addMember(member2);

        System.out.println(library);
    }

    public static void main(String[] args) {
        Library library = new Library();
        LibraryManager libraryManager = new LibraryManager(library);
        libraryManager.manageLibrary();
    }
}

