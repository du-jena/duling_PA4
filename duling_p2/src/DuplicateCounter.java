import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class DuplicateCounter {
    private Map<String, Integer> wordCounter = new HashMap<String, Integer>();

    public void count(String dataFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(dataFile));
        String line = br.readLine();

        while(line != null) {
            Integer i = wordCounter.get(line);
            wordCounter.put(line, (i == null) ? 1 : i + 1);
            line = br.readLine();
        }

        br.close();
    }

    public void write(String outputFile) throws IOException {
        PrintWriter pw = new PrintWriter(outputFile);
        for(Map.Entry<String, Integer> entry: wordCounter.entrySet()) {
            pw.println(entry.getKey() + ": " + entry.getValue());
        }

        pw.flush();
        pw.close();

        System.out.println("Operation performed!");
    }
}
