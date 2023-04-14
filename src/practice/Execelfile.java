package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Execelfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		File f = new File("E:\\sample2.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheet("sheet1");
		
		XSSFRow row;
		System.out.println(sh.getLastRowNum());
		row = sh.getRow(1);
	
//		System.out.println(sh.getLastRowNum());
		//System.out.println(row.getLastCellNum());
		//System.out.println(row.getCell(1).getStringCellValue());
		FileOutputStream fos = new FileOutputStream(f);
		
		//wb.close();
		
		
		for(int i=0;i<=5;i++)
		{
			
			row =sh.getRow(i);
			for(int j=0;j<3;j++)
			{
//				row.getCell(0).setCellValue("ch"+i);
//				row.getCell(1).setCellValue("2Raj"+i);
//				row.getCell(2).setCellValue("236");
				System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
				//System.out.println(row.getLastCellNum());
				//System.out.println("\t");
			}
			System.out.println("\n");
		}
		
		wb.write(fos);
		wb.close();
		//System.out.println(row.getCell(1).getStringCellValue());
		
		
		
			
	}

}
