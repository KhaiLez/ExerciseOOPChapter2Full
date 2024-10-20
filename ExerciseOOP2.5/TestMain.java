public class TestMain
{
    public static void main(String[] args)
    {
        Customer customer= new Customer(78, "Vito Corleone", 'M');
        Customer customer1= new Customer(54, "Vincent Corleone", 'M');
        System.out.println(customer);

        Account account= new Account(101101, customer, 4000 );
        Account account1= new Account(1011012, customer1, 5000 );
        System.out.println(account);
        System.out.println(account1);

        account.setBalance(9999);
        System.out.println(account);
        account.deposit(1000);
        System.out.println("After add:"+account);
        account.withdraw(2000);
        System.out.println("After subtract:"+account);
        System.out.println(account);

        account1.setBalance(5000);
        account1.withdraw(6000);
        System.out.println(" Failed!");
    }
}
