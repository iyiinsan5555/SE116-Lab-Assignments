import java.util.ArrayList;
import java.util.Scanner;

public class ZooMain {
    public static void main(String[] args) {
        ArrayList<Animal> animalArrayList = new ArrayList<Animal>();
        animalArrayList.add(new Lion(999, "Lion1", 2, 11.1, "Yellow"));
        animalArrayList.add(new Lion(215, "Lion2", 3, 22.2, "Orange"));
        animalArrayList.add(new Turtle(222, "Turtle1", 5, 1.9, "Clean Water"));
        animalArrayList.add(new Turtle(112, "Turtle2", 1, 0.99, "Salty Water"));
        animalArrayList.add(new Dog(2, "Dog1", 2, 33.3, "Breed1"));
        animalArrayList.add(new Dog(777, "Dog2", 2, 12.0, "Breed2"));

        Scanner scanner = new Scanner(System.in);
        boolean shouldRun = true;

        //listAnimals(animalArrayList);

        while (shouldRun) {
            displayMenu();

            int option = scanner.nextInt();
            scanner.nextLine(); // free reading

            System.out.println();

            switch (option) {
                case 0:
                    shouldRun = false;
                    printExitMessage();
                    break;
                case 1:
                    listAnimals(animalArrayList);
                    break;
                case 2:
                    performCareRound(animalArrayList);
                    break;
                case 3:
                    calculateTotalFoodCost(animalArrayList);
                    break;
                case 4:
                    countAnimalTypes(animalArrayList);
                    break;
                case 5:
                    System.out.println("Enter animal ID: ");
                    int animalID = scanner.nextInt();
                    adoptAnimal(animalArrayList, animalID);
                    break;
                default:
                    System.out.println("Please enter valid option.");
            }

        }

    }

    public static void displayMenu() {
        System.out.println("=== Smart Zoo Care System ===");
        System.out.println("1. List all animals");
        System.out.println("2. Perform daily care round");
        System.out.println("3. Show total daily food cost");
        System.out.println("4. Count animal types");
        System.out.println("5. Adopt an animal");
        System.out.println("0. Exit");
        System.out.print("Choose an option:");
    }

    public static void printExitMessage() {
        System.out.println("You are exiting from the zoo care system.");
    }

    public static void printAnimalInformation(int id, String name, double dailyFoodCost, boolean isAdoptable, String animalProperty) {
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Daily food cost:"+dailyFoodCost );
        System.out.println("Is adoptable: "+isAdoptable);
        System.out.println("Animal property: "+ animalProperty );
        System.out.println();
    }

    public static void listAnimals(ArrayList<Animal> animalArrayList) {
        for (Animal animal : animalArrayList) {
            String info = animal.getInfo();
            String[] infoTable = info.split("_");

            int id = Integer.parseInt(infoTable[0]);
            String name = infoTable[1];
            double dailyFoodCost = Double.parseDouble(infoTable[2]);
            boolean isAdoptable = Boolean.parseBoolean(infoTable[3]);
            String extra = infoTable[4];

            printAnimalInformation(id, name, dailyFoodCost, isAdoptable, extra);
        }
    }

    public static void performCareRound(ArrayList<Animal> animalArrayList) {
        for (Animal animal : animalArrayList) {
            String info = animal.getInfo();
            String[] infoTable = info.split("_");

            int id = Integer.parseInt(infoTable[0]);
            String name = infoTable[1];
            double dailyFoodCost = Double.parseDouble(infoTable[2]);
            boolean isAdoptable = Boolean.parseBoolean(infoTable[3]);
            String extra = infoTable[4];

            printAnimalInformation(id, name, dailyFoodCost, isAdoptable, extra);

            animal.makeSound();
            animal.feed();
        }
    }

    public static double calculateTotalFoodCost(ArrayList<Animal> animalArrayList) {
        double totalFoodCost = 0;

        for (Animal animal : animalArrayList) {
            totalFoodCost += animal.getDailyFoodCost();
        }

        System.out.println("Total food cost: "+totalFoodCost);
        System.out.println();

        return  totalFoodCost;
    }

    public static void countAnimalTypes(ArrayList<Animal> animalArrayList) {
        int totalLion = 0;
        int totalTurtle = 0;
        int totalDog = 0;

        for (Animal animal : animalArrayList) {
            if (animal instanceof Lion) {
                totalLion ++;
            } else if (animal instanceof Turtle) {
                totalTurtle ++;
            } else if (animal instanceof Dog) {
                totalDog++;
            }
        }

        System.out.println("Number of Lions: "+totalLion);
        System.out.println("Number of Turtles: "+ totalTurtle);
        System.out.println("Number of Dog: "+totalDog);
    }

    public static void adoptAnimal(ArrayList<Animal> animalArrayList, int id) {
        boolean found = false;
        for (Animal animal : animalArrayList) {
            if (animal.getId() == id) {
                found = true;
                if (animal.isAdoptable()) {
                    animalArrayList.remove(animal);
                    System.out.println(animal.getClass().getSimpleName() + " " + animal.getName() + " has been adopted.");
                } else {
                    System.out.println(animal.getClass().getSimpleName() + " " + animal.getName()+ " is not adoptable.");
                }
            }
        }



        if (!found) {
            System.out.println("Animal with the given ID was not found.");
        }
    }

}
