package org.example.operations;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.example.entities.Task;

public class TaskCondition {

    /**
     * Метод записи условия к заданиям из файла эксель
     * Задание найдено, считываем данные на следующих строках
     * @param lastSheet
     * @param task
     */
    public static void getCondition(XSSFSheet lastSheet, Task task) {
        int rowIndex = 0;
        String foundCondition = "";
        int maxGrade = 0;

        while (rowIndex < lastSheet.getLastRowNum()) {
            XSSFRow row = lastSheet.getRow(rowIndex);
            if (row != null && row.getCell(0) != null &&
                    row.getCell(0).getStringCellValue().equals("Задание " + (task.getTaskNumber() + 1))) {

                maxGrade = Integer.parseInt(lastSheet.getRow(rowIndex + 3).getCell(1).getStringCellValue());
                foundCondition = lastSheet.getRow(rowIndex + 6).getCell(0).getStringCellValue();
                break;
            }
            rowIndex++;
        }
        task.setCondition(foundCondition);
        task.setMaxGrade(maxGrade);
    }

}
