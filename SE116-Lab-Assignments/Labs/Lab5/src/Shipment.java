public class Shipment {
    private String trackingNo;
    private String contentType;
    private int weightKg;
    private int distanceKm;

    public Shipment(String trackingNo, String contentType, int weightKg, int distanceKm) {
        this.trackingNo = trackingNo;
        this.contentType = contentType;
        this.weightKg = weightKg;
        this.distanceKm = distanceKm;
    }

    public String getTrackingNo() {return this.trackingNo;}
    public String getContentType() {return this.contentType;}
    public int getWeightKg() {return this.weightKg;}
    public int getDistanceKm() {return this.distanceKm;}

    public void setTrackingNo(String trackingNo) {this.trackingNo = trackingNo;}
    public void setContentType(String contentType) {this.contentType = contentType;}
    public void setWeightKg(int weightKg) {this.weightKg = weightKg;}
    public void setDistanceKm(int distanceKm) {this.distanceKm = distanceKm;}

    public double calculateFee() {
        return -1.1;
    }
    //did not know getClass()
    public void printReceipt() {
        System.out.println("Tracking Number: "+trackingNo);
        System.out.println("Content Type: "+contentType);
        System.out.println("Shipment Type: "+getClass().getName());
        System.out.println("Weight (KG): "+weightKg);
        System.out.println("Distance (KM): "+distanceKm);
        System.out.println("Total Fee: "+calculateFee());
        System.out.println();
    }

}
