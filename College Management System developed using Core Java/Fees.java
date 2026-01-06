public class Fees {
    int rollNo;
    double amount;
    String status;

    public Fees(int rollNo, double amount, String status) {
        this.rollNo = rollNo;
        this.amount = amount;
        this.status = status;
    }

    public void display() {
        System.out.println(rollNo + " | " + amount + " | " + status);
    }
}
