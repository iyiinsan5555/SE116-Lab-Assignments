public class InternationalShipping extends Shipment{
    public InternationalShipping(String trackingNo, String contentType, int weightKg, int distanceKm) {
        super(trackingNo, contentType, weightKg, distanceKm);
    }

    @Override
    public double calculateFee() {
        double fee = 30.0 + 40.0 + 0.15 * getDistanceKm() + 3.0 * getWeightKg();
        if (getDistanceKm() > 800) {
            fee = 30.0 + 40.0 + 0.15 * getDistanceKm() + 3.0 * getWeightKg() + 35.0;
        }
        return fee;
    }

}
