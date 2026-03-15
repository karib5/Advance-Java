public class Employee {

    protected int id;
    protected String name;
    protected String dob;
    protected String email;
    protected int day;
    protected int month;
    protected int year;

    public Employee(int id, String name, String dob, String email, int day, int month, int year) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getTotalDays() {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return 366;
        }
        return 365;
    }

    public int remainingDays() {

        int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};

        if (getTotalDays() == 366) {
            monthDays[1] = 29;
        }

        int daysPassed = 0;

        for(int i = 0; i < month-1; i++) {
            daysPassed += monthDays[i];
        }

        daysPassed += day;

        return getTotalDays() - daysPassed + 1;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("DOB: " + dob);
        System.out.println("Email: " + email);
        System.out.println("Joining Date: " + day + "/" + month + "/" + year);
    }

    public void calculateLeave() {

    }
}