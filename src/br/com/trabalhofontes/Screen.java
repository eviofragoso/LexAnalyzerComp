/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trabalhofontes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import java.nio.file.Paths;


/**
 *
 * @author evio
 */
public class Screen extends javax.swing.JFrame {

    /**
     * Creates new form Screen
     */
    public Screen() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInput = new javax.swing.JButton();
        tInputPath = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tboxOutput = new javax.swing.JTextArea();
        btnAnalyse = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textInput = new javax.swing.JTextArea();
        btnAnalyseInput = new javax.swing.JButton();
        btnClearInput = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnInput.setText("Input");
        btnInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputActionPerformed(evt);
            }
        });

        tInputPath.setEditable(false);

        tboxOutput.setColumns(20);
        tboxOutput.setRows(5);
        jScrollPane1.setViewportView(tboxOutput);

        btnAnalyse.setText("Analyse");
        btnAnalyse.setEnabled(false);
        btnAnalyse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalyseActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        textInput.setColumns(20);
        textInput.setRows(5);
        jScrollPane2.setViewportView(textInput);

        btnAnalyseInput.setText("Analyse");
        btnAnalyseInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalyseInputActionPerformed(evt);
            }
        });

        btnClearInput.setText("Clear");
        btnClearInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearInputActionPerformed(evt);
            }
        });

        jLabel1.setText("Analisador Lexico Evio Fragoso");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(btnAnalyseInput))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btnClearInput, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAnalyse, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(267, 267, 267))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnInput, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(tInputPath, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(120, 120, 120))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInput)
                    .addComponent(tInputPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAnalyse)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(btnAnalyseInput)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnClearInput))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//
//jflex.Main.generate(fc.getSelectedFile());
//        btnInput.setEnabled(true);//
    
    private void btnInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputActionPerformed
        // TODO add your handling code here:
        fc = new JFileChooser();
        File workingDirectory = new File(System.getProperty("user.dir"));
        fc.setCurrentDirectory(workingDirectory);
        fc.showSaveDialog(null);
        tInputPath.setText(fc.getCurrentDirectory().getPath());
        
        btnAnalyse.setEnabled(true);
    }//GEN-LAST:event_btnInputActionPerformed

    private void exec(int op) throws Exception {
        LexicalAnalyser lex;
        
        if(op == 1){
        
            

        File inputText = new File("../inputTmp.txt");
        lex = new LexicalAnalyser(new FileReader(inputText));
        
        
        }else {
            
        String name= fc.getName();
        lex = new LexicalAnalyser(new FileReader(fc.getSelectedFile()));}
        output ="";
        while (true) {
            Token token = lex.yylex();
            if (token == null) {

                tboxOutput.setText(output);

                return;
            }
            switch (token) {

                case EQ:

                    output = output + "[Equality_Operator] " + lex.lexeme + "\n";
                    break;

                case ADD:

                    output = output + "[Arihmetic_Operator] " + lex.lexeme + "\n";
                    break;
                case MINUS:

                    output = output + "[Arihmetic_Operator] " + lex.lexeme + "\n";
                    break;
                case DIV:

                    output = output + "[Arihmetic_Operator] " + lex.lexeme + "\n";
                    break;
                case MUL:

                    output = output + "[Arihmetic_Operator] " + lex.lexeme + "\n";
                    break;
                case ID:

                    output = output + "[Identifier] " + lex.lexeme + "\n";
                    break;
                case NOEQ:

                    output = output + "[Equality_Operator] " + lex.lexeme + "\n";
                    break;
                case NAT:

                    output = output + "[Numeric_Value_Natural] " + lex.lexeme + "\n";
                    break;
                case NATWP:

                    output = output + "[Numeric_Value_Natural_With_Power] " + lex.lexeme + "\n";
                    break;
                   
                case STRING:

                    output = output + "[Text] " + lex.lexeme + "\n";
                    break;
                case FLOAT:

                    output = output + "[Numeric_Value_Float] " + lex.lexeme + "\n";
                    break;
                    
                case FLOATWP:

                    output = output + "[Numeric_Value_Float_With_Power] " + lex.lexeme + "\n";
                    break;
                    
                case COMMENT:

                    output = output + "[Comment] " + lex.lexeme + "\n";
                    break;
                case RIGHTBRACK:

                    output = output + "[Code_Delimiter] " + lex.lexeme + "\n";
                    break;
                case LEFTBRACK:

                    output = output + "[Code_Delimiter] " + lex.lexeme + "\n";
                    break;
                case WHILE:

                    output = output + "[Loop_Structure] " + lex.lexeme + "\n";
                    break;
                case RANGE:

                    output = output + "[Loop_Structure] " + lex.lexeme + "\n";
                    break;
                case EQMAJOR:

                    output = output + "[Comparative_Operator] " + lex.lexeme + "\n";
                    break;
                case EQLESS:

                    output = output + "[Comparative_Operator] " + lex.lexeme + "\n";
                    break;
                case END:

                    output = output + "[Code_Breaker] " + lex.lexeme + "\n";
                    break;
                case NO:

                    output = output + "[Logical_Operator] " + lex.lexeme + "\n";
                    break;
                case LESS:

                    output = output + "[Comparative_Operator] " + lex.lexeme + "\n";
                    break;
                case MAJOR:

                    output = output + "[Comparative_Operator] " + lex.lexeme + "\n";
                    break;
                case OR:

                    output = output + "[Logical_Operator] " + lex.lexeme + "\n";
                    break;
                case AND:

                    output = output + "[Logical_Operator] " + lex.lexeme + "\n";
                    break;
                case ELSE:

                    output = output + "[Selection_Structure] " + lex.lexeme + "\n";
                    break;
                case IF:

                    output = output + "[Selection_Structure] " + lex.lexeme + "\n";
                    break;
                case RIGHTPARENT:

                    output = output + "[Code_Delimiter] " + lex.lexeme + "\n";
                    break;
                case LEFTPARENT:

                    output = output + "[Code_Delimiter] " + lex.lexeme + "\n";
                    break;
                case LINEBREAK:

                    output = output + "[Line_Breaker] " + lex.lexeme;
                    break;
                case ARROW:

                    output = output + "[Atribution_Operator] " + lex.lexeme + "\n";
                    break;
                case BLOCKCOMMENT:

                    output = output + "[Block_Comment] " + lex.lexeme + "\n";
                    break;
                    
                case ERROR:
                                    
                    output = output + "[Unrecognized Symbol] " + lex.lexeme + "\n";
                    break;

                default:
                    break;
                  }
             }
        
    }

    private void btnAnalyseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalyseActionPerformed
         tboxOutput.setText("");
        try {
            // TODO add your handling code here:
            exec(2);
        } catch (Exception ex) {
            Logger.getLogger(Screen.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnAnalyseActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        tboxOutput.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnClearInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearInputActionPerformed
        // TODO add your handling code here:
        textInput.setText("");
        File file = new File("../inputTmp.txt");
        
        file.delete();
    }//GEN-LAST:event_btnClearInputActionPerformed

    private void btnAnalyseInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalyseInputActionPerformed
        // TODO add your handling code here:
     tboxOutput.setText("");    
     
    try{
    File f = new File("../inputTmp.txt");    
    
    PrintWriter writer = new PrintWriter(f, "UTF-8");
    writer.flush();
    writer.print(textInput.getText());
    writer.close();
   
    } catch (IOException e) {
   // do something
    }
    
     try {
            // TODO add your handling code here:
            exec(1);
        } catch (Exception ex) {
            Logger.getLogger(Screen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnAnalyseInputActionPerformed

    /**
     * @param args the command line arguments
     */
    JFileChooser fc;
  
    String output = "";
    String path = "";

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
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalyse;
    private javax.swing.JButton btnAnalyseInput;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearInput;
    private javax.swing.JButton btnInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField tInputPath;
    private javax.swing.JTextArea tboxOutput;
    private javax.swing.JTextArea textInput;
    // End of variables declaration//GEN-END:variables
}
