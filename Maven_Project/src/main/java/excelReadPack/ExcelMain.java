package excelReadPack;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
	System.out.print(ExcelRd.getStringData(1, 0));
	System.out.println(ExcelRd.getIntegerData(1, 1));
	
	System.out.print(ExcelRd.getStringData(2, 0));
	System.out.println(ExcelRd.getIntegerData(2, 1));
	
	System.out.print(ExcelRd.getStringData(3, 0));
	System.out.println(ExcelRd.getIntegerData(3, 1));
	
	System.out.print(ExcelRd.getStringData(4, 0));
	System.out.println(ExcelRd.getIntegerData(4, 1));



	
	
	}

}
