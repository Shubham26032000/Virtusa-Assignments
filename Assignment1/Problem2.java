package AssignmentVirtusa;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Problem2 {
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
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious())
        {
            System.out.println(iterator.previous());
        }
    }
}
