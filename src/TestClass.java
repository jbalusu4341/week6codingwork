public class TestClass {
    public static void main(String[] args) {
        System.out.println("Order Programming Book");
        BookBuilder bookBuilder = new ProgrammingBooks();
        Book book = bookBuilder.addBookName().addTitle().addPageNumber().addAuthorName().addChapter().build();

        book.setState(new BookPublication(book));
        book.Publication();
        book.prepareBook();

        book.setState(new BookPrint(book));
        book.Publication();
        book.Print();

        book.setState(new BookDeliver(book));
        book.Publication();
        book.Print();

        book.setState(new BookPublication(book));
        book.Print();

        System.out.println();
        System.out.println("Order A Science Book");
        BookBuilder bookBuilder1 = new SciencesBook();
        Book book1 = bookBuilder1.addBookName().addTitle().addPageNumber().addChapter().build();

        book1.setState(new BookPublication(book));
        book1.Publication();
        book1.prepareBook();

        book1.setState(new BookPrint(book));
        book1.Publication();
        book1.Print();

        book1.setState(new BookDeliver(book));
        book1.Publication();
        book1.Print();

        book1.setState(new BookPublication(book));
        book1.Print();
    }
}
