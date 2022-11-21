import java.util.*;
public class Employee {



}

class EmployeeData
{
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("--------MeNu---------\n1.Add Employee\n2.View All\n3.Search Employee\n4.Delete Employee\5.Exit ");

        int ch = reader.nextInt();

        Employee e1 = new Employee();

        switch (ch)
        {
            case 1:
                e1.add();
                break;
            case 2:
                e1.viewAll();
                break;
            case 3:
                e1.searchItem();
            case 4:
                e1.deleteItem();
            case 5:
                System.exit(0);
            default:
                System.out.println("Enter a valid option");
        }

    }
}
