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
    public void display() {
        for( Person person : book )
            System.out.println(person);
    }
}
