package AssignmentVirtusa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of list");
        int size = scanner.nextInt();
        System.out.println("Enter "+size+" elements followed by spaces");
        for(int i=0; i<size; i++)
        {
            int number = scanner.nextInt();
            linkedList.add(number);
        }
        System.out.println("LinkedList");
        System.out.println(linkedList);
        List<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(linkedList);
        System.out.println("ArrayList");
        System.out.println(arrayList);
    }
}
