import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String filepath = "C:\\Users\\User\\OneDrive - Mongolian University of Science and Technology\\Documents\\F.csm301\\text.txt";
        String content = readFile(filepath);
        System.out.println(content);
    }

    public static String readFile(String filepath) {
        StringBuilder sb = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }
        } catch (IOException e) {
            return "Error: " + e.getMessage();
        }

        return sb.toString().trim();
    }
}
