import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ScholarshipCandidate {
    private String candidateID;
    private String candidateName;
    private double examResult;
    private double activityPoint;

    public ScholarshipCandidate(String candidateID, String candidateName, double examResult, double activityPoint) {
        this.candidateID = candidateID;
        this.candidateName = candidateName;
        this.examResult = examResult;
        this.activityPoint = activityPoint;
    }

    public String getCandidateID() {
        return candidateID;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public double getExamResult() {
        return examResult;
    }

    public double getActivityPoint() {
        return activityPoint;
    }

    public void setExamResult(double examResult) {this.examResult = examResult;}

    public void printCandidate() {
        System.out.println(candidateName + " "+ candidateID);
    }

    @Override
    public String toString() {
        return candidateName +"_"+candidateID+"_"+examResult;
    }
}

interface ScoreAdjuster {
    double adjust(double Score);
}

interface QualificationChecker {
    boolean check(ScholarshipCandidate c);
}

class ScholarshipOffice {
    public double applyScore(ScholarshipCandidate c, ScoreAdjuster scoreAdjuster) {
        return scoreAdjuster.adjust(c.getExamResult());
    }

    public boolean checkQualification(ScholarshipCandidate c, QualificationChecker checker) {
        return checker.check(c);
    }
}

class ScholarshipDriver {
    public static void main(String[] args) {

        ArrayList<ScholarshipCandidate> arrayList = new ArrayList<>();
        arrayList.add(new ScholarshipCandidate("ID1", "Name1", 66, 81));
        arrayList.add(new ScholarshipCandidate("ID2", "Name2", 99, 50));
        arrayList.add(new ScholarshipCandidate("ID3", "Name3", 50, 100));
        arrayList.add(new ScholarshipCandidate("ID4", "Name4", 15, 50));

        ScholarshipOffice scholarshipOffice = new ScholarshipOffice();

        for (ScholarshipCandidate sc : arrayList) {
            if (scholarshipOffice.checkQualification(sc, (c) -> c.getExamResult() >45 && c.getExamResult() < 50)) {
                sc.setExamResult(scholarshipOffice.applyScore(sc, (score) -> 50));
            }

            if (scholarshipOffice.checkQualification(sc, c -> c.getExamResult() >88 && c.getExamResult() <92)) {
                sc.setExamResult(scholarshipOffice.applyScore(sc, (score) -> 95));
            }

            if (scholarshipOffice.checkQualification(sc, (c) -> c.getActivityPoint() > 80)) {
                sc.setExamResult(scholarshipOffice.applyScore(sc, (score) -> score + 5));
            }
        }

    }
}

class ScholarshipDriver2 {
    public static void main(String[] args) {

        ArrayList<ScholarshipCandidate> arrayList = new ArrayList<>();
        arrayList.add(new ScholarshipCandidate("ID1", "Name1", 66, 81));
        arrayList.add(new ScholarshipCandidate("ID2", "Name2", 99, 50));
        arrayList.add(new ScholarshipCandidate("ID3", "Name3", 50, 100));
        arrayList.add(new ScholarshipCandidate("ID4", "Name4", 15, 50));

        ScholarshipOffice scholarshipOffice = new ScholarshipOffice();
        HashMap<String, ScoreAdjuster> scoreRules = new HashMap<>();
        HashMap<String, QualificationChecker> qualificationRules = new HashMap<>();

        ScoreAdjuster normalizeLow = (score) -> 50;
        ScoreAdjuster normalizeHigh = (score) -> 95;

        QualificationChecker isQualifiedLow = (sc) -> sc.getExamResult() >45 && sc.getExamResult() < 50;
        QualificationChecker isQualifiedHigh = (sc) -> sc.getExamResult() >88 && sc.getExamResult() < 92;
        QualificationChecker highActivity = (sc) -> sc.getActivityPoint() > 80;

        scoreRules.put("normalizeLow", normalizeLow);
        scoreRules.put("normalizeHigh", normalizeHigh);

        qualificationRules.put("isQualifiedLow",isQualifiedLow);
        qualificationRules.put("isQualifiedHigh",isQualifiedHigh);
        qualificationRules.put("highActivity", highActivity);

        for (ScholarshipCandidate sc : arrayList) {
            if(scholarshipOffice.checkQualification(sc, qualificationRules.get("isQualifiedLow"))) {
                sc.setExamResult(scholarshipOffice.applyScore(sc, scoreRules.get("normalizeLow")));
            }
        }

        //Sorting by exam result (ascending -> artan)
        Collections.sort(arrayList, (s1, s2) -> Double.compare(s1.getExamResult(), s2.getExamResult()));
        System.out.println(arrayList);

        //Sorting alphabetically
        Collections.sort(arrayList, (s1, s2) -> s1.getCandidateName().compareTo(s2.getCandidateName()));
        System.out.println(arrayList);
    }
}