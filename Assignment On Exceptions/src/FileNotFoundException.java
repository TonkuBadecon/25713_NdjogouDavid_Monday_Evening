import java.io.FileInputStream;

public class FileNotFoundException {
    public FileNotFoundException() {
        try {
            FileInputStream file = new FileInputStream("LekuDeTaDaronne.txt");
        } catch (java.io.FileNotFoundException e) {
            System.out.println("FileNotFoundException. File not found.");
        }
    }

    public static void main(String[] args) {
        new FileNotFoundException();
    }
}
