public class Person
{
    private String name;
    private int age;
    
    // Constructor
    public Person(String theName, int theAge)
    {
        this.name = theName;
        this.age =  theAge;
        
    }


    //Default constructor - person with no name or age
    
    Person() {}
    
    // Returns a representation of this person
    public String toString()
    {
        return name;
    }
}
