package employee;

public class PartTimeEmployee extends Employee {
	private double workingHours;
    private double hourlyRate;

    public PartTimeEmployee() {}

    public PartTimeEmployee(String id, String name,
                            double workingHours, double hourlyRate) {
        super(id, name, 0);
        setWorkingHours(workingHours);
        setHourlyRate(hourlyRate);
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public boolean setWorkingHours(double workingHours) {
        if (workingHours >= 0) {
            this.workingHours = workingHours;
            return true;
        }
        return false;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public boolean setHourlyRate(double hourlyRate) {
        if (hourlyRate >= 0) {
            this.hourlyRate = hourlyRate;
            return true;
        }
        return false;
    }

    @Override
    public double income() {
        return workingHours * hourlyRate;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", workingHours=" + workingHours +
                ", hourlyRate=" + hourlyRate;
    }
}
