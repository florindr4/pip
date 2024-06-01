package fileUtilsTest;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import pip_proiect.FileUtils;

public class FileUtilsTest {
    private static final String TEST_DIRECTORY = "D:\\Anul 3 sem 1\\Programare Independenta de Platforma\\Laborator\\L3\\Pb2-Tema\\p3\\src\\work";  //de schimbat path-ul
    private static final String TEST_FILE_1 = TEST_DIRECTORY + "\\Piesa.java"; //de schimbat path-ul
    private static final String TEST_FILE_2 = TEST_DIRECTORY + "\\Sistem.java"; //de schimbat path-ul
    
    @Before
    public void setUp() throws IOException {
        try {
            if (!Files.exists(Paths.get(TEST_DIRECTORY))) {
                Files.createDirectory(Paths.get(TEST_DIRECTORY));
            }
            Files.write(Paths.get(TEST_FILE_1), "public class Piesa {}".getBytes()); //de schimbat numele clasei
            Files.write(Paths.get(TEST_FILE_2), "public class Sistem {}".getBytes()); //de schimbat numele clasei
            System.out.println("Setting up...");
        } catch (IOException e) {
            e.printStackTrace();
            fail("Failed to set up test environment: " + e.getMessage());
        }
    }

    @Test
    public void testObtinereCod() throws IOException {
        try {
            List<String> words = FileUtils.obtinereCod(TEST_DIRECTORY);
            System.out.println("Words obtained: " + words);

            assertTrue("Expected 'public' in words list", words.contains("public"));
            assertTrue("Expected 'class' in words list", words.contains("class"));
            assertTrue("Expected 'TestFile1' in words list", words.contains("Piesa")); //de schimbat la words.contains numele clasei
            assertTrue("Expected 'TestFile2' in words list", words.contains("Sistem")); //de schimbat la words.contains numele clasei
        } catch (IOException e) {
            e.printStackTrace();
            fail("IOException during test execution: " + e.getMessage());
        }
    }
}
