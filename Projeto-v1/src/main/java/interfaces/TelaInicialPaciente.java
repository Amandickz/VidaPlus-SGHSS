/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import enums.Sexo;
import gerenciamento.GerenciamentoPaciente;

/**
 *
 * @author Amanda
 */
public class TelaInicialPaciente extends javax.swing.JFrame {

    GerenciamentoPaciente gerenciamentoPaciente;
    /**
     * Creates new form TelaInicialAdministrador
     */
    public TelaInicialPaciente(GerenciamentoPaciente gerenciamentoPaciente){
        initComponents();
        this.setLocationRelativeTo(null);
        this.gerenciamentoPaciente = gerenciamentoPaciente;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        sair = new javax.swing.JMenu();
        consultas = new javax.swing.JMenu();
        agendarConsulta = new javax.swing.JMenuItem();
        consultasMarcadas = new javax.swing.JMenuItem();
        consultasAnteriores = new javax.swing.JMenuItem();
        meusDados = new javax.swing.JMenu();
        anamnese = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sair.setText("Sair");
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairMouseClicked(evt);
            }
        });
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        jMenuBar2.add(sair);

        consultas.setText("Consultas");

        agendarConsulta.setText("Agendar Nova Consulta");
        agendarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agendarConsultaActionPerformed(evt);
            }
        });
        consultas.add(agendarConsulta);

        consultasMarcadas.setText("Consultas Marcadas");
        consultas.add(consultasMarcadas);

        consultasAnteriores.setText("Consultas Anteriores");
        consultas.add(consultasAnteriores);

        jMenuBar2.add(consultas);

        meusDados.setText("Meus Dados");
        meusDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meusDadosActionPerformed(evt);
            }
        });

        anamnese.setText("Anamnese");
        anamnese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anamneseActionPerformed(evt);
            }
        });
        meusDados.add(anamnese);

        jMenuItem2.setText("Meu Perfil");
        meusDados.add(jMenuItem2);

        jMenuBar2.add(meusDados);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 835, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 751, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_sairActionPerformed

    private void meusDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meusDadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meusDadosActionPerformed

    private void anamneseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anamneseActionPerformed
        // TODO add your handling code here:
        if(gerenciamentoPaciente.retornaSexo().equals(Sexo.F)){
            new TelaAnamneseCliente(gerenciamentoPaciente).setVisible(true);
        } else {
            
        }
        dispose();
    }//GEN-LAST:event_anamneseActionPerformed

    private void sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_sairMouseClicked

    private void agendarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agendarConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agendarConsultaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem agendarConsulta;
    private javax.swing.JMenuItem anamnese;
    private javax.swing.JMenu consultas;
    private javax.swing.JMenuItem consultasAnteriores;
    private javax.swing.JMenuItem consultasMarcadas;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu meusDados;
    private javax.swing.JMenu sair;
    // End of variables declaration//GEN-END:variables
}
