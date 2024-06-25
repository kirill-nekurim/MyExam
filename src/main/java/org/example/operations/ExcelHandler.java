package org.example.operations;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.example.entities.Group;

import java.io.File;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.example.entities.Student;
import org.example.entities.Task;
import org.example.entities.Var;

import java.io.IOException;
import java.util.ArrayList;

import static org.example.operations.ImportTask.importTask;
import static org.example.operations.TaskCondition.getCondition;

public class ExcelHandler {
    /**
     * Метод для импорта информации из файлика со студентами
     *Сначала создаем объект книги
     * Потом идет цикл обработки страниц файла
     * Внутри него цикл по обработке строк страницы
     * @param file
     */
    public static ArrayList<Group> importStudents(File file) throws IOException,  InvalidFormatException{
        XSSFWorkbook book = new XSSFWorkbook(file);
        ArrayList<Group> groups = new ArrayList<>();
        for (int i = 0; i<book.getNumberOfSheets(); i++){
            XSSFSheet sheet = book.getSheetAt(i);
            Group group = new Group();
            ArrayList<Student> students = new ArrayList<>();
            for (int j = 1; j<=sheet.getLastRowNum(); j++){
                Student student = new Student();
                XSSFRow row = sheet.getRow(j);
                student.setVar((int) row.getCell(0).getNumericCellValue());
                student.setFio(row.getCell(1).getStringCellValue());
                students.add(student);
            }
            group.setStudents(students);
            group.setName(sheet.getSheetName());
            groups.add(group);
        }
        return groups;
    }

    /**
     * Импорт заданий из файлов с вариантами
     * Создаем объект книги, считываем эксель
     * Потом икл по обработке страниц файла
     * @param fileName
     */
    public static Var importVar(String fileName) throws IOException{
        XSSFWorkbook book = new XSSFWorkbook(fileName);
        Var variant = new Var();
        ArrayList<Task> tasks = new ArrayList<>();
        for (int i = 0; i<book.getNumberOfSheets()-1; i++){

            Task task = importTask(book, i);
            XSSFSheet lastSheet = book.getSheetAt(book.getNumberOfSheets()-1);

            getCondition(lastSheet, task);
            tasks.add(task);
        }
        variant.setTasks(tasks);
        return variant;
    }
}
