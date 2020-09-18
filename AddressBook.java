import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook implements AddressBookInfo {

    List<Person> book = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    @Override
    public void add() {
        System.out.println("Enter the Person Firstname: ");
        String firstName = scan.nextLine();
        System.out.println("Enter the Person Lastname: ");
        String lastName = scan.nextLine();
        System.out.println("Enter the Person Address: ");
        String address = scan.nextLine();
        System.out.println("Enter the Person City: ");
        String city = scan.nextLine();
        System.out.println("Enter the Person State: ");
        String state = scan.nextLine();
        System.out.println("Enter the Person Phone Number: ");
        long phoneNumber = scan.nextLong();
        System.out.println("Enter the Zip code: ");
        scan.nextLine();
        String zip = scan.nextLine();
        Person person = new Person(firstName,lastName,address,city,state,phoneNumber,zip);
        book.add(person);
        System.out.println("Successfully Added!!");
    }
    @Override
    public void edit(String firstName) {
        for( int search = 0 ; search < book.size() ; search++ ) {

            if( book.get(search).getFirstName().equalsIgnoreCase(firstName)) {
                Person person = book.get(search);
                System.out.println("Hi  "+person.getFirstName()+" Please edit your details");
                System.out.println("Hi Person "+person.getFirstName()+" Please edit your address");
                scan.next();
                String address = scan.nextLine();
                person.setAddress(address);
                System.out.println("Hi  "+person.getFirstName()+" Please edit your city");
                String city = scan.next();
                person.setCity(city);
                System.out.println("Hi "+person.getFirstName()+" Please edit your state");
                String state = scan.next();
                person.setState(state);
                System.out.println("Hi "+person.getFirstName()+" Please edit your phone number");
                long phone = scan.nextLong();
                person.setPhoneNumber(phone);
                System.out.println("Hi "+person.getFirstName()+" Please edit your zip");
                scan.nextLine();
                String zip = scan.nextLine();
                person.setZip(zip);
                System.out.println("Hi "+person.getFirstName()+" Successfully you have updated your details. ");
            }
        }

    }
    public void display() {
        for( Person person : book )
            System.out.println(person);
    }
}
