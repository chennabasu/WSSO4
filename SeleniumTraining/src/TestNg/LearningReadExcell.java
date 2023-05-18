package TestNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LearningReadExcell {

	public static void main(String[] args) {
	}
		
		public static void testData() throws IOException {
			File file = new File("./TestData1/TestData.XLSX");
			FileInputStream fis = new FileInputStream(file);
			Workbook workBook = WorkbookFactory.create(fis);
			//Sheet sheet = workBook.getSheet("Sheet1");
			//int rowSize = sheet.getPhysicalNumberOfRows();
			//int colSize = sheet.getRow(0).getPhysicalNumberOfCells();
			
			
			
		}
	}


