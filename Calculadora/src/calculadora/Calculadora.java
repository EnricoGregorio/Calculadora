/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author enric
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
    }

    private boolean verificarSinal(String calculo) {
        String soma = "+";
        String sub = "-";
        String multi = "x";
        String div = "/";
        if (calculo.contains(soma) || calculo.contains(sub) || calculo.contains(multi) || calculo.contains(div)) {
            JOptionPane.showMessageDialog(null, "Realize o um cálculo por vez!");
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fieldTxt = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnSubtrair = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnSomar = new javax.swing.JButton();
        btnResposta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        fieldTxt.setEditable(false);
        fieldTxt.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        fieldTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTxtActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn1.setText("1");
        btn1.setMaximumSize(new java.awt.Dimension(59, 51));
        btn1.setMinimumSize(new java.awt.Dimension(59, 51));
        btn1.setPreferredSize(new java.awt.Dimension(59, 51));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn2.setText("2");
        btn2.setMaximumSize(new java.awt.Dimension(59, 51));
        btn2.setMinimumSize(new java.awt.Dimension(59, 51));
        btn2.setPreferredSize(new java.awt.Dimension(59, 51));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn3.setText("3");
        btn3.setMaximumSize(new java.awt.Dimension(59, 51));
        btn3.setMinimumSize(new java.awt.Dimension(59, 51));
        btn3.setPreferredSize(new java.awt.Dimension(59, 51));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn4.setText("4");
        btn4.setMaximumSize(new java.awt.Dimension(59, 51));
        btn4.setMinimumSize(new java.awt.Dimension(59, 51));
        btn4.setPreferredSize(new java.awt.Dimension(59, 51));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn5.setText("5");
        btn5.setMaximumSize(new java.awt.Dimension(59, 51));
        btn5.setMinimumSize(new java.awt.Dimension(59, 51));
        btn5.setPreferredSize(new java.awt.Dimension(59, 51));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn6.setText("6");
        btn6.setMaximumSize(new java.awt.Dimension(59, 51));
        btn6.setMinimumSize(new java.awt.Dimension(59, 51));
        btn6.setPreferredSize(new java.awt.Dimension(59, 51));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn7.setText("7");
        btn7.setMaximumSize(new java.awt.Dimension(59, 51));
        btn7.setMinimumSize(new java.awt.Dimension(59, 51));
        btn7.setPreferredSize(new java.awt.Dimension(59, 51));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn8.setText("8");
        btn8.setMaximumSize(new java.awt.Dimension(59, 51));
        btn8.setMinimumSize(new java.awt.Dimension(59, 51));
        btn8.setPreferredSize(new java.awt.Dimension(59, 51));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn9.setText("9");
        btn9.setMaximumSize(new java.awt.Dimension(59, 51));
        btn9.setMinimumSize(new java.awt.Dimension(59, 51));
        btn9.setPreferredSize(new java.awt.Dimension(59, 51));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn0.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn0.setText("0");
        btn0.setMaximumSize(new java.awt.Dimension(59, 51));
        btn0.setMinimumSize(new java.awt.Dimension(59, 51));
        btn0.setPreferredSize(new java.awt.Dimension(59, 51));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(255, 102, 102));
        btnClear.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btnClear.setText("C");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSubtrair.setBackground(new java.awt.Color(153, 255, 153));
        btnSubtrair.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btnSubtrair.setText("-");
        btnSubtrair.setMaximumSize(new java.awt.Dimension(59, 51));
        btnSubtrair.setMinimumSize(new java.awt.Dimension(59, 51));
        btnSubtrair.setPreferredSize(new java.awt.Dimension(59, 51));
        btnSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtrairActionPerformed(evt);
            }
        });

        btnDividir.setBackground(new java.awt.Color(153, 255, 153));
        btnDividir.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btnDividir.setText("/");
        btnDividir.setMaximumSize(new java.awt.Dimension(59, 51));
        btnDividir.setMinimumSize(new java.awt.Dimension(59, 51));
        btnDividir.setPreferredSize(new java.awt.Dimension(59, 51));
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });

        btnMultiplicar.setBackground(new java.awt.Color(153, 255, 153));
        btnMultiplicar.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btnMultiplicar.setText("x");
        btnMultiplicar.setMaximumSize(new java.awt.Dimension(59, 51));
        btnMultiplicar.setMinimumSize(new java.awt.Dimension(59, 51));
        btnMultiplicar.setPreferredSize(new java.awt.Dimension(59, 51));
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });

        btnSomar.setBackground(new java.awt.Color(153, 255, 153));
        btnSomar.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btnSomar.setText("+");
        btnSomar.setMaximumSize(new java.awt.Dimension(59, 51));
        btnSomar.setMinimumSize(new java.awt.Dimension(59, 51));
        btnSomar.setPreferredSize(new java.awt.Dimension(59, 51));
        btnSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomarActionPerformed(evt);
            }
        });

        btnResposta.setBackground(new java.awt.Color(255, 204, 0));
        btnResposta.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btnResposta.setText("=");
        btnResposta.setMaximumSize(new java.awt.Dimension(59, 51));
        btnResposta.setMinimumSize(new java.awt.Dimension(59, 51));
        btnResposta.setPreferredSize(new java.awt.Dimension(59, 51));
        btnResposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRespostaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMultiplicar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDividir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSubtrair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnResposta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(fieldTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(fieldTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSomar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnResposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        fieldTxt.setText(fieldTxt.getText() + "6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        fieldTxt.setText(fieldTxt.getText() + "0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnRespostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRespostaActionPerformed
        String campo = fieldTxt.getText();
        int length = campo.length();
        String soma = "+";
        String sub = "-";
        String multi = "x";
        String div = "/";
        if (campo.contains(soma)) {
            int sinal = fieldTxt.getText().indexOf(soma);
            
            String num1 = campo.substring(0, sinal);
            String num2 = campo.substring(sinal+1, length);
            
            int n1 = Integer.parseInt(num1);
            int n2 = Integer.parseInt(num2);
            
            int resultado = n1 + n2;
            String valSoma = Integer.toString(resultado);
            fieldTxt.setText(valSoma);
        } else if (campo.contains(sub)) {
            int sinal = fieldTxt.getText().indexOf(sub);
            
            String num1 = campo.substring(0, sinal);
            String num2 = campo.substring(sinal+1, length);
            
            int n1 = Integer.parseInt(num1);
            int n2 = Integer.parseInt(num2);
            
            int resultado = n1 - n2;
            String valSub = Integer.toString(resultado);
            fieldTxt.setText(valSub);
        } else if (campo.contains(multi)) {
            int sinal = fieldTxt.getText().indexOf(multi);
            
            String num1 = campo.substring(0, sinal);
            String num2 = campo.substring(sinal+1, length);
            
            int n1 = Integer.parseInt(num1);
            int n2 = Integer.parseInt(num2);
            
            int resultado = n1 * n2;
            String valMulti = Integer.toString(resultado);
            fieldTxt.setText(valMulti);
        } else if (campo.contains(div)) {
            int sinal = fieldTxt.getText().indexOf(div);
            
            String num1 = campo.substring(0, sinal);
            String num2 = campo.substring(sinal+1, length);
            
            int n1 = Integer.parseInt(num1);
            int n2 = Integer.parseInt(num2);
            
            try {
                int resultado = n1 / n2;
                String valDiv = Integer.toString(resultado);
                fieldTxt.setText(valDiv);
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Não é possível realizar uma divisão por 0!");
                fieldTxt.setText("");
            }            
        }
    }//GEN-LAST:event_btnRespostaActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        fieldTxt.setText(fieldTxt.getText() + "3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void fieldTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldTxtActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        fieldTxt.setText(fieldTxt.getText() + "7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        fieldTxt.setText(fieldTxt.getText() + "8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        fieldTxt.setText(fieldTxt.getText() + "9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        if (verificarSinal(fieldTxt.getText()) == true) {
            fieldTxt.getText().replace("/", "");
        } else {
            fieldTxt.setText(fieldTxt.getText() + "/");
        }
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        fieldTxt.setText(fieldTxt.getText() + "4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        fieldTxt.setText(fieldTxt.getText() + "5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        if (verificarSinal(fieldTxt.getText()) == true) {
            fieldTxt.getText().replace("x", "");
        } else {
            fieldTxt.setText(fieldTxt.getText() + "x");
        }
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtrairActionPerformed
        if (verificarSinal(fieldTxt.getText()) == true) {
            fieldTxt.getText().replace("-", "");
        } else {
            fieldTxt.setText(fieldTxt.getText() + "-");
        }
    }//GEN-LAST:event_btnSubtrairActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        fieldTxt.setText(fieldTxt.getText() + "2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        fieldTxt.setText(fieldTxt.getText() + "1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btnSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomarActionPerformed
        if (verificarSinal(fieldTxt.getText()) == true) {
            fieldTxt.getText().replace("+", "");
        } else {
            fieldTxt.setText(fieldTxt.getText() + "+");
        }
    }//GEN-LAST:event_btnSomarActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        fieldTxt.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnResposta;
    private javax.swing.JButton btnSomar;
    private javax.swing.JButton btnSubtrair;
    private javax.swing.JTextField fieldTxt;
    // End of variables declaration//GEN-END:variables
}
