import java.util.*;

public class CollegeService {

    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Faculty> facultyList = new ArrayList<>();
    ArrayList<Course> courses = new ArrayList<>();
    ArrayList<Attendance> attendanceList = new ArrayList<>();
    ArrayList<Fees> feesList = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    // Student
    void addStudent() {
    try {
        System.out.print("Roll No: ");
        int r = sc.nextInt();
        sc.nextLine();

        // ❌ Duplicate roll number check
        for (Student s : students) {
            if (s.rollNo == r) {
                System.out.println("Student with this Roll No already exists!");
                return;
            }
        }

        System.out.print("Name: ");
        String n = sc.nextLine();

        System.out.print("Course: ");
        String course = sc.nextLine();

        System.out.print("Department: ");
        String d = sc.nextLine();

        System.out.print("Contact: ");
        String c = sc.nextLine();

        students.add(new Student(r, n, course, d, c));
        System.out.println("Student Added Successfully");

    } catch (InputMismatchException e) {
        System.out.println("Invalid input!");
        sc.nextLine();
    }
}

    // Faculty
    void addFaculty() {
        System.out.print("Faculty ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String n = sc.nextLine();
        System.out.print("Department: ");
        String d = sc.nextLine();
        System.out.print("Subject: ");
        String s = sc.nextLine();

        facultyList.add(new Faculty(id, n, d, s));
        System.out.println("Faculty Added Successfully");
    }

    void viewFaculty() {
        for (Faculty f : facultyList) {
            f.display();
        }
    }


// ================= COURSE =================

void addCourse() {
    try {
        System.out.print("Course ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        // Duplicate course ID check
        for (Course c : courses) {
            if (c.courseId == id) {
                System.out.println("Course with this ID already exists!");
                return;
            }
        }

        System.out.print("Course Name: ");
        String name = sc.nextLine();

        System.out.print("Duration: ");
        String duration = sc.nextLine();

        System.out.print("Department: ");
        String dept = sc.nextLine();

        courses.add(new Course(id, name, duration, dept));
        System.out.println("Course Added Successfully");

    } catch (InputMismatchException e) {
        System.out.println("Invalid input! Please enter correct data.");
        sc.nextLine();
    }
}

void viewCourses() {
    if (courses.isEmpty()) {
        System.out.println("No Course Records Found");
        return;
    }

    System.out.println("ID | Course Name | Duration | Department");
    for (Course c : courses) {
        c.display();
    }
}

void viewStudents() {
    if (students.isEmpty()) {
        System.out.println("No Student Records Found");
        return;
    }

    System.out.println("Roll | Name | Course | Department | Contact");
    for (Student s : students) {
        s.display();
    }
}

void deleteStudent() {
    System.out.print("Enter Roll No to Delete: ");
    int roll = sc.nextInt();

    Iterator<Student> it = students.iterator();
    boolean found = false;

    while (it.hasNext()) {
        Student s = it.next();
        if (s.rollNo == roll) {
            it.remove();
            found = true;
            System.out.println("Student Deleted Successfully");
            break;
        }
    }

    if (!found) {
        System.out.println("Student Not Found!");
    }
}

void addFees() {
    try {
        System.out.print("Enter Student Roll No: ");
        int roll = sc.nextInt();

        // Check if student exists
        boolean studentFound = false;
        for (Student s : students) {
            if (s.rollNo == roll) {
                studentFound = true;
                break;
            }
        }

        if (!studentFound) {
            System.out.println("Student not found! Please add student first.");
            return;
        }

        System.out.print("Enter Fees Amount: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        System.out.print("Payment Status (Paid / Pending): ");
        String status = sc.nextLine();

        feesList.add(new Fees(roll, amount, status));
        System.out.println("Fees Added Successfully");

    } catch (InputMismatchException e) {
        System.out.println("Invalid input!");
        sc.nextLine();
    }
}
void viewFees() {
    if (feesList.isEmpty()) {
        System.out.println("No Fees Records Found");
        return;
    }

    System.out.println("Roll No | Amount | Status");
    for (Fees f : feesList) {
        f.display();
    }
}



    
}
