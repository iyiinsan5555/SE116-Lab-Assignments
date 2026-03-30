import java.util.HashMap;

public class CityManager {
    HashMap<String, InfrastructureEntity> entities = new HashMap<String, InfrastructureEntity>();

    public void addEntity(InfrastructureEntity infrastructureEntity) {
        entities.put(infrastructureEntity.getEntityID(), infrastructureEntity);
    }

    public void removeEntity(InfrastructureEntity infrastructureEntity) {
        entities.remove(infrastructureEntity.getEntityID());
    }

    public void processEnergyGrid() {
        for (String key : entities.keySet()) {
            InfrastructureEntity infrastructureEntity = entities.get(key);
            if (infrastructureEntity instanceof EnergyProducer) {
                //Down casting!! important
                EnergyProducer energyProducer = (EnergyProducer) infrastructureEntity;
                System.out.println(energyProducer.generatePower()); //both returns the produced energy and also produces energy
            }
        }
    }

    public void runSecurityCheck() {
        for (String key : entities.keySet()) {
            InfrastructureEntity infrastructureEntity = entities.get(key);
            if (infrastructureEntity instanceof SecurityProtocol) {
                SecurityProtocol securityProtocol = (SecurityProtocol) infrastructureEntity;
                securityProtocol.performScan();
                if (securityProtocol.isBreached()) {
                    System.out.println("High-priority alert!!!");
                }
            }
        }
    }

    public void upgradeAllPossible(double boost) {
        for (String key : entities.keySet()) {
            InfrastructureEntity infrastructureEntity = entities.get(key);
            if (infrastructureEntity instanceof Upgradable) {
                Upgradable upgradable = (Upgradable) infrastructureEntity;
                upgradable.applyFirmwareUpdate(boost);
            }
        }
    }
}
