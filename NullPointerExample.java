
public class NullPointerExample extends Throwable {
    
    public static void main(String[] args) throws NullPointerExample
    {
    
        // Declare our variables in this section
        
    
        // Initialize realPerson
        Person p = new Person("P", 0);
        // Initialize to a new Person, get a new memory address
        Person ghost;
        
        // ghost is never initialized, so there is no
        // memory address to point to.
        // Instead, the value held in the variable is null

        System.out.println(ghost);
    }
}
