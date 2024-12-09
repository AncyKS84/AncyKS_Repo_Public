package utilities;

import java.awt.dnd.DnDConstants;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constants.ConstantValues;

public class ExcelUtility 
{
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;
	public static String getStringData(int row, int col, String sheetName) throws IOException
	{
		String filePath = ConstantValues.TESTDATAFILE;
		f= new FileInputStream(filePath);
		w=new XSSFWorkbook(f);
		sh=w.getSheet(sheetName);
		XSSFRow r = sh.getRow(row);
		XSSFCell c= r.getCell(col);
		return c.getStringCellValue();
				
	}
	public static String getNumericData(int row, int col, String sheetName) throws IOException
	{
		String filePath = ConstantValues.TESTDATAFILE;
		f= new FileInputStream(filePath);
		w=new XSSFWorkbook(f);
		sh=w.getSheet(sheetName);
		XSSFRow r = sh.getRow(row);
		XSSFCell c= r.getCell(col);
		int val=(int)c.getNumericCellValue();
		return String.valueOf(val);
				
	}				
	

}
