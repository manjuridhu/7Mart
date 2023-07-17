package com.obsequra.utilties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import com.obsequra.constants.Constants;
public class ExcelUtility {
	/*XSSFSheet sh;
	public String readData(int i,int j){
		Row r=sh.getRow(i);
		Cell c=r.getCell(j);
		int celltype=c.getCellType();
		switch(celltype) {//0
			case Cell.CELL_TYPE_NUMERIC:
			{
					double a=c.getNumericCellValue();
					return String.valueOf(a);
			}
			case Cell.CELL_TYPE_STRING://1
			{
					return c.getStringCellValue();
			}
		}
		return null;
	}
	public  ExcelUtility() throws IOException {
		//FileInputStream f=new FileInputStream("C:\\Users\\anura\\Documents\\ExcelRead.xlsx");
		FileInputStream f=new FileInputStream("C:\\Users\\anura\\eclipse-workspace\\demotours\\src\\main\\resources\\TestData.xlsx");
		XSSFWorkbook w = new XSSFWorkbook(f);
		sh=w.getSheet("Sheet1");
	}*/
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static FileInputStream f;

	public static List<ArrayList<String>> excelDataReader(String sheetName){
	    DataFormatter formatter = new DataFormatter();
	    try {
	        f = new FileInputStream(System.getProperty("user.dir") + Constants.EXCEL_PATH);
	    } catch (FileNotFoundException e) {
	        throw new RuntimeException(e);
	    }
	    try {
	        wb = new XSSFWorkbook(f);
	    } catch (IOException e) {
	        throw new RuntimeException(e);
	    }
	    sh = wb.getSheet(sheetName);
	    List<ArrayList<String>> excelRows = new ArrayList<>();
	    int rowCount = sh.getLastRowNum() - sh.getFirstRowNum();
	    for (int i = 0; i < rowCount + 1; i++) {
	        int x = 0;
	        Row row = sh.getRow(i);
	        String[] columnList = new String[row.getLastCellNum()];
	        for (int j = 0; j < columnList.length; j++) {
	            columnList[j] = formatter.formatCellValue(row.getCell(x));
	            x++;
	        }
	        excelRows.add(new ArrayList<>(Arrays.asList(columnList)));
	    }
	    return excelRows;
	}
	/*public  static Object[][] dataProviderRead(String sheetName) {
	    DataFormatter formatter = new DataFormatter();
	    try {
	        f = new FileInputStream(System.getProperty("user.dir") + Constants.EXCEL_PATH_DATA_PROVIDER);
	    } catch (FileNotFoundException e) {
	        throw new RuntimeException(e);
	    }
	    try {
	        wb = new XSSFWorkbook(f);
	    } catch (IOException e) {
	        throw new RuntimeException(e);
	    }
	    sh = wb.getSheet(sheetName);

	    int rows =sh.getLastRowNum()+1;
	    int cols = sh.getRow(0).getLastCellNum();
	    Object[][]  data = new Object[rows][cols];

	    for (int i = 0; i < rows; i++) {
	        Row row = sh.getRow(i);
	        String[] columnList = new String[row.getLastCellNum()];
	        for (int j = 0; j < cols; j++) {
	            Cell cell =row.getCell(j);
	            data[i][j] = cell.getStringCellValue();
	        }
	    }
	    return data;
	}*/
}




	