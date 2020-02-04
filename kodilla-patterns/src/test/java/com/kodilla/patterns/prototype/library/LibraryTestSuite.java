package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Book book1 = new Book("Game of Thrones", "J.R.R. Martin", LocalDate.of(2006, 1, 1));
        Book book2 = new Book("The Witcher", "Andrzej Sapkowski", LocalDate.of(1999, 1, 1));
        Book book3 = new Book("The Fellowship of the Ring", "J.R.R. Tolkien", LocalDate.of(1950, 1, 1));
        Book book4 = new Book("Solaris", "Stanisław Lem", LocalDate.of(1960, 1, 1));
        Book book5 = new Book("Cujo", "Stephen King", LocalDate.of(1970, 1, 1));
        Library library = new Library("Library 1");

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        //Then
        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(4, clonedLibrary.getBooks().size());
        Assert.assertEquals(5, deepClonedLibrary.getBooks().size());
    }
}
