public class Main
{
    public static void main(String[] args)
    {
        Author author= new Author("khaiquang@gmail.com", "Khai", 'M');
        System.out.println(author);
        System.out.println(author.getEmail());
        System.out.println(author.getName());
        System.out.println(author.getGender());


        Book MarioPuzo= new Book("GodFather", author,19.95, 99);
        System.out.println(MarioPuzo);
        MarioPuzo.setPrice(29.95);
        MarioPuzo.setQty(28);
        System.out.println("name is: " + MarioPuzo.getName());
        System.out.println("price is: " + MarioPuzo.getPrice());
        System.out.println("qty is: " + MarioPuzo.getQty());
        System.out.println("Author is: " + MarioPuzo.getAuthor());  // Author's toString()
        System.out.println("Author's name is: " + MarioPuzo.getAuthor().getName());
        System.out.println("Author's email is: " + MarioPuzo.getAuthor().getEmail());
    }
}