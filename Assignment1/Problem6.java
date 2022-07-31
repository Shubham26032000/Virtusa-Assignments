package AssignmentVirtusa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("Enter size of list");
        int size = scanner.nextInt();
        scanner.nextLine();
        for(int i=1;i<=size; i++)
        {
            System.out.println("Enter element");
            String el = scanner.nextLine().trim();

            list.add(el);
        }
        System.out.println(list);
        System.out.println("Enter element to be search");
        String element = scanner.nextLine().trim();
        if(!list.contains(element))
            System.out.println("element not found in list");
        else
            System.out.println("Element found at index "+list.indexOf(element));

        System.out.println("Enter element to be remove");
        String removeEl = scanner.nextLine().trim();
        if(!list.remove(removeEl))
            System.out.println("Element "+removeEl+" not present in list");
        else
            System.out.println(list);
    }
}
