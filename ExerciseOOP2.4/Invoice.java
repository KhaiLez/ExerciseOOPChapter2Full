public class Invoice
{
    int id;
    Customer customer;
    double amount;

    public Invoice(int id, Customer customer, double amount)
    {
        this.id=id;
        this.customer=customer;
        this.amount=amount;
    }

    public int getId()
    {
        return this.id;
    }

    public Customer getCustomer()
    {
        return this.customer;
    }

    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }

    public double getAmount()
    {
        return this.amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }

    public int getCustomerId()
    {
        return customer.getId();
    }

    public String getCustomerName()
    {
        return customer.getName();
    }

    public int getCustomerDiscount()
    {
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount()
    {
        this.amount=this.amount-((customer.getDiscount()*this.amount)/100);
        return this.amount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", customer=" + customer +
                ", amount=" + amount +
                '}';
    }
}
