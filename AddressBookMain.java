import java.util.Scanner;

public class AddressBookMain {
    private void options(){
        boolean status = true;
        Scanner scan = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        while( status ) {
            System.out.println("Hello Enter your option to perform actions: \n press 1 to add new person" +
                    " \n press 2 to display details \n press 5 to quit");
            int choice = scan.nextInt();
            switch (choice) {
                case 1 : addressBook.add();
                        break;
                case 2 : addressBook.display();
                        break;
                default: status = false;
            }
        }
    }
    public static void main(String args[]){
        AddressBookMain main = new AddressBookMain();
        main.options();

    }
}
