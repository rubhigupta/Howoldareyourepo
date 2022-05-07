package ajiobrowser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
/*	public static XSSFCell readtestdata() throws Exception
	{
		
		FileInputStream fs = new FileInputStream("D:\\Seedinfotech\\TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fs);     //.xlsx
	//	HSSFWorkbook wb1 = new HSSFWorkbook(fs);    //.xls

		XSSFSheet sheet = wb.getSheet("AutomationData");
		
		XSSFCell var = sheet.getRow(1).getCell(0);
		System.out.println(sheet.getRow(0).getCell(0));
		System.out.println("Data will be "+var);
		return var;
	}*/
	
	public String readtestdatadynamic(String var) throws Exception {
		FileInputStream fs = new FileInputStream("D:\\Seedinfotech\\TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fs);     //.xlsx
		XSSFSheet sheet = wb.getSheet(var);
		String value = "";
		 int rowcount=sheet.getLastRowNum();
		    for(int i=0;i<rowcount;i++)
		    {
		    int colcount=sheet.getRow(i).getLastCellNum();
		  	 XSSFRow  currentrow=sheet.getRow(i);
		  	 for(int j=0;j<colcount;j++)
			   {
				   value=currentrow.getCell(j).toString();
				   System.out.print(" "  +value);
			   }		   
		    }
			return value;
		    
		}
	public static void main(String args[]) throws Exception
	{
		ExcelRead obj = new ExcelRead();
		obj.readtestdatadynamic(null);
	}
}
