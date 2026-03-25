public class Movie extends Content{
    private boolean hasPostCreditsScene;

    public Movie(String id, String title, int baseDuration, boolean hasPostCreditsScene) {
        super(id, title, baseDuration);
        this.hasPostCreditsScene = hasPostCreditsScene;
    }

    @Override
    public int calculateTotalDuration() {
        int returnValue =  getBaseDuration();
        if (hasPostCreditsScene) {
            returnValue = getBaseDuration() + 5;
        }

        return returnValue;
    }

    @Override
    public String getRecommendationCategory() {
        if (getBaseDuration() < 90) {
            return "Short Watch";
        } else {
            return "Feature Length";
        }
    }
}
