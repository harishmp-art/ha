package testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class xlwritedata
{
		public static void main(String[] arg) throws EncryptedDocumentException, InvalidFormatException, IOException
		{
			FileInputStream fis = new FileInputStream("./xlsheet/data.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet("Sheet1");
			Row r = sh.createRow(0);
			Cell c = r.createCell(0);
			c.setCellValue("manager");
			FileOutputStream fos=new FileOutputStream("./xlsheet/data.xlsx");
			wb.write(fos);
			
		}


}
