public class Book {
    private String name;
    private String authorName;
    private int publicationYear;

    public Book(String authorName, String name, int publicationYear) {
        this.authorName = authorName;
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthorName(){
        return this.authorName;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }
}

