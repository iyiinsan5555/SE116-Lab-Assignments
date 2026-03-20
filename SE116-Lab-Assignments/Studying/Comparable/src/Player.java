public class Player implements Comparable<Player> {
    private int ranking;
    private String name;

    public Player(String name, int ranking) {
        this.name = name;
        this.ranking = ranking;
    }

    public int getRanking() {return this.ranking;}

    @Override
    public int compareTo(Player otherPlayer) {
        return Integer.compare(this.ranking, otherPlayer.getRanking());
    }

    public String toString() { //Prints this string instead of object's address
        return this.name + "(" + this.ranking + ")";
    }
}
