public class Student {
    int rollNo;
    String name;
    String course;
    String department;
    String contact;

    public Student(int rollNo, String name, String course, String department, String contact) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
        this.department = department;
        this.contact = contact;
    }

    public void display() {
        System.out.println(
            rollNo + " | " + name + " | " + course + " | " + department + " | " + contact
        );
    }
}
