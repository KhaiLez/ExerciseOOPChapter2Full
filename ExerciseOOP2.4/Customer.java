public class Customer
{
    int id, discount;
    String name;

    public Customer(int id, String name, int discount)
    {
        this.id=id;
        this.name=name;
        this.discount=discount;
    }

    public int getId()
    {
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }

    public int getDiscount()
    {
        return this.discount;
    }

    public void setDiscount(int discount)
    {
        this.discount=discount;
    }

    public String toString()
    {
        return name+"("+id+")"+"("+discount+"%)";
    }
}