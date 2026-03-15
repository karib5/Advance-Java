import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee[] emp = new Employee[3];

        for(int i=0;i<3;i++) {

            System.out.println("\nEnter Employee Type (1=Officer, 2=Staff): ");
            int type = sc.nextInt();

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Date of Birth(dd-mm-yyyy): ");
            String dob = sc.nextLine();

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            System.out.print("Enter Joining Day: ");
            int day = sc.nextInt();

            System.out.print("Enter Joining Month: ");
            int month = sc.nextInt();

            System.out.print("Enter Joining Year: ");
            int year = sc.nextInt();

            if(type == 1) {
                emp[i] = new Officer(id,name,dob,email,day,month,year);
            }
            else {
                emp[i] = new Staff(id,name,dob,email,day,month,year);
            }
        }

        System.out.println("\n===== Employee Details =====");

        for(Employee e : emp) {
            e.display();
            e.calculateLeave();
            System.out.println("----------------------");
        }

        sc.close();
    }
}