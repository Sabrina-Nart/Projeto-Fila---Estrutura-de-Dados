
package forms;

import javax.swing.JOptionPane;
import tad.Fila;

public class dialogFila extends javax.swing.JDialog {

    Fila fila = null;
    
    public dialogFila(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textValor = new javax.swing.JTextField();
        buttonEnqueue = new javax.swing.JButton();
        buttonDequeue = new javax.swing.JButton();
        buttonFirst = new javax.swing.JButton();
        buttonMostrarFiltro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Valor");

        textValor.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        buttonEnqueue.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonEnqueue.setText("Enqueue");
        buttonEnqueue.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 204, 255), new java.awt.Color(0, 204, 255)));
        buttonEnqueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEnqueueActionPerformed(evt);
            }
        });

        buttonDequeue.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonDequeue.setText("Dequeue");
        buttonDequeue.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 204, 255), new java.awt.Color(0, 204, 255)));
        buttonDequeue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDequeueActionPerformed(evt);
            }
        });

        buttonFirst.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonFirst.setText("First");
        buttonFirst.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 204, 255), new java.awt.Color(0, 204, 255)));
        buttonFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFirstActionPerformed(evt);
            }
        });

        buttonMostrarFiltro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonMostrarFiltro.setText("Mostar Filtro");
        buttonMostrarFiltro.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 204, 255), new java.awt.Color(0, 204, 255)));
        buttonMostrarFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMostrarFiltroActionPerformed(evt);
            }
        });

        area.setColumns(20);
        area.setRows(5);
        area.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 204, 255), new java.awt.Color(0, 204, 255)));
        jScrollPane1.setViewportView(area);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(buttonMostrarFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textValor, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(buttonEnqueue, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonDequeue, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonFirst, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(buttonEnqueue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonDequeue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonMostrarFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEnqueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEnqueueActionPerformed

        if (textValor.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo de valor é obrigátorio");
            textValor.requestFocus();
            return;
        }
        area.setText(fila.enQueue(textValor.getText()) ? "Adicionado no final da fila" : "Fila CHEIA");

        textValor.setText("");
        textValor.requestFocus();
    }//GEN-LAST:event_buttonEnqueueActionPerformed

    private void buttonDequeueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDequeueActionPerformed

        String texto = fila.firstQueue();
        area.setText(fila.deQueue() ? texto + " Removido da fila" : "Queue UnderFlow");
    }//GEN-LAST:event_buttonDequeueActionPerformed

    private void buttonFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFirstActionPerformed

        area.setText(fila.isEmptyQuenue() ? "Fila VAZIA" : fila.firstQueue());
    }//GEN-LAST:event_buttonFirstActionPerformed

    private void buttonMostrarFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMostrarFiltroActionPerformed

        if (fila.isEmptyQuenue()){
            area.setText("A Fila está VÁZIA");
            return; 
        }

        Fila temp = null; 
        try{
            temp = fila.clone();
        }catch(CloneNotSupportedException ex){
            System.out.println("ERRO" + ex.getMessage()); 
        }
        
        area.setText("----Elementos da Fila----\n");
        while (!temp.isEmptyQuenue()){ 
            area.append(temp.firstQueue() + "\n");
            temp.deQueue();
        }
    }//GEN-LAST:event_buttonMostrarFiltroActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho"));
        this.fila = new Fila(tamanho);
    }//GEN-LAST:event_formWindowOpened


    
    
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dialogFila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogFila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogFila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogFila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialogFila dialog = new dialogFila(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton buttonDequeue;
    private javax.swing.JButton buttonEnqueue;
    private javax.swing.JButton buttonFirst;
    private javax.swing.JButton buttonMostrarFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField textValor;
    // End of variables declaration//GEN-END:variables
}
