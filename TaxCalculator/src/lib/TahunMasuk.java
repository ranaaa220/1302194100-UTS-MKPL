package lib;

public class TahunMasuk extends Employee{
    private int yearJoined;
	private int monthJoined;
	private int dayJoined;
	private int monthWorkingInYear;

    public TahunMasuk(String employeeId, String firstName, String lastName, String idNumber, String address,
            int yearJoined, int monthJoined, int dayJoined, boolean isForeigner, boolean gender, int yearJoined2,
            int monthJoined2, int dayJoined2, int monthWorkingInYear) {
        super(employeeId, firstName, lastName, idNumber, address, yearJoined, monthJoined, dayJoined, isForeigner,
                gender);
        yearJoined = yearJoined2;
        monthJoined = monthJoined2;
        dayJoined = dayJoined2;
        this.monthWorkingInYear = monthWorkingInYear;
    }
}