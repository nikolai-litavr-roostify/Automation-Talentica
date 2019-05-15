package resources;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class dataDriven {

    public ArrayList<String> getData(String sheetName,String testcaseName)throws IOException
    {
        //fileInputStream argument
        ArrayList<String> al = new ArrayList<String>();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//TestData.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        int sheets = workbook.getNumberOfSheets();

        for(int i=0;i<sheets;i++)
            if (workbook.getSheetName(i).equalsIgnoreCase(sheetName))
            {
                XSSFSheet sheet = workbook.getSheetAt(i);
                //Identify Testcase column by scanning entire first row
                Iterator<Row> rows = sheet.iterator();// sheet is collection of rows

                Row firstrow = rows.next();
                Iterator<Cell> ci = firstrow.cellIterator(); //row is collection of cells
                int k = 0;
                int column = 0;
                while (ci.hasNext()) {
                    Cell value = ci.next();
                    if (value.getStringCellValue().equalsIgnoreCase("TestCaseScenario")) {
                        column = k;
                    }
                    k++;
                }

                //Once column is identified then scan entire test case column to identify specific test case row
                while (rows.hasNext())
                {
                    Row r = rows.next();
                    if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testcaseName)) {
                        //After you grab specific test case row, pull all data of that row and feed it into test
                        Iterator<Cell> cv = r.cellIterator();
                        while (cv.hasNext()) {
                            Cell c = cv.next();
                            if (c.getCellTypeEnum() == CellType.STRING) {
                                al.add(c.getStringCellValue());
                            } else {
                                al.add(NumberToTextConverter.toText(c.getNumericCellValue()));
                            }
                        }
                    }
                }

            }

        return al;

    }

    public static void main(String[] args)
    {

    }

}
