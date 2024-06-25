package org.example.operations;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.example.entities.Task;


import java.util.ArrayList;
import java.text.SimpleDateFormat;
public class ImportTask {
    static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    /**
     * Метод обрабатывает данные и записывает из экселя в объект
     * имеется цикл по обработке всех строк
     * Происходит проверка на тип данных в ячейке
     * и считывание данных и запись в объект
     * @param book
     * @param taskNumber
     */
    public static Task importTask(XSSFWorkbook book, int taskNumber) {
        XSSFSheet sheet = book.getSheetAt(taskNumber);
        Task task = new Task();
        task.setTaskNumber(taskNumber);
        ArrayList<ArrayList<String>> data = new ArrayList<>();

        for (int i = 0; i <= sheet.getLastRowNum(); i++) {
            XSSFRow row = sheet.getRow(i);
            int j = 0;
            ArrayList<String> dataRow = new ArrayList<>();

            while (row.getCell(j) != null) {
                String rec = null;
                if (row.getCell(j).getCellType() == CellType.STRING) {
                    rec = row.getCell(j).getStringCellValue();
                } else if (DateUtil.isCellDateFormatted(row.getCell(j))){
                    rec = dateFormat.format(row.getCell(j).getDateCellValue());
                } else if (row.getCell(j).getCellType() == CellType.NUMERIC){
                    rec = String.valueOf(row.getCell(j).getNumericCellValue());
                }
                dataRow.add(rec);
                j++;
            }
            data.add(dataRow);
        }
        task.setData(data);
        return task;
    }
}
