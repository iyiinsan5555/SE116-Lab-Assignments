public interface SecurityProtocol {
    void performScan(); //prints a security scan message
    boolean isBreached(); //returns true if integrity is below 20%
}
