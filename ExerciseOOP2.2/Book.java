import java.util.Arrays;

public class Book
{
    String name;
    Author[] authors;
    double price;
    int qty=0;

    public Book(String name, Author[] authors, double price)
    {
        this.name=name;
        this.authors=authors;
        this.price=price;
    }

    public Book(String name, Author[] authors, double price, int qty)
    {
        this.name=name;
        this.authors=authors;
        this.price=price;
        this.qty=qty;
    }

    public String getName()
    {
        return this.name;
    }

    public Author[] getAuthors()
    {
        return this.authors;
    }

    public double getPrice()
    {
        return this.price;
    }

    public void setPrice(double price)
    {
        this.price=price;
    }

    public int getQty()
    {
        return this.qty;
    }

    public void setQty(int qty)
    {
        this.qty=qty;
    }

    public String getAuthorNames()
    {
        String authorNames="";
        for(int i=0; i<authors.length; i++)
        {
            authorNames += authors[i].getName()+", ";
        }
        return authorNames;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}