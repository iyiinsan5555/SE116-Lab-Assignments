public abstract class Content {
    private String id;
    private String title;
    private int baseDuration;

    public Content(String id, String title, int baseDuration) {
        this.id = id;
        this.title = title;
        this.baseDuration = baseDuration;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getBaseDuration() {
        return baseDuration;
    }

    public void displayInfo() {
        System.out.println("ID: "+id);
        System.out.println("Title: "+title);
        System.out.println("Base Duration: "+baseDuration +" minutes");
    }

    public abstract int calculateTotalDuration();

    public abstract String getRecommendationCategory();
}
