package databaseHandlerTest;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pip_proiect.DatabaseHandler;
import pip_proiect.PlagiarismDetector;

public class DatabaseHandlerTest {
	private static final String TEST_FILE_PATH = "D:\\Anul 3 sem 2\\PIP PR\\PIP_FINAL\\DataBase.xlsx";
	    @Before
	    public void setUp() throws IOException {
	        Workbook workbook = new XSSFWorkbook();
	        Sheet sheet = (Sheet) workbook.createSheet();
	        
	        Row headerRow = ((org.apache.poi.ss.usermodel.Sheet) sheet).createRow(0);
	        headerRow.createCell(0).setCellValue("Original Project");
	        headerRow.createCell(2).setCellValue("Suspect Project");
	        headerRow.createCell(4).setCellValue("Plagiarism Percentage");
	        headerRow.createCell(6).setCellValue("Date");
	        

	        try (FileOutputStream fileOut = new FileOutputStream(TEST_FILE_PATH)) {
	            workbook.write(fileOut);
	        }
	        workbook.close();
	    }
	    
	    @After
	   public void tearDown() {
	        File file = new File(TEST_FILE_PATH);
	        if (file.exists()) {
	            file.delete();
	        }
	    }
	    
	    @Test
	    public void testUpdateDatabase() throws IOException {
	    	 String Original_Project_Path="D:\\Anul 3 sem 2\\PIP PR\\PIP_FINAL\\testu11\\bin\\testu11";//de modificat path-ul
	         String Suspect_Project_Path="D:\\Anul 3 sem 2\\PIP PR\\PIP_FINAL\\testu11\\bin\\testu11";//de modificat path-ul
	         String Rezultat_Global="29.99"; //de modificat
	        DatabaseHandler.updateDatabase(TEST_FILE_PATH, Original_Project_Path, Suspect_Project_Path, Rezultat_Global);

	        try (FileInputStream inputStream = new FileInputStream(TEST_FILE_PATH);
	             Workbook workbook = WorkbookFactory.create(inputStream)) {

	            Sheet sheet = (Sheet) workbook.getSheetAt(0);
	            Row row = ((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(((org.apache.poi.ss.usermodel.Sheet) sheet).getLastRowNum());
	            
	            assertEquals(PlagiarismDetector.prelucrareNume(Original_Project_Path), row.getCell(0).getStringCellValue());
	            assertEquals(PlagiarismDetector.prelucrareNume(Suspect_Project_Path), row.getCell(2).getStringCellValue());
	            assertEquals(Rezultat_Global, row.getCell(4).getStringCellValue());
	        }
	    }

	

}
