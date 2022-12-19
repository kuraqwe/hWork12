public class Book {
    private String name;
    private Author author;
    private int publicationYear;

    public Book(Author author, String name, int publicationYear) {
        this.author = author;
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor(){
        return this.author;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }
}

