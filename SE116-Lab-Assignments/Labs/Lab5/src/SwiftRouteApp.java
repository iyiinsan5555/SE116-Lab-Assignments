import java.util.HashMap;
import java.util.Scanner;

public class SwiftRouteApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Shipment> shipments = new HashMap<String, Shipment>();
        int shipmentCount = 0;

        while (shipmentCount<5) {
            System.out.printf("\n===Shipment Entry Menu=== \n" + "1.Standard \n" + "2.Express \n" +"3.International");
            System.out.printf("\nEnter Shipment Type: ");
            String shipmentType = scanner.nextLine();

            if (!checkShipmentType(shipmentType)) {continue;}

            System.out.printf("\nEnter Tracking No: ");
            String trackingNo = scanner.nextLine();
            System.out.printf("\nEnter Content Type: ");
            String contentType = scanner.nextLine();
            System.out.printf("\nEnter Weight (KG): ");
            int weightKg = Integer.parseInt(scanner.nextLine());
            System.out.printf("\nEnter Distance (KM): ");
            int distanceKm = Integer.parseInt(scanner.nextLine());

            Shipment shipmentObject = createShipmentObject(shipmentType, trackingNo, contentType, weightKg, distanceKm);
            shipments.put(trackingNo+contentType, shipmentObject);
            shipmentCount ++;

        }

        //Printing All Shipments
        shipments.forEach((k,v) -> {
            if (v instanceof ExpressShipping) {
                System.out.println("Express Shipping now has 25% sale!");
            }
            v.printReceipt();
        });
    }

    public static boolean checkShipmentType(String shipmentType) {
        switch (shipmentType.toLowerCase()) {
            case "standard":
                return true;
            case "express" :
                return true;
            case "international":
                return true;
            default:
                return false;
        }
    }

    public static Shipment createShipmentObject(String shipmentType, String trackingNo, String contentType, int weightKg, int distanceKm) {
        //Declaration
        Shipment shipmentObject = new Shipment(trackingNo, contentType, weightKg, distanceKm);
        switch (shipmentType.toLowerCase()) {
            case "standard":
                shipmentObject = new StandardShipping(trackingNo, contentType, weightKg, distanceKm);
                break;
            case "express" :
                shipmentObject = new ExpressShipping(trackingNo, contentType, weightKg, distanceKm);
                break;
            case "international":
                shipmentObject = new InternationalShipping(trackingNo, contentType, weightKg, distanceKm);
                break;
        }

        return shipmentObject;
    }
}
