import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        CollegeService service = new CollegeService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- College Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Add Faculty");
            System.out.println("4. View Faculty");
            System.out.println("5. Add Course");
            System.out.println("6. View Courses");
            System.out.println("7. Delete Student");
            System.out.println("8. Add Fees");
            System.out.println("9. View Fees");
            System.out.println("10. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    service.addStudent();
                    break;
                case 2:
                    service.viewStudents();
                    break;
                case 3:
                    service.addFaculty();
                    break;
                case 4:
                    service.viewFaculty();
                    break;
                case 5:
                    service.addCourse();
                    break;

                case 6:
                    service.viewCourses();
                    break;

                case 7:
                    service.deleteStudent();
                    break;

                case 8:
                    service.addFees();
                    break;

                case 9:
                    service.viewFees();
                    break;

                case 10:
                    System.out.println("Thank You!");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
