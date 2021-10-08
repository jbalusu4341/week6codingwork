import java.util.*;

public class Book {
    BookPublication publication;
    BookPrint print;
    BookDeliver deliver;
    BookState state;
    String name;
    List<String> pages;

    void Book(List<String> pages) {
        this.pages = pages;
    }

    public Book() {
        publication = new BookPublication(this);
        print = new BookPrint(this);
        deliver = new BookDeliver(this);
        state = publication;
    }

    public void Publication() {
        state.Publication();
    }

    public void Print() {
        state.Print();
    }

    public void setState(BookState state) {
        this.state = state;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("-"+ this.name + "-\n");
        for (String pages : pages) {
            display.append(pages + "\n");
        }
        return display.toString();
    }

    void prepareBook() {
        System.out.println("Prepare Book" + name);
        for (String pages : pages) {
            System.out.println("   " +pages);
        }
    }
}