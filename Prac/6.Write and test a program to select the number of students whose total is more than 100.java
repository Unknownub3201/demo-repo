package prac6;

import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Prac6 {
    public static void main(String[] args) {
        try {
            
            File inputWorkbook = new File("C:\\Users\\arunv\\Desktop\\st\\6\\Sample.xls");
            Workbook w = Workbook.getWorkbook(inputWorkbook);
            Sheet sheet = w.getSheet(0);
            int count = 0;   
            for (int j = 0; j < sheet.getRows(); j++) {
                Cell cell = sheet.getCell(4, j);
                if (cell.getType() == CellType.NUMBER) {
                    if (Integer.parseInt(cell.getContents()) > 100) {
                        count++;
                    }
                }
            }
            
            System.out.println("Total number of students who scored more than 100 is: " + count);
            w.close();
        } 
        catch (IOException | BiffException e) 
        {
            e.printStackTrace();
        }
    }
}



//jxl jar file
// sample student xl date with marks

