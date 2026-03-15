public class Staff extends Employee {

    public Staff(int id, String name, String dob, String email, int day, int month, int year) {
        super(id, name, dob, email, day, month, year);
    }

    @Override
    public void calculateLeave() {

        int remaining = remainingDays();
        int totalDays = getTotalDays();

        double vacation = (remaining * 10.0) / totalDays;
        double sick = (remaining * 7.0) / totalDays;

        int vacationLeave = (vacation < 0.5) ? (int)Math.floor(vacation) : (int)Math.ceil(vacation);
        int sickLeave = (sick < 0.5) ? (int)Math.floor(sick) : (int)Math.ceil(sick);

        System.out.println("Employee Type: Staff");
        System.out.println("Vacation Leave: " + vacationLeave);
        System.out.println("Sick Leave: " + sickLeave);
    }
}