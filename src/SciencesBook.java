public class SciencesBook extends BookBuilder{
    public SciencesBook() {
        this.name = "Programming Books";
    }

    @Override
    public BookBuilder addBookName() {
        this.subject.add("BIOLOGY");
        return this;
    }

    @Override
    public BookBuilder addTitle() {
        this.subject.add("Science Book");
        return this;
    }

    @Override
    public BookBuilder addPageNumber() {
        this.subject.add("Page number 1");
        return this;
    }

    @Override
    public BookBuilder addAuthorName() {
        return this;
    }

    @Override
    public BookBuilder addChapter() {
        this.subject.add("Chapter 1");
        return this;
    }
}
