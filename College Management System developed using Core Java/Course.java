public class Course {

    int courseId;
    String courseName;
    String duration;
    String department;

    public Course(int courseId, String courseName, String duration, String department) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.duration = duration;
        this.department = department;
    }

    public void display() {
        System.out.println(courseId + " | " + courseName + " | " + duration + " | " + department);
    }
}

