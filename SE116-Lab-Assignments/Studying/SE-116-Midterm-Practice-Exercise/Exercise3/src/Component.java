import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

abstract class Component {
    private String modelName;
    private double price;
    private double powerUsage;

    public Component(String modelName, double price, double powerUsage) {
        this.modelName = modelName;
        this.price = price;
        this.powerUsage = powerUsage;
    }

    public String getModelName() {
        return modelName;
    }
    public double getPrice() {
        return price;
    }
    public double getPowerUsage() {
        return powerUsage;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setPowerUsage(double powerUsage) {
        this.powerUsage = powerUsage;
    }

    public abstract void upgradeSpecs();
    public abstract String getType();

    @Override
    public String toString(){
        return "Model Name: "+modelName+" Price: "+price+" Power Usage: "+powerUsage;
    }
}

class CPU extends Component {
    private double cores;

    public CPU(String modelName, double price, double powerUsage, double cores){
        super(modelName, price, powerUsage);
        this.cores = cores;
    }

    @Override
    public void upgradeSpecs() {cores *= 2;}

    @Override
    public String getType() {return "CPU";}

    @Override
    public String toString() {return super.toString() + " Cores: "+cores;}

}

class RAM extends Component {
    private double capacityGB;

    public RAM(String modelName, double price, double powerUsage, double capacityGB) {
        super(modelName, price, powerUsage);
        this.capacityGB = capacityGB;
    }

    @Override
    public void upgradeSpecs() {capacityGB *= 2;}

    @Override
    public String getType() {return "RAM";}

    @Override
    public String toString() {return super.toString()+" Capacity GB: "+capacityGB;}
}

class GPU extends Component {
    private double memorySize;

    public GPU(String modelName, double price, double powerUsage, double memorySize) {
        super(modelName, price, powerUsage);
        this.memorySize = memorySize;
    }

    @Override
    public void upgradeSpecs() {memorySize *= 2;}

    @Override
    public String getType() {return "GPU";}

    @Override
    public String toString() {return super.toString()+" Memory Size: "+memorySize;}
}

class FactoryDemo{
    public static void main(String[] args) {

        CPU cpu = new CPU("Intel i5", 99,10,4);
        RAM ram = new RAM("Corsair", 10, 5, 8);
        GPU gpu = new GPU("Nvidia", 150, 22, 2048);

        System.out.println(cpu.getType());
        System.out.println(ram.toString());
        System.out.println(gpu.toString());
        gpu.upgradeSpecs();
        System.out.println(gpu.toString());

        HashMap<String, Component> hashMap = new HashMap<>();
        hashMap.put("da", cpu);

        ArrayList<Component> arrayList = new ArrayList<>();
        arrayList.add(cpu);
        arrayList.add(gpu);
        arrayList.add(ram);

        Collections.sort(arrayList, (c1, c2) -> Double.compare(c2.getPrice(), c1.getPrice()));
        System.out.println(arrayList);
    }
}