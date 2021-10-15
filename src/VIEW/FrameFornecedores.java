/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import CONTROLL.FornecedorControle;
import java.beans.PropertyVetoException;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Pichau
 */
public class FrameFornecedores extends javax.swing.JInternalFrame {

    /**
     * Creates new form Frame_Fornecedores
     */
    private final FornecedorControle controle;

    public FrameFornecedores() throws PropertyVetoException {
        initComponents();
        this.controle = new FornecedorControle(this);
        this.controle.CarregarTabelaFornecedor();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Tex_ForCodigo = new javax.swing.JTextField();
        Tex_ForNome = new javax.swing.JTextField();
        Tex_ForEmail = new javax.swing.JTextField();
        Tex_ForSite = new javax.swing.JTextField();
        Tex_ForCNPJ = new javax.swing.JFormattedTextField();
        Tex_ForTelefone = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        Tex_ForFax = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Fornecedores = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        Bnt_ForCadastrar = new javax.swing.JButton();
        Bnt_ForAtualizar = new javax.swing.JButton();
        Bnt_ForLimpar = new javax.swing.JButton();
        Bnt_ForCancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Bnt_ForEditar = new javax.swing.JButton();
        Bnt_ForExcluir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("FORNECEDORES");
        setPreferredSize(new java.awt.Dimension(1508, 741));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CONTROLE DE FORNECEDORES");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255))));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CODIGO:");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CNPJ:");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("NOME:");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("E-MAIL:");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("TELEFONE:");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("SITE:");

        Tex_ForCodigo.setEditable(false);
        Tex_ForCodigo.setForeground(new java.awt.Color(0, 0, 0));
        Tex_ForCodigo.setText("0");

        Tex_ForNome.setForeground(new java.awt.Color(0, 0, 0));

        Tex_ForEmail.setForeground(new java.awt.Color(0, 0, 0));

        Tex_ForSite.setForeground(new java.awt.Color(0, 0, 0));

        Tex_ForCNPJ.setForeground(new java.awt.Color(0, 0, 0));
        try {
            Tex_ForCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        Tex_ForTelefone.setForeground(new java.awt.Color(0, 0, 0));
        try {
            Tex_ForTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) - # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("FAX:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tex_ForSite, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tex_ForEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tex_ForCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tex_ForNome, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tex_ForCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tex_ForTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tex_ForFax, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(721, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Tex_ForCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Tex_ForNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Tex_ForCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Tex_ForTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tex_ForEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tex_ForSite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Tex_ForFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255))));

        Table_Fornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "CNPJ", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table_Fornecedores);

        Bnt_ForCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        Bnt_ForCadastrar.setText("CADASTRAR");
        Bnt_ForCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bnt_ForCadastrarActionPerformed(evt);
            }
        });

        Bnt_ForAtualizar.setForeground(new java.awt.Color(0, 0, 0));
        Bnt_ForAtualizar.setText("ATUALIZAR");
        Bnt_ForAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bnt_ForAtualizarActionPerformed(evt);
            }
        });

        Bnt_ForLimpar.setForeground(new java.awt.Color(0, 0, 0));
        Bnt_ForLimpar.setText("LIMPAR");
        Bnt_ForLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bnt_ForLimparActionPerformed(evt);
            }
        });

        Bnt_ForCancelar.setForeground(new java.awt.Color(0, 0, 0));
        Bnt_ForCancelar.setText("CANCELAR");
        Bnt_ForCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bnt_ForCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Bnt_ForCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(Bnt_ForAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Bnt_ForLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Bnt_ForCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Bnt_ForCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Bnt_ForAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(Bnt_ForLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Bnt_ForCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        Bnt_ForEditar.setForeground(new java.awt.Color(0, 0, 0));
        Bnt_ForEditar.setText("EDITAR");
        Bnt_ForEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bnt_ForEditarActionPerformed(evt);
            }
        });

        Bnt_ForExcluir.setForeground(new java.awt.Color(0, 0, 0));
        Bnt_ForExcluir.setText("EXCLUIR");
        Bnt_ForExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bnt_ForExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Bnt_ForEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Bnt_ForExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(Bnt_ForEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Bnt_ForExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 28, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(196, 196, 196))))
        );

        setBounds(0, 0, 1575, 741);
    }// </editor-fold>//GEN-END:initComponents

    private void Bnt_ForCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bnt_ForCadastrarActionPerformed
        this.controle.CadastrarFornecedor();

    }//GEN-LAST:event_Bnt_ForCadastrarActionPerformed

    private void Bnt_ForEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bnt_ForEditarActionPerformed
        this.controle.Editar();
    }//GEN-LAST:event_Bnt_ForEditarActionPerformed

    private void Bnt_ForLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bnt_ForLimparActionPerformed
        this.controle.Limpar();
    }//GEN-LAST:event_Bnt_ForLimparActionPerformed

    private void Bnt_ForAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bnt_ForAtualizarActionPerformed
        this.controle.AtualizarFornecedor();
    }//GEN-LAST:event_Bnt_ForAtualizarActionPerformed

    private void Bnt_ForCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bnt_ForCancelarActionPerformed
        this.controle.Cancelar();
    }//GEN-LAST:event_Bnt_ForCancelarActionPerformed

    private void Bnt_ForExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bnt_ForExcluirActionPerformed
        this.controle.ExcluirFornecedor();
    }//GEN-LAST:event_Bnt_ForExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bnt_ForAtualizar;
    private javax.swing.JButton Bnt_ForCadastrar;
    private javax.swing.JButton Bnt_ForCancelar;
    private javax.swing.JButton Bnt_ForEditar;
    private javax.swing.JButton Bnt_ForExcluir;
    private javax.swing.JButton Bnt_ForLimpar;
    private javax.swing.JTable Table_Fornecedores;
    private javax.swing.JFormattedTextField Tex_ForCNPJ;
    private javax.swing.JTextField Tex_ForCodigo;
    private javax.swing.JTextField Tex_ForEmail;
    private javax.swing.JTextField Tex_ForFax;
    private javax.swing.JTextField Tex_ForNome;
    private javax.swing.JTextField Tex_ForSite;
    private javax.swing.JFormattedTextField Tex_ForTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public JButton getBnt_ForAtualizar() {
        return Bnt_ForAtualizar;
    }

    public void setBnt_ForAtualizar(JButton Bnt_ForAtualizar) {
        this.Bnt_ForAtualizar = Bnt_ForAtualizar;
    }

    public JButton getBnt_ForCadastrar() {
        return Bnt_ForCadastrar;
    }

    public void setBnt_ForCadastrar(JButton Bnt_ForCadastrar) {
        this.Bnt_ForCadastrar = Bnt_ForCadastrar;
    }

    public JButton getBnt_ForCancelar() {
        return Bnt_ForCancelar;
    }

    public void setBnt_ForCancelar(JButton Bnt_ForCancelar) {
        this.Bnt_ForCancelar = Bnt_ForCancelar;
    }

    public JButton getBnt_ForEditar() {
        return Bnt_ForEditar;
    }

    public void setBnt_ForEditar(JButton Bnt_ForEditar) {
        this.Bnt_ForEditar = Bnt_ForEditar;
    }

    public JButton getBnt_ForExcluir() {
        return Bnt_ForExcluir;
    }

    public void setBnt_ForExcluir(JButton Bnt_ForExcluir) {
        this.Bnt_ForExcluir = Bnt_ForExcluir;
    }

    public JButton getBnt_ForLimpar() {
        return Bnt_ForLimpar;
    }

    public void setBnt_ForLimpar(JButton Bnt_ForLimpar) {
        this.Bnt_ForLimpar = Bnt_ForLimpar;
    }

    public JTable getTable_Fornecedores() {
        return Table_Fornecedores;
    }

    public void setTable_Fornecedores(JTable Table_Fornecedores) {
        this.Table_Fornecedores = Table_Fornecedores;
    }

    public JFormattedTextField getTex_ForCNPJ() {
        return Tex_ForCNPJ;
    }

    public void setTex_ForCNPJ(JFormattedTextField Tex_ForCNPJ) {
        this.Tex_ForCNPJ = Tex_ForCNPJ;
    }

    public JTextField getTex_ForCodigo() {
        return Tex_ForCodigo;
    }

    public void setTex_ForCodigo(JTextField Tex_ForCodigo) {
        this.Tex_ForCodigo = Tex_ForCodigo;
    }

    public JTextField getTex_ForEmail() {
        return Tex_ForEmail;
    }

    public void setTex_ForEmail(JTextField Tex_ForEmail) {
        this.Tex_ForEmail = Tex_ForEmail;
    }

    public JTextField getTex_ForFax() {
        return Tex_ForFax;
    }

    public void setTex_ForFax(JTextField Tex_ForFax) {
        this.Tex_ForFax = Tex_ForFax;
    }

    public JTextField getTex_ForNome() {
        return Tex_ForNome;
    }

    public void setTex_ForNome(JTextField Tex_ForNome) {
        this.Tex_ForNome = Tex_ForNome;
    }

    public JTextField getTex_ForSite() {
        return Tex_ForSite;
    }

    public void setTex_ForSite(JTextField Tex_ForSite) {
        this.Tex_ForSite = Tex_ForSite;
    }

    public JFormattedTextField getTex_ForTelefone() {
        return Tex_ForTelefone;
    }

    public void setTex_ForTelefone(JFormattedTextField Tex_ForTelefone) {
        this.Tex_ForTelefone = Tex_ForTelefone;
    }

}