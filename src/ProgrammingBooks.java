public class ProgrammingBooks extends BookBuilder{
    public ProgrammingBooks() {
        this.name = "Programming Books";
    }

    @Override
    public BookBuilder addBookName() {
        this.subject.add("Java");
        return this;
    }

    @Override
    public BookBuilder addTitle() {
        this.subject.add("JAVA PROGRAMMING");
        return this;
    }

    @Override
    public BookBuilder addPageNumber() {
        this.subject.add("Numbering 1");
        return this;
    }

    @Override
    public BookBuilder addAuthorName() {
        this.subject.add("Author");
        return this;
    }

    @Override
    public BookBuilder addChapter() {
        this.subject.add("Chapter 1");
        return this;
    }
}
