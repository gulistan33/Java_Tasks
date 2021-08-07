package AddressTask;

import java.util.Scanner;

public class AddressObject {
    public static void main(String[] args) {
        Address address = new Address();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your building number?");
        String building = scan.next();

        scan.nextLine();
        System.out.println("street name");
        String street = scan.nextLine();

        System.out.println("city");
        String city = scan.nextLine();

        System.out.println("state");
        String state = scan.nextLine();

        System.out.println("zip code");
        int zipcode = scan.nextInt();

        address.setInfo(building, street, city, state, zipcode);
        System.out.println(address);
    }

}
