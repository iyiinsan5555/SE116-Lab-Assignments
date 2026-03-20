public class Lab4BonusVehicle {
    private String licencePlate;
    private double dailyRate;

    public Lab4BonusVehicle(String licencePlate, double dailyRate) {
        this.licencePlate = licencePlate;
        this.dailyRate = dailyRate;
    }

    public double calculateRental(int days) {
        return days * dailyRate;
    }

    public boolean checkRisk() {
        return false;
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
