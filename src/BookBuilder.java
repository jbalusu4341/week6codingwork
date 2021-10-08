import java.util.ArrayList;
import java.util.List;

public abstract class BookBuilder {
    String name;
    List<String> subject = new ArrayList<String>();

    public abstract BookBuilder addBookName();
    public abstract BookBuilder addTitle();
    public abstract BookBuilder addPageNumber();
    public abstract BookBuilder addAuthorName();
    public abstract BookBuilder addChapter();

    public Book build() {
        Book book = new Book();
        book.setName(this.name);
        book.Book(subject);
        return book;
    }
}
