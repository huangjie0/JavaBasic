package Abnormal;

public class AgeIllegality extends RuntimeException{
    public AgeIllegality() {
    }

    public AgeIllegality(String message) {
        super(message);
    }
}
