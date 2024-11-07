// Inner Class with Constructor:
// Write a Java program to create an outer class called Person with an inner class Address. 
// The Address class should have a constructor that takes parameters city and state. 
// Create an instance of Address from the Person class and print the address details.
//-----------------------------------------------------------------------------------//
public class ques32 {
    public static void main(String[] args) {
        ques32Person person = new ques32Person();
        ques32Person.Address address = person.new Address("Kuantan", "Pahang");
        String location = address.displayAddress();
        System.out.println("The location will be : " + location);

    }
    
}
