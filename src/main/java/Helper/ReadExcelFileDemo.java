package Helper;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelFileDemo
{
    @Test
    public static void main(String args[]) throws IOException
    {
//obtaining input bytes from a file
        FileInputStream fis=new FileInputStream(new File("D:\\untitled1\\src\\Data\\Book1.xlsx"));
//creating workbook instance that refers to .xls file
        XSSFWorkbook wb= new XSSFWorkbook(fis);
//creating a Sheet object to retrieve the object
        XSSFSheet sheet=wb.getSheetAt(0);
//evaluating cell type
        FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();
        for(Row row: sheet)     //iteration over row using for each loop
        {
            for(Cell cell: row)    //iteration over cell using for each loop
            {
                switch(formulaEvaluator.evaluateInCell(cell).getCellType())
                {
                    case NUMERIC:   //field that represents numeric cell type
//getting the value of the cell as a number
                        System.out.print(cell.getNumericCellValue()+ "\t\t");
                        break;
                    case STRING:    //field that represents string cell type
//getting the value of the cell as a string
                        System.out.print(cell.getStringCellValue()+ "\t\t");
                        break;
                }
            }
            System.out.println();
        }
    }
//    public void swipingHorizontal() throws InterruptedException {
//        //Get the size of screen.
//        size = driver.manage().window().getSize();
//        System.out.println(size);
//
//        //Find swipe start and end point from screen's with and height.
//        //Find startx point which is at right side of screen.
//        int startx = (int) (size.width * 0.70);
//        //Find endx point which is at left side of screen.
//        int endx = (int) (size.width * 0.30);
//        //Find vertical point where you wants to swipe. It is in middle of screen height.
//        int y = size.height / 2;
//        System.out.println("startx = " + startx + " ,endx = " + endx + " , y = " + y);
//
//        //Swipe from Right to Left.
//        driver.swipe(startx, starty, endx, y, 3000);
//        Thread.sleep(2000);
//
//        //Swipe from Left to Right.
//        driver.swipe(endx, y, startx, y, 3000);
//        Thread.sleep(2000);
//    }

}

