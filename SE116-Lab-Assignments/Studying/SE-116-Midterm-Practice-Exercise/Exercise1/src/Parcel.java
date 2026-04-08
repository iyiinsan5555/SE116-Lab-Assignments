import java.util.Scanner;
import java.util.HashMap;

public class Parcel {
    private String parcelCode;
    private String category;
    private double mass;
    private double travelDistance;

    public Parcel(String parcelCode, String category, double mass, double travelDistance) {
        this.parcelCode = parcelCode;
        this.category = category;
        this.mass = mass;
        this.travelDistance = travelDistance;
    }

    public String getParcelCode() {return parcelCode;}
    public String getCategory() {return category;}
    public double getMass() {return mass;}
    public double getTravelDistance() {return travelDistance;}

    public void setParcelCode(String parcelCode) {this.parcelCode = parcelCode;}
    public void setCategory(String category) {this.category = category;}
    public void setMass(double mass) {this.mass = mass;}
    public void setTravelDistance(double travelDistance) {this.travelDistance = travelDistance;}

    public double estimateFee() {
        return  5 + ( mass * 2.0) + (travelDistance * 0.05);
    }

    public void displaySlip() {
        System.out.printf("Parcel Code: %s%n Category: %s%n Mass: %f%n Travel Distance: %f%n Estimated Fee: %f%n", parcelCode, category, mass, travelDistance, estimateFee());
    }

    @Override
    public String toString() {
        return parcelCode+"-"+category;
    }

}

class LocalParcel extends Parcel {

    public LocalParcel(String parcelCode, String category, double mass, double travelDistance) {
        super(parcelCode, category, mass, travelDistance);
    }

    @Override
    public double estimateFee() {
        return 8 + (getMass() * 1.5) + (getTravelDistance() * 0.04);
    }
}

class FastTrackParcel extends Parcel {

    public FastTrackParcel(String parcelCode, String category, double mass, double travelDistance) {
        super(parcelCode, category, mass, travelDistance);
    }

    @Override
    public double estimateFee() {
        return 15 + (getMass() * 2.5) + (getTravelDistance() * 0.06);
    }

    public void showUrgentStamp() {
        System.out.println(getClass().getSimpleName() + " has urgent stamp!");
    }
}

class OverseasParcel extends Parcel {

    public OverseasParcel(String parcelCode, String category, double mass, double travelDistance) {
        super(parcelCode, category, mass, travelDistance);
    }

    @Override
    public double estimateFee() {
        double fee = 25 + (getMass() * 3.5) + (getTravelDistance() * 0.08);
        if (getTravelDistance() > 1000) {fee +=40;}
        return fee;
    }

    //It does not matter where I write the main!
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int promptCount = 5;
        HashMap<String, Parcel> parcelHashMap = new HashMap<String, Parcel>();

        Parcel testParcel = new LocalParcel("Code12512", "GoodCategory", 111, 999);
        testParcel.displaySlip();

        for (int i=0; i<promptCount; i++) {
            System.out.print("Enter parcel type(OverseasParcel-FastTrackParcel-LocalParcel): ");
            String parcelType = scanner.nextLine();

            System.out.print("Enter parcel code: ");
            String parcelCode = scanner.nextLine();
            System.out.print("Enter category: ");
            String category = scanner.nextLine();
            System.out.print("Enter mass: ");
            double mass = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter travel distance");
            double travelDistance = Double.parseDouble(scanner.nextLine());

            Parcel promptedParcel = null;

            switch (parcelType) {
                case "OverseasParcel":
                    promptedParcel = new OverseasParcel(parcelCode, category, mass, travelDistance);
                    break;
                case "FastTrackParcel":
                    promptedParcel = new FastTrackParcel(parcelCode, category, mass, travelDistance);
                    break;
                case "LocalParcel":
                    promptedParcel = new LocalParcel(parcelCode, category, mass, travelDistance);
                    break;
            }

            parcelHashMap.put(parcelCode+"-"+category, promptedParcel);

        }

        //Alright it is time to print all the parcels
        for (String key : parcelHashMap.keySet()) {
            Parcel parcel = parcelHashMap.get(key);
            System.out.print(parcel + ", ");

            //if FastTrackParcel --> call showUrgentStamp() method
            if (parcel instanceof FastTrackParcel) {
                FastTrackParcel fastTrackParcel = (FastTrackParcel) parcel;
                fastTrackParcel.showUrgentStamp();
            }
        }


    }
}