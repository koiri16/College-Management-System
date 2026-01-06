public class Faculty {
    int facultyId;
    String name;
    String department;
    String subject;

    public Faculty(int facultyId, String name, String department, String subject) {
        this.facultyId = facultyId;
        this.name = name;
        this.department = department;
        this.subject = subject;
    }

    public void display() {
        System.out.println(facultyId + " | " + name + " | " + department + " | " + subject);
    }
}
