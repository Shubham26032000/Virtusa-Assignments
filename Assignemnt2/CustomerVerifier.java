package Assignemnt2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CustomerVerifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Customer Verifier ");
        Pattern customerID = Pattern.compile("C[0-9]{5}");
        Pattern customerName = Pattern.compile("[a-zA-Z ]{3,}");
        Pattern emailId = Pattern.compile("[a-zA-Z0-9_]{3,}@gmail[.]com");

        while (true) {
            System.out.println("-------------------------------------------------");
            Customer customer = new Customer();

            String name;
            while (true) {
                System.out.println("Enter Customer name : ");
                name = sc.nextLine().trim();
                if (!customerName.matcher(name).matches()) {
                    System.out.println("Customer Name - Should be min 3 Chars, Only Alphabets with spaces are allowed");
                    continue;
                } else {
                    break;
                }
            }
            customer.setName(name);
            String id;

            while (true) {
                System.out.print("Enter Customer ID : ");
                id = sc.nextLine().trim();
                if (!customerID.matcher(id).matches()) {
                    System.out.println("Customer ID - Should start with 'C’ followed by 5 Digit Number");
                    continue;
                } else {
                    break;
                }
            }
            customer.setId(id);

            System.out.println("Enter address : ");
            String address = sc.nextLine().trim();
            customer.setAddress(address);
            String email;
            System.out.println("Enter email address : ");
            email = sc.nextLine();
            try {
                if (!emailId.matcher(email).matches()) {
                    // throw new Customer("Invalid Email ID");
                    System.out.println("Invalid Email!!!");
                    customer.setEmail("guest@lntedutech.com");
                } else {
                    customer.setEmail(email);
                }

            } catch (Exception e) {
                customer.setEmail("guest@lntedutech.com");
            }

            System.out.println("Customer is created successfully!!!");
            customer.display();
        }
    }
}
