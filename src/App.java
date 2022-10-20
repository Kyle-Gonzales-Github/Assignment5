import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        File f = new File("src/words.txt");
        try {
            FileReader fr = new FileReader(f);
            LineNumberReader lnr = new LineNumberReader(fr);
            lnr.skip(Long.MAX_VALUE);
            System.out.println("Number of words in file words.txt: " + lnr.getLineNumber());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
