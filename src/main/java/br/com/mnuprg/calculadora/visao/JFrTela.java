/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.mnuprg.calculadora.visao;

import br.com.mnuprg.calculadora.controle.CalculadoraController;
import br.com.mnuprg.calculadora.enums7.EnumOperacao;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 *
 * @author usuario
 */
public class JFrTela extends javax.swing.JFrame {

   private CalculadoraController calculadoraController;
   
   private EnumOperacao ultimaOperacao;
   
   
   
    /**
     * Creates new form JFrTela
     */
    public JFrTela() {
        initComponents();
        calculadoraController = new CalculadoraController();
            
    }
    
    private String DoubleToString(Double numero) {
        if (numero != null) {
            DecimalFormat formato = new DecimalFormat("##,###,###,#0.00", new DecimalFormatSymbols(new Locale("pt","BR")));
            formato.setParseBigDecimal(true);
            return formato.format(numero);
        }
        return "";
    }
    
    private Double stringToDouble(String numero) {
        NumberFormat nf = NumberFormat.getInstance();
        Double dv = 0.0;
        try {
            dv = nf.parse(numero).doubleValue();
        } catch (ParseException ex) {
            
        }
        return dv;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton12 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        ac = new javax.swing.JButton();
        negativoEpositivo = new javax.swing.JButton();
        percento = new javax.swing.JButton();
        divid = new javax.swing.JButton();
        set = new javax.swing.JButton();
        oit = new javax.swing.JButton();
        nov = new javax.swing.JButton();
        ponto = new javax.swing.JButton();
        quatr = new javax.swing.JButton();
        cinc = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        soma = new javax.swing.JButton();
        um = new javax.swing.JButton();
        dois = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        subtrai = new javax.swing.JButton();
        virgula = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        fecha = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        tfValor = new javax.swing.JTextField();

        jButton12.setText("jButton12");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(5, 4));

        ac.setText("A/C");
        ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acActionPerformed(evt);
            }
        });
        jPanel1.add(ac);

        negativoEpositivo.setText("+/-");
        jPanel1.add(negativoEpositivo);

        percento.setText("%");
        jPanel1.add(percento);

        divid.setText("/");
        divid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividActionPerformed(evt);
            }
        });
        jPanel1.add(divid);

        set.setText("7");
        set.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setActionPerformed(evt);
            }
        });
        jPanel1.add(set);

        oit.setText("8");
        oit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oitActionPerformed(evt);
            }
        });
        jPanel1.add(oit);

        nov.setText("9");
        nov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novActionPerformed(evt);
            }
        });
        jPanel1.add(nov);

        ponto.setText(".");
        ponto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pontoActionPerformed(evt);
            }
        });
        jPanel1.add(ponto);

        quatr.setText("4");
        quatr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quatrActionPerformed(evt);
            }
        });
        jPanel1.add(quatr);

        cinc.setText("5");
        cinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincActionPerformed(evt);
            }
        });
        jPanel1.add(cinc);

        seis.setText("6");
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });
        jPanel1.add(seis);

        soma.setText("+");
        soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somaActionPerformed(evt);
            }
        });
        jPanel1.add(soma);

        um.setText("1");
        um.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umActionPerformed(evt);
            }
        });
        jPanel1.add(um);

        dois.setText("2");
        dois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doisActionPerformed(evt);
            }
        });
        jPanel1.add(dois);

        tres.setText("3");
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });
        jPanel1.add(tres);

        subtrai.setText("-");
        subtrai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtraiActionPerformed(evt);
            }
        });
        jPanel1.add(subtrai);

        virgula.setText(",");
        virgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                virgulaActionPerformed(evt);
            }
        });
        jPanel1.add(virgula);

        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });
        jPanel1.add(zero);

        fecha.setText("FECHAR");
        fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaActionPerformed(evt);
            }
        });
        jPanel1.add(fecha);

        igual.setText("=");
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });
        jPanel1.add(igual);

        tfValor.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tfValor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfValor.setText("0,00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfValor)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void virgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_virgulaActionPerformed
       digita(",");
    }//GEN-LAST:event_virgulaActionPerformed

    private void setActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setActionPerformed
      digita("7");
    }//GEN-LAST:event_setActionPerformed

    private void oitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oitActionPerformed
       digita("8");
    }//GEN-LAST:event_oitActionPerformed

    private void novActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novActionPerformed
      digita("9");
     
    }//GEN-LAST:event_novActionPerformed

    private void quatrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quatrActionPerformed
     digita("4");
    }//GEN-LAST:event_quatrActionPerformed

    private void cincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincActionPerformed
      digita("5");
    }//GEN-LAST:event_cincActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
      digita("6");
    }//GEN-LAST:event_seisActionPerformed

    private void umActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umActionPerformed
     digita("1");
    }//GEN-LAST:event_umActionPerformed

    private void doisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doisActionPerformed
       digita("2");
    }//GEN-LAST:event_doisActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
       digita("3");
    }//GEN-LAST:event_tresActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
      digita("0");
    }//GEN-LAST:event_zeroActionPerformed

    private void acActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acActionPerformed
        limpa();
        calculadoraController.zerar();
    }//GEN-LAST:event_acActionPerformed

    private void fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaActionPerformed
        Systen.exit(0);
    }//GEN-LAST:event_fechaActionPerformed

    private void somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somaActionPerformed
        calculadoraController.realizaOperacao(EnumOperacao.SOMA,stringToDouble(tfValor.getText()));
        ultimaOperacao = EnumOperacao.SOMA;
        limpa();
    }//GEN-LAST:event_somaActionPerformed

    private void dividActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividActionPerformed
        calculadoraController.realizaOperacao(EnumOperacao.DIVISAO,stringToDouble(tfValor.getText()));
        ultimaOperacao = EnumOperacao.DIVISAO;
        limpa();
    }//GEN-LAST:event_dividActionPerformed

    private void subtraiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtraiActionPerformed
        calculadoraController.realizaOperacao(EnumOperacao.SUBTRACAO,stringToDouble(tfValor.getText()));
        ultimaOperacao = EnumOperacao.SUBTRACAO;
        limpa();
    }//GEN-LAST:event_subtraiActionPerformed

    private void pontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pontoActionPerformed
         calculadoraController.realizaOperacao(EnumOperacao.MULTIPLICACAO,stringToDouble(tfValor.getText()));
         ultimaOperacao = EnumOperacao.MULTIPLICACAO;
        limpa();
    }//GEN-LAST:event_pontoActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
       calculadoraController.realizaOperacao(ultimaOperacao,stringToDouble(tfValor.getText()));
       tfValor.setText(DoubleToString(calculadoraController.getTotal()));
    }//GEN-LAST:event_igualActionPerformed

    
    
    
    /**
     * @param args the command line paarguments
     */

   private void limpa() {
       tfValor.setText("0,00");
       
   }
    
   private void digita(String caractere ){
       if (tfValor.getText().equals("0,00")) {
           tfValor.setText(caractere);
       } else {
           if (caractere.equals(",") && tfValor.getText().contains(",")){
               
           } else {
               tfValor.setText(tfValor.getText().concat(caractere));
           }
       }
       
   }
          

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ac;
    private javax.swing.JButton cinc;
    private javax.swing.JButton divid;
    private javax.swing.JButton dois;
    private javax.swing.JButton fecha;
    private javax.swing.JButton igual;
    private javax.swing.JButton jButton12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton negativoEpositivo;
    private javax.swing.JButton nov;
    private javax.swing.JButton oit;
    private javax.swing.JButton percento;
    private javax.swing.JButton ponto;
    private javax.swing.JButton quatr;
    private javax.swing.JButton seis;
    private javax.swing.JButton set;
    private javax.swing.JButton soma;
    private javax.swing.JButton subtrai;
    private javax.swing.JTextField tfValor;
    private javax.swing.JButton tres;
    private javax.swing.JButton um;
    private javax.swing.JButton virgula;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
