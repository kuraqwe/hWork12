public class Author {
    private String authorName;
    private String authorSurname;

    public Author(String authorName, String authorSurname){
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorSurname(){
        return this.authorSurname;
    }
    @Override
    public String toString() {
        return "автор " + this.authorName + " " + this.authorSurname;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(authorName, authorSurname);
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()){
            return false;
        }
        Author c2 = (Author) other;
        return authorName.equals(c2.authorName) && authorSurname.equals(c2.authorSurname);
    }

}

