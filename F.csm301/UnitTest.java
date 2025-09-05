import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UnitTest {

    @Test
    public void testReadExistingFile() {
        String path = "C:\\Users\\User\\OneDrive - Mongolian University of Science and Technology\\Documents\\F.csm301\\text.txt";
        String result = Main.readFile(path);

        assertFalse(result.startsWith("Error"), "Файл зөв уншигдсан байх ёстой");
        assertTrue(result.length() > 0, "Файл хоосон биш байх ёстой");
    }

    @Test
    public void testReadNonExistingFile() {
        String path = "C:\\Users\\User\\OneDrive - Mongolian University of Science and Technology\\Documents\\F.csm301\\not_found.txt";
        String result = Main.readFile(path);

        assertTrue(result.startsWith("Error"), "Файл байхгүй үед алдаа буцаах ёстой");
    }
}