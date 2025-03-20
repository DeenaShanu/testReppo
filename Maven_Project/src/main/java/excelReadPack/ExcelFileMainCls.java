package excelReadPack;

import java.io.IOException;

public class ExcelFileMainCls {

	public static void main(String[] args) throws IOException {
	
	
		System.out.println(ExcelReaderCls.getStringData(1, 0));
		System.out.println(ExcelReaderCls.getStringData(2, 0));
		System.out.println(ExcelReaderCls.getStringData(3, 0));
		System.out.println(ExcelReaderCls.getStringData(4, 0));
		
		System.out.println(ExcelReaderCls.getIntegerData(1, 1));
		System.out.println(ExcelReaderCls.getIntegerData(2, 1));
		System.out.println(ExcelReaderCls.getIntegerData(3, 1));
		System.out.println(ExcelReaderCls.getIntegerData(4, 1));

	}

}
