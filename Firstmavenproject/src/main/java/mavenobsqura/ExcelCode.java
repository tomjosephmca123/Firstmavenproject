package mavenobsqura;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;


public static String getStringData(int a,int b) throws IOException{
	f=new FileInputStream("C:\\obsqura_tom\\test_file_upload.xlsx");
	w=new XSSFWorkbook(f);
	sh=w.getSheet("Sheet1");
	Row r=sh.getRow(a);
	Cell c=r.getCell(b);
	return c.getStringCellValue();
}
public static String getIntgerData(int a,int b)throws IOException{
	f=new FileInputStream("C:\\obsqura_tom\\test_file_upload.xlsx");
	w=new XSSFWorkbook(f);
	sh=w.getSheet("Sheet1");
	Row r=sh.getRow(a);
	Cell c=r.getCell(b);
	System.out.println(c);
	int x=(int) c.getNumericCellValue();
	return String.valueOf(x);
}
}

