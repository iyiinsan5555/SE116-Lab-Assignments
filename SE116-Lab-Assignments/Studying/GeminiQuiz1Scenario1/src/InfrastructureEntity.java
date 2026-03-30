public abstract class InfrastructureEntity {
    private String entityID;
    private String location;
    private double integrity; //Percentage from 0 to 100

    public InfrastructureEntity(String entityID, String location, double integrity) {
        this.entityID = entityID;
        this.location = location;
        this.integrity = integrity;
    }
    public void statusReport() {
        System.out.println("-----------------------");
        System.out.println("EntityID: "+this.entityID);
        System.out.println("Location: "+this.location);
        System.out.println("Integrity: "+this.integrity);
        System.out.println("-----------------------");
    }

    public abstract double calculateOperationalCost(); //returns the daily cost to run the entity.

    public String getEntityID() {
        return entityID;
    }

    public void setEntityID(String entityID) {
        this.entityID = entityID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getIntegrity() {
        return integrity;
    }

    public void setIntegrity(double integrity) {
        this.integrity = Math.clamp(integrity, 0, 100);
    }
}
