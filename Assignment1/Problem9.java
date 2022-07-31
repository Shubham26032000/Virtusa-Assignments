package AssignmentVirtusa;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Employee,Integer> treeMap = new TreeMap<Employee, Integer>(new EmploeeComparator());
        System.out.println("Enter number of employees");
        int size = scanner.nextInt();
        for(int i=0; i<size; i++)
        {
            System.out.println("Enter Employee "+(i+1));
            System.out.print("Enter employee id : ");
            int id = scanner.nextInt();
            System.out.print("Enter employee name : ");
            scanner.nextLine();
            String name = scanner.nextLine().trim();
            System.out.print("Enter location : ");
            String location= scanner.nextLine();
            Employee employee = new Employee(id,name,location);
            treeMap.put(employee,employee.getId());
            System.out.println();
        }

        System.out.println(treeMap);

    }
}

class EmploeeComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        return e2.getName().compareTo(e1.getName());
    }
}
class Employee{
    private int id;
    private String name;
    private String location;

    public Employee(){

    }

    public Employee(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}