package xsldata;
import java.io.File;
import java.io.IOException;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.Number;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.Sheet;
import jxl.CellType;
import jxl.Cell;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Xsldata {
private String inputFile;

public void setOutputFile(String inputFile) {
this.inputFile = inputFile;
}

public void write() throws IOException, WriteException {
File file = new File(inputFile);
WritableWorkbook workbook = Workbook.createWorkbook(file);
workbook.createSheet("Report", 0);
WritableSheet excelSheet = workbook.getSheet(0);
createLabel(excelSheet);
createContent(excelSheet);
workbook.write();
workbook.close();
}

public void read() throws IOException {
File inputWorkbook = new File("I:\\Sample.xls");
Workbook w;
boolean flag=false;
int count=0;
try {
w = Workbook.getWorkbook(inputWorkbook);
Sheet sheet = w.getSheet(0);
for (int j = 0; j < sheet.getRows(); j++) {
Cell cell = sheet.getCell(4, j);
if (cell.getType() == CellType.NUMBER) {
if(Integer.parseInt(cell.getContents())>100){
count++;
}
}
}
System.out.println("Total number of students who scored more than 100 is: " 
+count);
} catch (BiffException e) {
}
}

private void createLabel(WritableSheet sheet)
throws WriteException {
addCaption(sheet, 0, 0, "Student Name");
addCaption(sheet, 1, 0, "Subject 1");
addCaption(sheet, 2, 0, "subject 2");
addCaption(sheet, 3, 0, "subject 3");
addCaption(sheet, 4, 0, "Total");
}

private void createContent(WritableSheet sheet) throws WriteException,
RowsExceededException {
for (int i = 1; i < 10; i++) {
addLabel(sheet, 0, i, "Student " + i);
addNumber(sheet, 1, i, ((i*i)+17));
addNumber(sheet, 2, i, ((i*i)+14));
addNumber(sheet, 3, i, ((i*i)+13));
int total;
total=3*(i*i)+17+14+13;
addNumber(sheet,4,i,total);
}
}

private void addCaption(WritableSheet sheet, int column, int row, String s)
throws RowsExceededException, WriteException {
Label label;
label = new Label(column, row, s);
sheet.addCell(label);
}

private void addNumber(WritableSheet sheet, int column, int row,
Integer integer) throws WriteException, RowsExceededException {
Number number;
number = new Number(column, row, integer);
sheet.addCell(number);
}

private void addLabel(WritableSheet sheet, int column, int row, String s)
throws WriteException, RowsExceededException {
Label label;
label = new Label(column, row, s);
sheet.addCell(label);
}

public static void main(String[] args) throws WriteException, IOException {
Xsldata test = new Xsldata();
Xsldata test1 = new Xsldata();
test.setOutputFile("I:\\Sample.xls");
test.write();
test1.read();
System.out.println("Please check the result file under I:\\Sample1.xls ");
  }
}

