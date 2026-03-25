public class Driver extends Person implements RadioCommunication {
    private String racingNumber;
    private double currentLabTime;

    public Driver(String name, String team, String racingNumber, double currentLabTime) {
        super(name, team);
        this.racingNumber = racingNumber;
        this.currentLabTime = currentLabTime;
    }

    @Override
    public String sendMessage(Person receiver,String message) {
        receiver.setLastMessage(message);
        receiver.get
    }
}
