/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemadamochilaag;

import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Jess
 */
public class Interface extends javax.swing.JFrame {

    public List<Item> itens;
    private Long inicioExecucao;
    public Interface() {
        initComponents();
    }
    
    public void imprimirGeracao (Populacao p, int geracao){
        String itensGene;
        txtAreaGera.append("Geração: "+geracao+"\r\n");
        int j=0;
        for (Cromossomo c : p.getPopulacao()) {
            txtAreaGera.append("Cromossomo: "+ j++ );
            itensGene = " ";
            for(Item i : c.getGenes()){
                if(i.isSelecionado()){
                    itensGene += i.getNome() +" - ";
                }
            }
            txtAreaGera.append(itensGene +" Preço: "+c.getPreco()+ " - Nota: "+c.getNota()+"\r\n");
        }
        txtAreaGera.append("Nota População: "+p.getPesoPopulacao()+"\r\n");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtVolume = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPopulacao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtGeracoes = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMutacao = new javax.swing.JTextField();
        btnPlay = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblItens = new javax.swing.JLabel();
        btnCarregarItens = new javax.swing.JButton();
        carregando = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaGera = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista3 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lista2 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        lista1 = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nota1 = new javax.swing.JLabel();
        preco1 = new javax.swing.JLabel();
        nota2 = new javax.swing.JLabel();
        preco2 = new javax.swing.JLabel();
        nota3 = new javax.swing.JLabel();
        preco3 = new javax.swing.JLabel();
        peso1 = new javax.swing.JLabel();
        peso2 = new javax.swing.JLabel();
        peso3 = new javax.swing.JLabel();
        volume1 = new javax.swing.JLabel();
        volume2 = new javax.swing.JLabel();
        volume3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Mochila"));

        jLabel3.setText("Volume");

        txtVolume.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtVolume.setText("3000");

        jLabel4.setText("Peso");

        txtPeso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPeso.setText("3000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(txtVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtPeso, txtVolume});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Algoritmo Genético"));

        jLabel1.setText("População");

        txtPopulacao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPopulacao.setText("200");

        jLabel2.setText("Gerações");

        txtGeracoes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGeracoes.setText("100");

        jLabel7.setText("Prob. Mutação");

        txtMutacao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMutacao.setText("0.01");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(txtPopulacao, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtGeracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtMutacao, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtGeracoes, txtPopulacao});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPopulacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGeracoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMutacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnPlay.setText("Executar");
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Itens"));

        jLabel5.setText("Total de Itens");

        lblItens.setText("0");

        btnCarregarItens.setText("Carregar Itens");
        btnCarregarItens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarItensActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblItens, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addComponent(carregando)
                .addGap(272, 272, 272)
                .addComponent(btnCarregarItens)
                .addGap(52, 52, 52))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItens)
                    .addComponent(jLabel5)
                    .addComponent(btnCarregarItens)
                    .addComponent(carregando))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Gerações"));

        txtAreaGera.setColumns(20);
        txtAreaGera.setRows(5);
        jScrollPane1.setViewportView(txtAreaGera);

        jScrollPane2.setViewportView(lista3);

        jScrollPane3.setViewportView(lista2);

        jScrollPane4.setViewportView(lista1);

        jLabel6.setText("1º Lugar");

        jLabel8.setText("2º Lugar");

        jLabel9.setText("3º Lugar");

        nota1.setText("Nota:");

        preco1.setText("Preço:");

        nota2.setText("Nota:");

        preco2.setText("Preço:");

        nota3.setText("Nota:");

        preco3.setText("Preço:");

        peso1.setText("Peso:");

        peso2.setText("Peso:");

        peso3.setText("Peso:");

        volume1.setText("Volume:");

        volume2.setText("Volume:");

        volume3.setText("Volume:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(volume1)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(peso1)
                    .addComponent(preco1)
                    .addComponent(nota1)
                    .addComponent(jLabel6))
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(nota2)
                    .addComponent(preco2)
                    .addComponent(peso2)
                    .addComponent(volume2))
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(volume3)
                    .addComponent(peso3)
                    .addComponent(preco3)
                    .addComponent(nota3)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nota1)
                            .addComponent(nota2)
                            .addComponent(nota3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(preco3)
                            .addComponent(preco2)
                            .addComponent(preco1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(peso1)
                            .addComponent(peso2)
                            .addComponent(peso3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(volume1)
                            .addComponent(volume2)
                            .addComponent(volume3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPlay)
                        .addGap(49, 49, 49)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPlay)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCarregarItensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarItensActionPerformed
        JFileChooser chooser = new JFileChooser(""); 
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY); 
        int returnVal = chooser.showOpenDialog((java.awt.Component) null); 
        
        if ( returnVal == chooser.APPROVE_OPTION ) { 
            java.io.File inFile = chooser.getSelectedFile(); 
            itens = new Util().getItens(inFile.getAbsolutePath());
        }
        lblItens.setText(String.valueOf(itens.size()));
    }//GEN-LAST:event_btnCarregarItensActionPerformed

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        if(itens == null){
            JOptionPane.showMessageDialog(this, "É Necessário carregar os itens antes de executar o algoritmo!");
            return;
        }
        clearLabels();
        txtAreaGera.setText("");
        btnPlay.setEnabled(false);
        carregando.setText("CARREGANDO...");
        inicioExecucao = System.currentTimeMillis();
        new Executor(txtPopulacao.getText(), txtVolume.getText(), txtPeso.getText(), txtGeracoes.getText(), itens, this).start();
    }//GEN-LAST:event_btnPlayActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarregarItens;
    private javax.swing.JButton btnPlay;
    private javax.swing.JLabel carregando;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblItens;
    private javax.swing.JList<String> lista1;
    private javax.swing.JList<String> lista2;
    private javax.swing.JList<String> lista3;
    private javax.swing.JLabel nota1;
    private javax.swing.JLabel nota2;
    private javax.swing.JLabel nota3;
    private javax.swing.JLabel peso1;
    private javax.swing.JLabel peso2;
    private javax.swing.JLabel peso3;
    private javax.swing.JLabel preco1;
    private javax.swing.JLabel preco2;
    private javax.swing.JLabel preco3;
    private javax.swing.JTextArea txtAreaGera;
    private javax.swing.JTextField txtGeracoes;
    private javax.swing.JTextField txtMutacao;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPopulacao;
    private javax.swing.JTextField txtVolume;
    private javax.swing.JLabel volume1;
    private javax.swing.JLabel volume2;
    private javax.swing.JLabel volume3;
    // End of variables declaration//GEN-END:variables

    void setEnabledExecutar() {
        btnPlay.setEnabled(true);
    }

    void exibirTop3(List<Cromossomo> top3) {
        DefaultListModel modelo;
        int pesoTotal;
        int volumeTotal;
        carregando.setText("");
        for (int j = 1; j < 4; j++) {
            Cromossomo c = top3.get(j);
            pesoTotal = 0;
            volumeTotal = 0;
            modelo = new DefaultListModel();

            for (Item i : c.getGenes()) {
                if (i.isSelecionado()) {
                    modelo.addElement(i.getNome());
                    pesoTotal += i.getPeso();
                    volumeTotal += i.getVolume();
                }
            }
            setLabels(modelo, j, pesoTotal, volumeTotal, c);
        }
        carregando.setText("Tempo de execução: " + ((System.currentTimeMillis() - inicioExecucao)/1000) + " segundos");
    }
    
    private void clearLabels() {
        preco1.setText("Preço: ");
        nota1.setText("Nota: ");
        peso1.setText("Peso: ");
        volume1.setText("Volume: ");
        preco2.setText("Preço: ");
        nota2.setText("Nota: ");
        peso2.setText("Peso: ");
        volume2.setText("Volume: ");
        preco3.setText("Preço: ");
        nota3.setText("Nota: ");
        peso3.setText("Peso: ");
        volume3.setText("Volume: ");
        lista1.setModel(new DefaultListModel());
        lista2.setModel(new DefaultListModel());
        lista3.setModel(new DefaultListModel());
    }
    
    private void setLabels(DefaultListModel modelo, int j, int pesoTotal, int volumeTotal, Cromossomo c) {
        switch (j) {
            case 1:
                lista1.setModel(modelo);
                preco1.setText(preco1.getText() + " $" + c.getPreco());
                nota1.setText(nota1.getText() + " " + c.getNota());
                peso1.setText(peso1.getText() + " " + pesoTotal + " g");
                volume1.setText(volume1.getText() + " " + volumeTotal + " m3");
                break;
            case 2:
                lista2.setModel(modelo);
                preco2.setText(preco2.getText() + " $" + c.getPreco());
                nota2.setText(nota2.getText() + " " + c.getNota());
                peso2.setText(peso2.getText() + " " + pesoTotal + " g");
                volume2.setText(volume2.getText() + " " + volumeTotal + " m3");
                break;
            case 3:
                lista3.setModel(modelo);
                preco3.setText(preco3.getText() + " $" + c.getPreco());
                nota3.setText(nota3.getText() + " " + c.getNota());
                peso3.setText(peso3.getText() + " " + pesoTotal + " g");
                volume3.setText(volume3.getText() + " " + volumeTotal + " m3");
                break;
        }
    }
}
