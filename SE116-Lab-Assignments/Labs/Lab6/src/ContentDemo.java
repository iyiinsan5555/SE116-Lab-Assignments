import java.util.ArrayList;

public class ContentDemo {
    public static void main(String[] args) {
        ArrayList<Content> contents = new ArrayList<Content>();
        contents.add(new Movie("126162151", "Avatar", 135, true));
        contents.add(new Movie("3362324", "Karayıp Korsanları", 120, false));
        contents.add(new Series("125125151", "Friends", 50, 10));
        contents.add(new Series("21652362", "Kurtlar Vadisi", 75, 999));
        contents.add(new Documentary("136324234", "Bear Gryss - Belgesel",60, 2, 12));
        contents.add(new Documentary("12151521", "Vahşı Afrika", 35, 3, 10));

        for (int i=0; i<contents.size(); i++) {
            contents.get(i).displayInfo();
            System.out.println("Total Duration: "+contents.get(i).calculateTotalDuration());
            System.out.println("Category: "+contents.get(i).getRecommendationCategory());
        }

    }
}
