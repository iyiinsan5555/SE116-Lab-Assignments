public class Documentary extends Content{
    private int researchDepthLevel; //between 1-5
    private int numberOfScientistInterviews;

    public Documentary(String id, String title, int baseDuration, int researchDepthLevel, int numberOfScientistInterviews) {
        super(id, title, baseDuration);
        this.researchDepthLevel = researchDepthLevel;
        this.numberOfScientistInterviews = Math.clamp(numberOfScientistInterviews, 1, 5);
    }

    @Override
    public int calculateTotalDuration() {
        return getBaseDuration() + (numberOfScientistInterviews * 10);
    }

    @Override
    public String getRecommendationCategory() {
        if (researchDepthLevel >= 4) {
            return "In-Depth";
        } else {
            return "Light Informative";
        }
    }
}
