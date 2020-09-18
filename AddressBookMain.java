import java.util.Scanner;

public class AddressBookMain {
    private void options(){
        boolean status = true;
        Scanner scan = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        while( status ) {
            System.out.println("Hello Enter your option to perform actions: \n[ press 1 to add new person"+
                    "\npress 2 to update/edit details \npress 3 to Display details \npress 4 to Delete your details " +
                    "\npress 5 to sort the details according to person firstname \n press 6 to quit ]");
            int choice = scan.nextInt();
            switch (choice) {
                case 1 :
                    addressBook.add();
                    break;
                case 2 :
                    System.out.println("Hello Please enter your firstname to update your details");
                    String firstName = scan.next();
                    addressBook.edit(firstName);
                    break;
                case 3 :
                    addressBook.display();
                    break;
                case 4 :
                    System.out.println("Hello Please enter your firstname to delete your details");
                    String firstname = scan.next();
                    addressBook.delete(firstname);
                    break;
                case 5 :
                    System.out.println("Sorted Person details: ");
                    addressBook.sortAlphabetically();
                    break;
                default:
                    status = false;
            }
        }
    }
    public static void main(String args[]){
        AddressBookMain main = new AddressBookMain();
        main.options();

    }
}
