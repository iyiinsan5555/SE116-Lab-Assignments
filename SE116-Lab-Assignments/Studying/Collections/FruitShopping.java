import java.util.ArrayList;
import java.util.Scanner;

public class FruitShopping {
    public static void main(String[] args) {

        //Accept fruit array
        //User will be able to add and remove fruits from the list
        //Add options like add fruit, remove fruit, finish shopping

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> myList = new ArrayList<String>();
        boolean shouldRun = true;

        while (shouldRun) {

            System.out.println("What would you like to do?");
            System.out.println("-- To add fruit type: a");
            System.out.println("-- To remove fruit: r");
            System.out.println("-- To finish shopping: f");
            System.out.println("Input: ");

            String userInput = scanner.nextLine();

            switch (userInput.trim().toLowerCase()) {
                case "a":
                    System.out.println("Name of the fruit: ");
                    String fruitName = scanner.nextLine();
                    if (myList.contains(fruitName)) {System.out.println("Fruit already exists."); break;}
                    myList.add(fruitName);
                    System.out.println("Successfully fruit added.");
                    break;
                case "r":
                    System.out.println("Name of the fruit: ");
                    String fruitName2 = scanner.nextLine();
                    if (!myList.contains(fruitName2)) {System.out.println("Fruit does not exist! Please remove the foods which in the list."); break;}
                    myList.remove(fruitName2);
                    break;
                case "f":
                    shouldRun = false;
                    break;
                default:
                    System.out.println("Please enter a valid input! Valid inputs: 'a' 'r' 'f' .");
            }
        }

        System.out.println("Your list: " + myList);
        scanner.close();
    }
}
