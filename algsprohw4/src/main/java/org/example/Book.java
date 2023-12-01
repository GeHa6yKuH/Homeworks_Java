package org.example;

import java.util.Objects;

public class Book implements Comparable<Book>{
    String name;
    double price;
    boolean isPresent;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(price, book.price) == 0 && isPresent == book.isPresent && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, isPresent);
    }

    @Override
    public int compareTo(Book o) {
        if (!this.name.equals(o.name)) return this.name.compareTo(o.name);
        if (this.price != o.price) return this.price > o.price ? 1 : -1;
        if (this.isPresent != o.isPresent) return this.isPresent ? 1 : -1;
        return 0;
    }
}
