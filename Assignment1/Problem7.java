package AssignmentVirtusa;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        System.out.println("Enter size of set1");
        int size1 = scanner.nextInt();
        for(int i=1; i<=size1; i++)
        {
            System.out.println("Enter element "+i);
            int element = scanner.nextInt();
            set1.add(element);
        }
        System.out.println("Enter size of set2");
        int size2 = scanner.nextInt();
        for(int i=1; i<=size2; i++)
        {
            System.out.println("Enter element "+i);
            int element = scanner.nextInt();
            set2.add(element);
        }

        System.out.println(set1);
        System.out.println(set2);

        System.out.print("Common elements : ");
        Iterator<Integer> iterator = set1.iterator();
        while (iterator.hasNext())
        {
            int element = iterator.next();
            if (set2.contains(element))
            {
                System.out.print(element+" ");
            }
        }
    }
}
