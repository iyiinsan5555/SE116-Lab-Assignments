public abstract class Person {
    private String name;
    private String team;
    private String lastMessage;

    public Person(String name, String team) {
        this.name = name;
        this.team = team;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String message) {
        this.lastMessage = message;
    }
}
