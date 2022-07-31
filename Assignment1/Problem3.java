package AssignmentVirtusa;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of list");
        int size = scanner.nextInt();
        System.out.println("Enter "+size+" elements followed by spaces");
        for(int i=0; i<size; i++)
        {
            int number = scanner.nextInt();
            list.add(number);
        }
        System.out.println("Enter first element");
        int firstElement = scanner.nextInt();
        System.out.println("Enter last element");
        int lastElement = scanner.nextInt();
        System.out.println("List before insertion of first & last element ");
        System.out.println(list);
        list.add(0, firstElement);
        list.add(lastElement);
        System.out.println("List after insertion of first = "+firstElement+" last = "+lastElement);
        System.out.println(list);
    }
}
