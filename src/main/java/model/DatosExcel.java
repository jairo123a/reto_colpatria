package model;

import cucumber.api.DataTable;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

public class DatosExcel {
    public static String[] llenarDatos(DataTable arg1,int NumeroPagina) {

        String nombreArchivo = "datadriveretocolpatria.xlsx";
        File fichero = new File("datadriveretocolpatria.xlsx");
        String rutaAbsoluta = new File(nombreArchivo).getAbsolutePath();
        String rutaArchivo = rutaAbsoluta.replace("\n", "\\");

        String hoja = "Hoja1";
        Boolean bool = false;
         String vector4[] = new String[8];
        int i = 0;
        try (
                FileInputStream file = new FileInputStream(new File("src/test/resources/excel/datadriveretocolpatria.xlsx"))) {
            XSSFWorkbook worbook = new XSSFWorkbook(file);
            XSSFSheet sheet = worbook.getSheetAt(NumeroPagina);
            Iterator<Row> rowIterator = sheet.iterator();
            Row row;
            while (rowIterator.hasNext()) {
                row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();
                Cell cell;
                while (cellIterator.hasNext()) {
                    cell = cellIterator.next();
                    if (bool == true) {
                        vector4[i] = cell.getStringCellValue().trim();

                        i++;
                    }
                }
                bool = true;
            }
        } catch (Exception e) {
            e.getMessage();
        }

        return vector4;
    }
}


