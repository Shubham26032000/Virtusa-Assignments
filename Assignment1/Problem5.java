package AssignmentVirtusa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of first list");
        int size1 = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter "+size1+" elements followed by spaces ");
        for(int i=0; i<size1; i++)
        {
            int number = scanner.nextInt();
            list.add(number);
        }
        System.out.println("Enter size of sublist");
        int size2 = scanner.nextInt();
        List<Integer> subList = new ArrayList<>();
        System.out.println("Enter "+size2+" elements followed by spaces ");
        for(int i=0; i<size2; i++)
        {
            int number = scanner.nextInt();
            subList.add(number);
        }

        System.out.println("main list : "+list);
        System.out.println("sublist   : "+subList);
        System.out.println("first occurrence of sublist : "+ Collections.indexOfSubList(list,subList));
        System.out.println("last occurrence of sublist  : "+Collections.lastIndexOfSubList(list,subList));
    }
}
