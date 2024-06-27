package org.example.GUI;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.exceptions.InvalidOperationException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.example.entities.Group;
import org.example.entities.Student;
import org.example.entities.StudentRecord;
import org.example.entities.Task;
import org.example.entities.TaskRecord;
import org.example.entities.Var;
import org.example.operations.ExcelHandler;

/**
 *
 * @author kiril
 */
public class Interface extends javax.swing.JFrame {
private ArrayList<Group> groups;
private File varFolder;
private Group chosenGroup;
 private int varNum;
    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
         setContentPane(startPanel);
        setTitle("Создание отчета о работах студентов");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private final JFileChooser jFileChooser = new JFileChooser();
    private final JFileChooser jFolderChooser = new JFileChooser();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startPanel = new javax.swing.JPanel();
        simplePanel = new javax.swing.JPanel();
        importStudentsButton = new javax.swing.JButton();
        varFolderButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanelChooseGroup = new javax.swing.JPanel();
        noWorkButton = new javax.swing.JButton();
        openVarButton = new javax.swing.JButton();
        deleteRateButton = new javax.swing.JButton();
        numberGroup = new javax.swing.JComboBox<>();
        createGroupReportButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentInfoList = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        allReportButton = new javax.swing.JButton();
        personalReportButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        importStudentsButton.setText("Import students");
        importStudentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importStudentsButtonActionPerformed(evt);
            }
        });

        varFolderButton.setText("Choose variant's folder");
        varFolderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varFolderButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabel1.setText("1 step:");

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabel2.setText("2 step:");

        javax.swing.GroupLayout simplePanelLayout = new javax.swing.GroupLayout(simplePanel);
        simplePanel.setLayout(simplePanelLayout);
        simplePanelLayout.setHorizontalGroup(
            simplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(simplePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(importStudentsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(varFolderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        simplePanelLayout.setVerticalGroup(
            simplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(importStudentsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, simplePanelLayout.createSequentialGroup()
                .addGroup(simplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(simplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(varFolderButton, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, simplePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        noWorkButton.setText("No work");
        noWorkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noWorkButtonActionPerformed(evt);
            }
        });

        openVarButton.setText("Rate work");
        openVarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openVarButtonActionPerformed(evt);
            }
        });

        deleteRateButton.setText("Delete rate");
        deleteRateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRateButtonActionPerformed(evt);
            }
        });

        numberGroup.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numberGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "№ группы" }));
        numberGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberGroupActionPerformed(evt);
            }
        });

        createGroupReportButton.setText("Group report");
        createGroupReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createGroupReportButtonActionPerformed(evt);
            }
        });

        studentInfoList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        studentInfoList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                studentInfoListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(studentInfoList);

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabel3.setText("3 step:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabel4.setText("4 step:");

        allReportButton.setText("Course report");
        allReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allReportButtonActionPerformed(evt);
            }
        });

        personalReportButton.setText("Personal report");
        personalReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalReportButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelChooseGroupLayout = new javax.swing.GroupLayout(jPanelChooseGroup);
        jPanelChooseGroup.setLayout(jPanelChooseGroupLayout);
        jPanelChooseGroupLayout.setHorizontalGroup(
            jPanelChooseGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChooseGroupLayout.createSequentialGroup()
                .addGroup(jPanelChooseGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelChooseGroupLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelChooseGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numberGroup, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(createGroupReportButton, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(allReportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(personalReportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelChooseGroupLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(30, 30, 30)
                        .addComponent(noWorkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(openVarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(deleteRateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelChooseGroupLayout.setVerticalGroup(
            jPanelChooseGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChooseGroupLayout.createSequentialGroup()
                .addGroup(jPanelChooseGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelChooseGroupLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanelChooseGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteRateButton)
                            .addComponent(openVarButton)
                            .addComponent(noWorkButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE))
                    .addGroup(jPanelChooseGroupLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 15, Short.MAX_VALUE)
                .addGroup(jPanelChooseGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelChooseGroupLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanelChooseGroupLayout.createSequentialGroup()
                        .addComponent(numberGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(personalReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(createGroupReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(allReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );

        javax.swing.GroupLayout startPanelLayout = new javax.swing.GroupLayout(startPanel);
        startPanel.setLayout(startPanelLayout);
        startPanelLayout.setHorizontalGroup(
            startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startPanelLayout.createSequentialGroup()
                .addComponent(simplePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(startPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelChooseGroup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        startPanelLayout.setVerticalGroup(
            startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(simplePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelChooseGroup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(startPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(startPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void importStudentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importStudentsButtonActionPerformed
         FileNameExtensionFilter filter = new FileNameExtensionFilter("", "xlsx");
            jFileChooser.setFileFilter(filter);
            jFileChooser.showDialog(null, "Choose file:");
            File file = jFileChooser.getSelectedFile();
            try {
                DefaultComboBoxModel<String> cbModel = new DefaultComboBoxModel<>();
                groups = ExcelHandler.importStudents(file);
                for (Group group : groups) {
                    cbModel.addElement(group.getName());
                }
                numberGroup.setModel(cbModel);
                numberGroup.setEnabled(true);
                allReportButton.setEnabled(true);
                JOptionPane.showMessageDialog(Interface.this, "Студенты импортированы");
            } catch (IOException | InvalidFormatException ex) {
                JOptionPane.showMessageDialog(Interface.this, "Ошибка при импорте файла");
            } catch (IllegalArgumentException illegalArgumentException) {
                JOptionPane.showMessageDialog(Interface.this, "Файл не выбран");
            }
    }//GEN-LAST:event_importStudentsButtonActionPerformed

    private void createGroupReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createGroupReportButtonActionPerformed
 int minGrade = 0;
            try {
                minGrade = Integer.parseInt(JOptionPane.showInputDialog(Interface.this, "Введите минимальный проходной балл:"));
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(Interface.this, "Необходимо ввести целое число");
            }
            if (chosenGroup.getStudents().stream().filter(student -> student.getReport() == null).findFirst().orElse(null) != null) {
                JOptionPane.showMessageDialog(Interface.this, "Не все студенты оценены");
            } else {
                XSSFWorkbook book = new XSSFWorkbook();
                XSSFSheet sheet = book.createSheet("Отчет по группе " + chosenGroup.getName());
                XSSFRow firstRow = sheet.createRow(0);
                sheet.setColumnWidth(0, 8000);
                firstRow.createCell(0).setCellValue("ФИО студента");
                firstRow.createCell(1).setCellValue("Вариант");
                Student studentWithMaxWorks = chosenGroup.getStudents().stream().filter(student -> student.getReport().getTasks() != null)
                        .max(Comparator.comparing(student -> student.getReport().getTasks().size())).orElse(null);
                int maxWorks = 0;
                if (studentWithMaxWorks != null) {
                    maxWorks = studentWithMaxWorks.getReport().getTasks().size();
                }
                for (int i = 0; i < maxWorks; i++) {
                    firstRow.createCell(i + 2).setCellValue("Задание " + (i + 1));
                }
                firstRow.createCell(firstRow.getLastCellNum()).setCellValue("Оценка");
                firstRow.createCell(firstRow.getLastCellNum()).setCellValue("Итог");
                for (int i = 0; i < chosenGroup.getStudents().size(); i++) {
                    Student student = chosenGroup.getStudents().get(i);
                    XSSFRow row = sheet.createRow(i + 1);
                    row.createCell(0).setCellValue(student.getFio());
                    row.createCell(1).setCellValue(student.getVar());
                    if (!student.getReport().isHasNoWork()) {
                        for (int j = 0; j < maxWorks; j++) {
                            if (j < student.getReport().getTasks().size()) {
                                row.createCell(j + 2).setCellValue(student.getReport().getTasks().get(j).getReport().getGrade());
                            } else row.createCell(j + 2).setCellValue("Нет задания");
                        }
                        int finalGrade = student.getReport().getTasks().stream().map(Task::getReport).mapToInt(TaskRecord::getGrade).sum();
                        row.createCell(row.getLastCellNum()).setCellValue(finalGrade);
                        if (finalGrade < minGrade) {
                            row.createCell(row.getLastCellNum()).setCellValue("Незачет");
                        } else row.createCell(row.getLastCellNum()).setCellValue("Зачет");
                    } else {
                        for (int j = 0; j < maxWorks; j++) {
                            row.createCell(j + 2).setCellValue(0);
                        }
                        row.createCell(row.getLastCellNum()).setCellValue(0);
                        row.createCell(row.getLastCellNum()).setCellValue("Нет работы");
                    }
                }
                jFolderChooser.showDialog(null, "Выбрать папку сохранения");
                File file = new File(jFolderChooser.getSelectedFile().getName() + chosenGroup.getName() + ".xlsx");
                try {
                    book.write(new FileOutputStream(file));
                    book.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                JOptionPane.showMessageDialog(Interface.this, "Отчет сформирован");
            }
    }//GEN-LAST:event_createGroupReportButtonActionPerformed

    private void varFolderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varFolderButtonActionPerformed
        try {
                jFolderChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                jFolderChooser.showDialog(null, "Выбрать папку:");
                varFolder = jFolderChooser.getSelectedFile();
                JOptionPane.showMessageDialog(Interface.this, "Выбрана папка " + varFolder.getName());
            } catch (IllegalArgumentException | NullPointerException exception) {
                JOptionPane.showMessageDialog(Interface.this, "Папка не выбрана");
            }
    }//GEN-LAST:event_varFolderButtonActionPerformed

    private void noWorkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noWorkButtonActionPerformed
        StudentRecord noWorkReport = new StudentRecord();
            noWorkReport.setHasNoWork(true);
            chosenGroup.getStudents().get(studentInfoList.getSelectedIndex()).setReport(noWorkReport);
            updateStudentsList();
    }//GEN-LAST:event_noWorkButtonActionPerformed

    private void openVarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openVarButtonActionPerformed
       Student student = (Student) studentInfoList.getSelectedValue();
            if (student != null) {
                varNum = student.getVar();
                try {
                    String path = varFolder.getPath() + "\\" + varNum + ".xlsx";
                    Var variant = ExcelHandler.importVar(path);
                    StudentEstimation estimation = new StudentEstimation(variant, student, this);
                    setEnabled(false);
                    groups.get(numberGroup.getSelectedIndex()).getStudents().get(studentInfoList.getSelectedIndex())
                            .setReport(estimation.getReport());
                } catch (IOException | InvalidOperationException | NullPointerException ex) {
                    JOptionPane.showMessageDialog(Interface.this, "Не найден файл варианта");
                }
            } else JOptionPane.showMessageDialog(Interface.this, "Студент не выбран");
            updateStudentsList();
    }//GEN-LAST:event_openVarButtonActionPerformed

    private void deleteRateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRateButtonActionPerformed
       int chosenStudentIndex = studentInfoList.getSelectedIndex();
            Student chosenStudent = chosenGroup.getStudents().get(chosenStudentIndex);
            chosenStudent.setReport(null);
            updateStudentsList();
    }//GEN-LAST:event_deleteRateButtonActionPerformed

    private void numberGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberGroupActionPerformed
        DefaultListModel<Student> listModel = new DefaultListModel<>();
            String groupName = (String) numberGroup.getSelectedItem();
            chosenGroup = groups.stream().filter(group1 -> Objects.equals(group1.getName(), groupName)).findFirst().get();
            for (Student student : chosenGroup.getStudents()) {
                listModel.addElement(student);
            }
            studentInfoList.setModel(listModel);
            studentInfoList.setSelectedIndex(0);
            createGroupReportButton.setEnabled(true);
    }//GEN-LAST:event_numberGroupActionPerformed

    private void studentInfoListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_studentInfoListValueChanged
        int chosenStudentIndex = studentInfoList.getSelectedIndex();
            try {
                Student chosenStudent = chosenGroup.getStudents().get(chosenStudentIndex);
                if (chosenStudent.getReport() != null) {
                    openVarButton.setEnabled(!chosenStudent.getReport().isHasNoWork());
                    openVarButton.setText("Редактировать оценку");
                    deleteRateButton.setEnabled(true);
                    noWorkButton.setEnabled(false);
                   personalReportButton.setEnabled(true);
                } else {
                    openVarButton.setEnabled(true);
                    openVarButton.setText("Оценить работу");
                    deleteRateButton.setEnabled(false);
                    noWorkButton.setEnabled(true);
                   personalReportButton.setEnabled(false);
                }
            } catch (IndexOutOfBoundsException exception) {
                System.out.println("Нет выбранного значения");
            }
    }//GEN-LAST:event_studentInfoListValueChanged

    private void allReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allReportButtonActionPerformed
        int minGrade;
            try {
                minGrade = Integer.parseInt(JOptionPane.showInputDialog(Interface.this, "Введите минимальный проходной балл:"));
                boolean allStudentsRated = true;
                for (Group group : groups) {
                    if (group.getStudents().stream().filter(student -> student.getReport() == null).findFirst().orElse(null) != null) {
                        allStudentsRated = false;
                    }
                }
                if (!allStudentsRated) {
                    JOptionPane.showMessageDialog(Interface.this, "Не все студенты оценены");
                } else {
                    XSSFWorkbook book = new XSSFWorkbook();
                    for (Group group : groups) {
                        XSSFSheet sheet = book.createSheet("Отчет по группе " + group.getName());
                        XSSFRow firstRow = sheet.createRow(0);
                        sheet.setColumnWidth(0, 8000);
                        firstRow.createCell(0).setCellValue("ФИО студента");
                        firstRow.createCell(1).setCellValue("Вариант");
                        Student studentWithMaxWorks = group.getStudents().stream().filter(student -> student.getReport().getTasks() != null)
                                .max(Comparator.comparing(student -> student.getReport().getTasks().size())).orElse(null);
                        int maxWorks = 0;
                        if (studentWithMaxWorks != null) {
                            maxWorks = studentWithMaxWorks.getReport().getTasks().size();
                        }
                        for (int i = 0; i < maxWorks; i++) {
                            firstRow.createCell(i + 2).setCellValue("Задание " + (i + 1));
                        }
                        firstRow.createCell(firstRow.getLastCellNum()).setCellValue("Оценка");
                        firstRow.createCell(firstRow.getLastCellNum()).setCellValue("Итог");
                        for (int i = 0; i < group.getStudents().size(); i++) {
                            Student student = group.getStudents().get(i);
                            XSSFRow row = sheet.createRow(i + 1);
                            row.createCell(0).setCellValue(student.getFio());
                            row.createCell(1).setCellValue(student.getVar());
                            if (!student.getReport().isHasNoWork()) {
                                for (int j = 0; j < maxWorks; j++) {
                                    if (j < student.getReport().getTasks().size()) {
                                        row.createCell(j + 2).setCellValue(student.getReport().getTasks().get(j).getReport().getGrade());
                                    } else row.createCell(j + 2).setCellValue("Нет задания");
                                }
                                int finalGrade = student.getReport().getTasks().stream().map(Task::getReport).mapToInt(TaskRecord::getGrade).sum();
                                row.createCell(row.getLastCellNum()).setCellValue(finalGrade);
                                if (finalGrade < minGrade) {
                                    row.createCell(row.getLastCellNum()).setCellValue("Незачет");
                                } else row.createCell(row.getLastCellNum()).setCellValue("Зачет");
                            } else {
                                for (int j = 0; j < maxWorks; j++) {
                                    row.createCell(j + 2).setCellValue(0);
                                }
                                row.createCell(row.getLastCellNum()).setCellValue(0);
                                row.createCell(row.getLastCellNum()).setCellValue("Нет работы");
                            }
                        }
                    }
                    jFolderChooser.showDialog(null, "Выбрать папку сохранения");
                    File file = new File(jFolderChooser.getSelectedFile().getName() + "Отчет по потоку" + ".xlsx");
                    try {
                        book.write(new FileOutputStream(file));
                        book.close();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    JOptionPane.showMessageDialog(Interface.this, "Отчет сформирован");
                }
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(Interface.this, "Необходимо ввести целое число");
            }
    }//GEN-LAST:event_allReportButtonActionPerformed

    private void personalReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalReportButtonActionPerformed
         int minGrade = 0;
            try {
                minGrade = Integer.parseInt(JOptionPane.showInputDialog(Interface.this, "Введите минимальный проходной балл:"));
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(Interface.this, "Необходимо ввести целое число");
            }
            XSSFWorkbook book = new XSSFWorkbook();
            Student student = (Student) studentInfoList.getSelectedValue();
            XSSFSheet sheet = book.createSheet("Отчет по студенту " + student.getFio());
            XSSFRow firstRow = sheet.createRow(0);
            sheet.setColumnWidth(0, 8000);
            sheet.setColumnWidth(2, 10000);
            firstRow.createCell(0).setCellValue(student.getFio());
            firstRow.createCell(1).setCellValue(chosenGroup.getName());
            if (!student.getReport().isHasNoWork()) {
                XSSFRow secondRow = sheet.createRow(2);
                secondRow.createCell(0).setCellValue("Задание:");
                secondRow.createCell(1).setCellValue("Оценка:");
                secondRow.createCell(2).setCellValue("Комментарий:");
                for (Task task : student.getReport().getTasks()) {
                    XSSFRow row = sheet.createRow(sheet.getLastRowNum() + 1);
                    row.createCell(0).setCellValue("Задание " + (task.getTaskNumber() + 1));
                    row.createCell(1).setCellValue(task.getReport().getGrade());
                    row.createCell(2).setCellValue(task.getReport().getComment());
                }
                XSSFRow lastRow = sheet.createRow(sheet.getLastRowNum() + 1);
                lastRow.createCell(0).setCellValue("Итог:");
                int finalGrade = student.getReport().getTasks().stream().map(Task::getReport).mapToInt(TaskRecord::getGrade).sum();
                lastRow.createCell(1).setCellValue(finalGrade);
                if (finalGrade >= minGrade) {
                    lastRow.createCell(2).setCellValue("Зачет");
                } else lastRow.createCell(2).setCellValue("Незачет");
            } else {
                XSSFRow lastRow = sheet.createRow(2);
                lastRow.createCell(0).setCellValue("Итог:");
                lastRow.createCell(1).setCellValue("Нет работы");
            }
            jFolderChooser.showDialog(null, "Выбрать папку сохранения");
            File file = new File(jFolderChooser.getSelectedFile().getName() + student.getFio() + ".xlsx");
            try {
                book.write(new FileOutputStream(file));
                book.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            JOptionPane.showMessageDialog(Interface.this, "Отчет сформирован");
    }//GEN-LAST:event_personalReportButtonActionPerformed

       
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    public void updateStudentsList() {
        DefaultListModel<Student> listModel = new DefaultListModel<>();
        for (Student student : chosenGroup.getStudents()) {
            listModel.addElement(student);
        }
        studentInfoList.setModel(listModel);
        studentInfoList.setSelectedIndex(0);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton allReportButton;
    private javax.swing.JButton createGroupReportButton;
    private javax.swing.JButton deleteRateButton;
    private javax.swing.JButton importStudentsButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelChooseGroup;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton noWorkButton;
    private javax.swing.JComboBox<String> numberGroup;
    private javax.swing.JButton openVarButton;
    private javax.swing.JButton personalReportButton;
    private javax.swing.JPanel simplePanel;
    private javax.swing.JPanel startPanel;
    private javax.swing.JList studentInfoList;
    private javax.swing.JButton varFolderButton;
    // End of variables declaration//GEN-END:variables
}
