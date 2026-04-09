import java.util.ArrayList;
import java.util.Scanner;

abstract class Content {
    private int id;
    private String title;
    private int duration;

    public Content(int id, String title, int duration) {
        this.id = id;
        this.title = title;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getInfo() {
        return id + "_" + title + "_" + duration;
    }

    public abstract void displayContent();
}

interface Downloadable {
    void download();
}

class VideoLesson extends Content implements Downloadable {
    private String videoQuality;

    public VideoLesson(int id, String title, int duration, String videoQuality) {
        super(id, title, duration);
        this.videoQuality = videoQuality;
    }

    //I must implement display content and download method
    @Override
    public void displayContent() {
        System.out.println("Display Content: Video Lesson");
    }

    @Override
    public void download() {
        System.out.println("Downloading a video lesson");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "_" + videoQuality;
    }
}

class PDFNote extends Content implements Downloadable {
    private int pageCount;

    public PDFNote(int id, String title, int duration, int pageCount) {
        super(id, title, duration);
        this.pageCount = pageCount;
    }

    @Override
    public void displayContent() {
        System.out.println("Display Content: PDF Note");
    }

    @Override
    public void download() {
        System.out.println("Downloading a video lesson");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "_" + pageCount;
    }
}

class LiveSession extends Content {
    private String meetingLink;

    public LiveSession(int id, String title, int duration, String meetingLink) {
        super(id, title, duration);
        this.meetingLink = meetingLink;
    }

    @Override
    public void displayContent() {
        System.out.println("Display Content: Live Session");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "_" + meetingLink;
    }
}

interface DurationOperation {
    int apply(int duration);
}

interface ContentFilter {
    boolean test(Content c);
}



class ContentTest {
    public static void main(String[] args) {
        ArrayList<Content> arrayList = new ArrayList<>();
        arrayList.add(new VideoLesson(111, "Title1", 1, "1080p"));
        arrayList.add(new VideoLesson(222, "Title2", 2, "1080p"));
        arrayList.add(new PDFNote(333, "Title3", 3, 7));
        arrayList.add(new PDFNote(444, "Title4", 4, 9));
        arrayList.add(new LiveSession(555, "Title5", 5, "MeetingLink1"));
        arrayList.add(new LiveSession(666, "Title6", 6, "MeetingLink2"));

        boolean shouldRun = true;
        Scanner scanner = new Scanner(System.in);
        DurationOperation decreaseDuration = (duration) -> duration - 10;
        DurationOperation increaseDuration = (duration) -> duration + 15;
        ContentFilter contentFilterEx = (content) -> content.getDuration() > 30;
        ContentFilter contentFilterEx2 = (content) -> {
            if (content instanceof Downloadable) {
                return true;
            } else {
                return false;
            }
        };

        while (shouldRun) {

            printMenu();

            String userInput = scanner.nextLine();

            switch (userInput) {
                case "0":
                    shouldRun = false;
                    break;
                case "1":
                    listAllContents(arrayList);
                    break;
                case "2":
                    displayAllContents(arrayList);
                    break;
                case "3":
                    showTotalDuration(arrayList);
                    break;
                case "4":
                    countContentTypes(arrayList);
                    break;
                case "5":
                    downloadAll(arrayList);
                    break;
                case "6":
                    applyDuration(22, increaseDuration);
                    applyDuration(33, decreaseDuration);
                    break;
                case "7":
                    applyFilter(arrayList, contentFilterEx);
                    applyFilter(arrayList, contentFilterEx2);
                    break;
                default:
                    System.out.println("Please enter a valid key!");
            }
        }

    }

    public static void printMenu() {
        System.out.println();
        System.out.println("=== Smart Course Content Platform ===");
        System.out.println("1. List all contents");
        System.out.println("2. Display all contents");
        System.out.println("3. Show total duration");
        System.out.println("4. Count content types");
        System.out.println("5. Download downloadable contents");
        System.out.println("6. Apply duration operation");
        System.out.println("7. Filter contents");
        System.out.println("0. Exit");
        System.out.println();
        System.out.print("Enter your choice: ");
    }

    public static void listAllContents(ArrayList<Content> contents) {

        for (Content content : contents) {
            String info = content.getInfo();
            String[] infoArray = info.split("_");

            int id = Integer.parseInt(infoArray[0]);
            String title = infoArray[1];
            int duration = Integer.parseInt(infoArray[2]);
            //And extra, idk its type so will just print it

            System.out.println("ID:" +id+" title: "+title+ " duration: "+duration+" extra: "+infoArray[3]);
        }

    }

    public static void displayAllContents(ArrayList<Content> contents) {
        for (Content content : contents) {
            content.displayContent();
        }
    }

    public static void showTotalDuration(ArrayList<Content> contents) {
        int totalDuration = 0;
        for (Content content : contents) {
            totalDuration += content.getDuration();
        }

        System.out.println("Total Duration: "+totalDuration);
    }

    public static void countContentTypes(ArrayList<Content> contents) {
        int totalVideoLesson = 0;
        int totalPDFNotes = 0;
        int totalLiveSessions = 0;

        for (Content content : contents) {
            if (content instanceof VideoLesson) {
                totalVideoLesson ++;
            } else if (content instanceof PDFNote) {
                totalPDFNotes ++;
            } else if (content instanceof  LiveSession) {
                totalLiveSessions++;
            }
        }

        System.out.println("Total Video Lessons: "+totalVideoLesson);
        System.out.println("Total Live Sessions: "+totalLiveSessions);
        System.out.println("Total PDF Notes: "+totalPDFNotes);
    }

    public static void downloadAll(ArrayList<Content> contents) {
        for (Content content : contents) {
            if (content instanceof Downloadable) {
                Downloadable downloadable = (Downloadable) content; //Downcast to call a specific method!!!
                downloadable.download();
            }
        }
    }

    public static int applyDuration(int duration, DurationOperation durationOperation) {
        System.out.println("Old duration: "+duration+" New duration: "+durationOperation.apply(duration));
        return durationOperation.apply(duration);
    }

    public static void applyFilter(ArrayList<Content> contents, ContentFilter contentFilter) {
        for (Content content : contents) {
            if (contentFilter.test(content)) {
                //Matching content
                content.displayContent();
            }
        }
    }
}