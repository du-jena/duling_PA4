import java.io.*;

public class Application {
    public static void main(String[] args) throws IOException{
        DuplicateRemover d = new DuplicateRemover();
        d.remove("problem1.txt");
        d.write("unique_words.txt");
    }
}
