import java.util.Scanner;

public class AddressBookMain {
    private void options(){
        boolean status = true;
        Scanner scan = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        while( status ) {
            System.out.println("Hello Enter your option to perform actions: \n[ press 1 to add new person"+
                    "\npress 2 to update/edit details \npress 3 to Display details \npress 4 to Delete your details " +
                    "\npress 5 to sort the details according to person firstname \npress 6 to sort on the basis" +
                    "of zip, state, or city \npress 7 to view Person by City or State \npress 8 to Exit. ]");
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
                case 6 :
                    System.out.println("Hi!! on what basis you would like to sort the details \npress 1 to sort " +
                            "on the basis of Zip \npress 2 to sort on the basis of city \npress 3 to sort on the " +
                            "basis of state");
                    int optionToSort = scan.nextInt();
                    if(optionToSort == 1) {
                        addressBook.sortZip();
                        break;
                    }
                    else if(optionToSort == 2) {
                        addressBook.sortCity();
                        break;
                    }
                    else {
                        addressBook.sortState();
                        break;
                    }
                case 7 :
                    System.out.println("Press 1 to view person by city \nPress 2 to view person by state");
                    int viewChoice = scan.nextInt();
                    if( viewChoice == 1) {
                        System.out.println("Please Enter the City name: ");
                        String city = scan.next();
                        addressBook.viewByCity(city);
                        break;
                    }
                    else {
                        System.out.println("Please Enter the State name: ");
                        String state = scan.next();
                        addressBook.viewByState(state);
                        break;

                    }
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
