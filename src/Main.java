import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> book = new TreeSet<>();
        book.add(new Book("Harry Potter and The Philosopher's Stone", 200, "J.K.ROWLING",
                "26.06.1997"));
        book.add(new Book("Harry Potter and The Chamber of Secrets", 300, "J.K.ROWLING",
                "02.07.1998"));
        book.add(new Book("Harry Potter and The Prisoner of Azkaban", 350, "J.K.ROWLING",
                "08.07.1999"));
        book.add(new Book("Harry Potter and The Goblet of Fire", 400, "J.K.ROWLING",
                "08.07.2000"));
        book.add(new Book("Harry Potter and The Order of The Phoenix", 550, "J.K.ROWLING",
                "21.06.2003"));
        book.add(new Book("Harry Potter and The Half Blood Prince", 500, "J.K.ROWLING",
                "16.07.2005"));
        book.add(new Book("Harry Potter and The Deathly Hallows", 900, "J.K.ROWLING",
                "21.07.2007"));


        for(Book b : book) {
            System.out.println(b.getName() + ", " + b.getTotalPage());
        }
    }
}