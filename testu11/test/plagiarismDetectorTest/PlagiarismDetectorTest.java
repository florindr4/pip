package plagiarismDetectorTest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import pip_proiect.PlagiarismDetector;

public class PlagiarismDetectorTest {

    @Test
    public void testProcesare_commonWords() {
        List<String> wordsList1 = Arrays.asList("public", "static", "void", "main");//de modificat lista
        List<String> wordsList2 = Arrays.asList("public", "class", "Main", "static");//de modificat lista
        
        double result = PlagiarismDetector.procesare(wordsList1, wordsList2);
        
        assertEquals(25.00, result, 0.01);//de modificat primul double,adica rezultatul
    }

    @Test
    public void testPrelucrareNume_withFilePath() {
        String filePath = "D:\\Anul 3 sem 1\\Programare Independenta de Platforma\\Laborator\\L2\\prb02\\pb02\\src\\pb02\\Ini.java";//de modificat path-ul
        String result = PlagiarismDetector.prelucrareNume(filePath);
        
        assertEquals("Ini.java", result);//de modificat numele fisierului
    }
}
