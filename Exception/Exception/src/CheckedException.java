import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
    public static void readFile() throws FileNotFoundException {
        String fileName = "file does not exist";
        File file = new File(fileName);
        FileInputStream stream = new FileInputStream(file);
    }

    public static void main(String[] args) throws FileNotFoundException {
        readFile();
    }
}
