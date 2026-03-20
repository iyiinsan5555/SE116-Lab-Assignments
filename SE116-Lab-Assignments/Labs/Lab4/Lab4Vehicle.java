public class Lab4Vehicle {
    private String licencePlate;
    private double dailyRate;

    public Lab4Vehicle(String licencePlate, double dailyRate) {
        this.licencePlate = licencePlate;
        this.dailyRate = dailyRate;
    }

    public double calculateRental(int days) {
        return days * dailyRate;
    }

    public void safetyCheck() {
        System.out.println("Lights are safe?? Breaks are also safe?");
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }
}
