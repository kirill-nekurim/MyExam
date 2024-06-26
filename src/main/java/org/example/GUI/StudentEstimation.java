package org.example.GUI;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.example.entities.Student;
import org.example.entities.StudentRecord;
import org.example.entities.Task;
import org.example.entities.TaskRecord;
import org.example.entities.Var;

/**
 *
 * @author kiril
 */
public class StudentEstimation extends javax.swing.JFrame {
 private final StudentRecord report = new StudentRecord();
 private ArrayList<Task> tasks;
 Var variant;
        Student student;
        Interface intrface;
    /**
     * Creates new form StudentEstimation
     */
    public StudentEstimation(Var variant, Student student, Interface intrface) {
        
        initComponents();
        setContentPane(estimationPanel);
        setTitle("Задания варианта");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1250, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        if (student.getReport() != null) {
            tasks = student.getReport().getTasks();
        } else tasks = variant.getTasks();
        fio.setText(student.getFio());
        var.setText(student.getVar() + " вариант");
        
        updateTasksList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        estimationPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list1 = new javax.swing.JList<>();
        listOfTasks = new javax.swing.JLabel();
        showTaskButton = new javax.swing.JButton();
        endRateButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fio = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        var = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        description = new javax.swing.JLabel();
        description2 = new javax.swing.JLabel();
        rateButton = new javax.swing.JButton();
        textField1 = new javax.swing.JTextField();
        maxGrade = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        list1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        list1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                list1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(list1);

        listOfTasks.setText("Список заданий:");

        showTaskButton.setText("Show task");
        showTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showTaskButtonActionPerformed(evt);
            }
        });

        endRateButton.setText("End rate");
        endRateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endRateButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Student:");

        jLabel3.setText("Var:");

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollPane.setViewportView(table1);

        description.setText("Task description:");

        description2.setText("Max rate:");

        rateButton.setText("Rate task");
        rateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateButtonActionPerformed(evt);
            }
        });

        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });

        maxGrade.setText("jLabel2");

        javax.swing.GroupLayout estimationPanelLayout = new javax.swing.GroupLayout(estimationPanel);
        estimationPanel.setLayout(estimationPanelLayout);
        estimationPanelLayout.setHorizontalGroup(
            estimationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(estimationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(estimationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(estimationPanelLayout.createSequentialGroup()
                        .addComponent(listOfTasks, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(showTaskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(endRateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(estimationPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(estimationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(description)
                            .addGroup(estimationPanelLayout.createSequentialGroup()
                                .addComponent(description2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(maxGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(estimationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(estimationPanelLayout.createSequentialGroup()
                        .addGroup(estimationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(estimationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fio, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(var, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 72, Short.MAX_VALUE))
                    .addComponent(textField1))
                .addContainerGap())
        );
        estimationPanelLayout.setVerticalGroup(
            estimationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(estimationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(estimationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listOfTasks, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showTaskButton)
                    .addComponent(endRateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGroup(estimationPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(fio, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(estimationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(estimationPanelLayout.createSequentialGroup()
                        .addGroup(estimationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(var, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(description)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(estimationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(maxGrade, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(description2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(estimationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(estimationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showTaskButtonActionPerformed
        textField1.setText("");
            textField1.setEnabled(true);
            rateButton.setEnabled(true);
//            commentTextField.setEnabled(true);
//            commentTextField.setText("");
//            correctButton.setEnabled(true);
//            notCompletedButton.setEnabled(true);
//            withoutCommentButton.setEnabled(true);
            Task task = tasks.get(list1.getSelectedIndex());
            if (task.getCondition().length() > 125) {
                description.setText(task.getCondition().substring(0, 125) + "-");
                description2.setText(task.getCondition().substring(125));
            } else {
                description.setText(task.getCondition());
                description2.setText("");
            }
            if (task.getMaxGrade() > 4) {
                maxGrade.setText(task.getMaxGrade() + " баллов");
            } else maxGrade.setText(task.getMaxGrade() + " балла");
            if (tasks.get(list1.getSelectedIndex()).getReport() != null) {
                textField1.setText(tasks.get(list1.getSelectedIndex()).getReport().getGrade() + "");
            }
            String[] columns = task.getData().get(0).toArray(new String[0]);
            DefaultTableModel tableModel = new DefaultTableModel(null, columns);
            for (int i = 1; i < task.getData().size(); i++) {
                ArrayList<String> row = task.getData().get(i);
                Object[] objRow = row.toArray();
                tableModel.addRow(objRow);
            }
            table1.setModel(tableModel);
    }//GEN-LAST:event_showTaskButtonActionPerformed

    private void endRateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endRateButtonActionPerformed
       if (tasks.stream().filter(task -> task.getReport() == null).findFirst().orElse(null) != null) {
                JOptionPane.showMessageDialog(StudentEstimation.this, "Не все задания оценены");
            } else {
                report.setTasks(tasks);
                intrface.setEnabled(true);
                dispose();
            }
    }//GEN-LAST:event_endRateButtonActionPerformed

    private void rateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateButtonActionPerformed
         try {
                if (tasks.get(list1.getSelectedIndex()).getMaxGrade() < Integer.parseInt(textField1.getText()) && Integer.parseInt(textField1.getText()) >= 0) {
                    JOptionPane.showMessageDialog(StudentEstimation.this, "Оценка превышает максимальный балл");
                } else {
                    TaskRecord taskReport = new TaskRecord();
                    taskReport.setGrade(Integer.parseInt(textField1.getText()));
//                    taskReport.setComment(commentTextField.getText());
                    tasks.get(list1.getSelectedIndex()).setReport(taskReport);
                    updateTasksList();
                }
            } catch (IllegalArgumentException exception) {
                JOptionPane.showMessageDialog(StudentEstimation.this, "Необходимо ввести целое число");
            }
    }//GEN-LAST:event_rateButtonActionPerformed

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed

    private void list1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_list1ValueChanged
        showTaskButton.setEnabled(true);
    }//GEN-LAST:event_list1ValueChanged

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(StudentEstimation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(StudentEstimation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(StudentEstimation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(StudentEstimation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new StudentEstimation().setVisible(true);
//            }
//        });
//    }
    
    public void updateTasksList() {
        DefaultListModel<Task> listModel = new DefaultListModel<>();
        for (Task task : tasks) {
            listModel.addElement(task);
        }
        list1.setModel(listModel);
    }
    
 public StudentRecord getReport() {
        return report;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel description;
    private javax.swing.JLabel description2;
    private javax.swing.JButton endRateButton;
    private javax.swing.JPanel estimationPanel;
    private javax.swing.JLabel fio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList list1;
    private javax.swing.JLabel listOfTasks;
    private javax.swing.JLabel maxGrade;
    private javax.swing.JButton rateButton;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JButton showTaskButton;
    private javax.swing.JTable table1;
    private javax.swing.JTextField textField1;
    private javax.swing.JLabel var;
    // End of variables declaration//GEN-END:variables
}
