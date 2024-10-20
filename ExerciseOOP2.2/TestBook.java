public class TestBook
{
    public static void main(String[] args)
    {
        Author author= new Author("khaiquang@gmail.com", "Khai", 'M');
        System.out.println(author);
        System.out.println(author.getEmail());
        System.out.println(author.getName());
        System.out.println(author.getGender());

        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);


        Book MarioPuzo= new Book("GodFather", authors,19.95, 99);
        System.out.println(MarioPuzo);
        MarioPuzo.setPrice(29.95);
        MarioPuzo.setQty(28);
        System.out.println("name is: " + MarioPuzo.getName());
        System.out.println("price is: " + MarioPuzo.getPrice());
        System.out.println("qty is: " + MarioPuzo.getQty());
        System.out.println(authors[0]);
        System.out.println(authors[1]);
        System.out.println("Author's name is: " + MarioPuzo.getAuthorNames());
    }
}

