public class Attendance {
    int rollNo;
    String date;
    String status;

    public Attendance(int rollNo, String date, String status) {
        this.rollNo = rollNo;
        this.date = date;
        this.status = status;
    }

    public void display() {
        System.out.println(rollNo + " | " + date + " | " + status);
    }
}
