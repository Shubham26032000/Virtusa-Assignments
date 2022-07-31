package AssignmentVirtusa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("Enter number of Movies :");

        size = scanner.nextInt();
        scanner.nextLine();

        List<String> movieList = new ArrayList<>();
        for(int i=1; i<=size; i++)
        {
            System.out.println("Enter the Movie Name "+i);
            String movie = scanner.nextLine().trim();
            movieList.add(movie);
        }

        System.out.println("Enter the Movie name to be searched:");
        String movie = scanner.nextLine().trim();
        int index = movieList.indexOf(movie);
        if(index != -1){
            System.out.println(movie +" movie found at index "+(index+1));
        }else{
            System.out.println(movie+" Movie is not found");
        }
    }
}
