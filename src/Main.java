public class Main {
    public static void main(String[] args) {
        Author AnthonyBurgess = new Author("Энтони", "Бёрджесс");
        Author ViktorPelevin = new Author("Виктор", "Пелевин");
        Book aClockworkOrange = new Book(AnthonyBurgess, "Заводной апельсин", 1962);
        Book generationP = new Book(ViktorPelevin, "Generation 'П'", 1999);
        System.out.println("generationP.getPublicationYear() = " + generationP.getPublicationYear());
        System.out.println("generationP.getPublicationYear() = " + generationP.getPublicationYear());
        System.out.println("aClockworkOrange.getAuthor() = " + aClockworkOrange.getAuthor().getAuthorName());
        System.out.println(aClockworkOrange);
        System.out.println(AnthonyBurgess.equals(ViktorPelevin));
        Book a = new Book(ViktorPelevin, "Generation 'П'", 1999);
        System.out.println(generationP.equals(a));
    }
}