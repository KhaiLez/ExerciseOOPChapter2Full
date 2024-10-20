public class Author
{
    String email, name;
     char gender;

    Author(String email, String name, char gender)
    {
        this.email = email;
        this.name = name;
        this.gender = gender;
    }
    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getName()
    {
        return name;
    }

    public char getGender()
    {
        return gender;
    }
    public String toString()
    {
        return "Author{" +
                "email='" + email + '\''+
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
