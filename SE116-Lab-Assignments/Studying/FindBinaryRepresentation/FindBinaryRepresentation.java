import java.util.ArrayList;

public class FindBinaryRepresentation {

    public static void main(String[] args) {

        String binary = int_to_binary(50);
    }

    public static String int_to_binary(int integer) {
        ArrayList<String> remainders = new ArrayList<String>();

        while (integer != 0) {
            int remainder = integer % 2;
            integer = integer / 2;

            remainders.add(Integer.toString(remainder));
        }

        System.out.println(remainders);
        StringBuilder binary = new StringBuilder();

        for (int i=remainders.size(); i>0; i--) {
            binary.append(remainders.get(i-1));
        }

        System.out.println(binary);
        return binary.toString();
    }

}
