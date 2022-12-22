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
    @Override
    public String toString() {
        return "Название " + this.name + ", " + this.author + ", год публикации " + this.publicationYear;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, author, publicationYear);
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()){
            return false;
        }
        Book c2 = (Book) other;
        return name.equals(c2.name) && author.equals(c2.author) && (publicationYear == c2.publicationYear);
    }
}

