package AssignmentVirtusa;

import java.util.*;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list1 = new LinkedList<>();
        System.out.println("Enter size of list1");
        int n = scanner.nextInt();
        System.out.println("Enter "+n+" elements of list1");
        for(int i=0; i<n; i++)
        {
            int num = scanner.nextInt();
            list1.add(num);
        }

        List<Integer> list2 = new LinkedList<>();
        System.out.println("Enter size of list2");
        int n2 = scanner.nextInt();
        System.out.println("Enter "+n+" elements of list1");
        for(int i=0; i<n2; i++)
        {
            int num = scanner.nextInt();
            list2.add(num);
        }

        Set<Integer> set = new HashSet<>();
        for(int i=0; i<list1.size(); i++)
        {
            set.add(list1.get(i));
        }
        System.out.print("Inter section of set : ");
        for(int i=0; i<list2.size(); i++)
        {
            if(set.contains(list2.get(i)))
            {
                System.out.print(list2.get(i)+" ");
            }
        }

        for(int i=0; i<list2.size(); i++)
        {
            set.add(list2.get(i));
        }
        System.out.println();
        Iterator<Integer> iterator = set.iterator();
        System.out.println("Union of list");
        while (iterator.hasNext())
        {
            System.out.print(iterator.next()+" ");
        }
        System.out.println(1);
    }
}
