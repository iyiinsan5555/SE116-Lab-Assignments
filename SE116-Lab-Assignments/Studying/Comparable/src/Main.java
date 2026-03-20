import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Player> team = new ArrayList<Player>();
        Player plr1 = new Player("Ronaldo", 99);
        Player plr2 = new Player("Messi", 99);
        Player plr3 = new Player("Melih", 55);
        Player plr4 = new Player("Mal", 11);
        Player plr5 = new Player("Kulluki", 44);

        team.add(plr1);
        team.add(plr2);
        team.add(plr3);
        team.add(plr4);
        team.add(plr5);

        System.out.println(team);
        ArrayList<Player> removeCollection = new ArrayList<Player>();
        removeCollection.add(plr1);
        removeCollection.add(plr5);
        team.removeAll(removeCollection);
        System.out.println(team);
        //Sorting using Collections + Comparable + compareTo()
        Collections.sort(team);
        System.out.println(team);

    }
}
