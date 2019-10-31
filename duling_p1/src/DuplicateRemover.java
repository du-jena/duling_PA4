import java.io.*;
import java.util.HashSet;

public class DuplicateRemover {
    private HashSet<String> uniqueWords = new HashSet<String>();

    public void remove(String dataFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(dataFile));
        String line = br.readLine();

        while(line != null) {
            uniqueWords.add(line);
            line = br.readLine();
        }

        br.close();
    }

    public void write(String outputFile) throws IOException {
        PrintWriter pw = new PrintWriter(outputFile);
        for(String line: uniqueWords){
            pw.println(line);
        }

        pw.flush();
        pw.close();

        System.out.println("Operation performed!");
    }
}
