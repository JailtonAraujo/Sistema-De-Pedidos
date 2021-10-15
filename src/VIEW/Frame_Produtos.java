/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import CONTROLL.ProdutoControle;
import java.beans.PropertyVetoException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Pichau
 */
public class Frame_Produtos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Frame_Produtos
     */
    private final ProdutoControle controle;
    
    public Frame_Produtos() throws PropertyVetoException {
        initComponents();
        this.controle = new ProdutoControle(this);
        this.controle.CarregarForncedor();
        this.controle.CarregarTabelaProdutos();

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
        Tex_ProCod = new javax.swing.JTextField();
        Tex_ProValorUnitario = new javax.swing.JTextField();
        Tex_ProNome = new javax.swing.JTextField();
        Tex_ProDescricao = new javax.swing.JTextField();
        Tex_ProUnidadeMedida = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Box_ProForNome = new javax.swing.JComboBox<>();
        Tex_ProForCod = new javax.swing.JTextField();
        Tex_ProForCNPJ = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        Bnt_ProCadastrar = new javax.swing.JButton();
        Bnt_ProAtualizar = new javax.swing.JButton();
        Bnt_ProLimpar = new javax.swing.JButton();
        Bnt_ProCancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Bnt_ProEditar = new javax.swing.JButton();
        Bnt_ProExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel_Produtos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("PRODUTOS");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CONTROLE DE PRODUTOS");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)), "Dados Cadastrais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CODIGO:");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("NOME:");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("UNIDADE DE MEDIDA:");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("DESCRiÇÃO:");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("VALOR UNITARIO:");

        Tex_ProValorUnitario.setText("0.00");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("FORNECEDOR:");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("CODIGO DO FORNECEDOR:");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("CNPJ:");

        Box_ProForNome.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Box_ProForNomeItemStateChanged(evt);
            }
        });
        Box_ProForNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box_ProForNomeActionPerformed(evt);
            }
        });

        Tex_ProForCod.setEditable(false);

        Tex_ProForCNPJ.setEditable(false);
        Tex_ProForCNPJ.setForeground(new java.awt.Color(0, 0, 0));
        try {
            Tex_ProForCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tex_ProDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tex_ProNome, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tex_ProCod, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 310, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Tex_ProForCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(19, 19, 19)
                                .addComponent(Tex_ProForCod, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(Box_ProForNome, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(153, 153, 153))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tex_ProValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tex_ProUnidadeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(961, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Tex_ProCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(Box_ProForNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Tex_ProNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(Tex_ProForCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Tex_ProDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(Tex_ProForCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Tex_ProUnidadeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Tex_ProValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        Bnt_ProCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        Bnt_ProCadastrar.setText("CADASTRAR");
        Bnt_ProCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bnt_ProCadastrarActionPerformed(evt);
            }
        });

        Bnt_ProAtualizar.setForeground(new java.awt.Color(0, 0, 0));
        Bnt_ProAtualizar.setText("ATUALIZAR");
        Bnt_ProAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bnt_ProAtualizarActionPerformed(evt);
            }
        });

        Bnt_ProLimpar.setForeground(new java.awt.Color(0, 0, 0));
        Bnt_ProLimpar.setText("LIMPAR");
        Bnt_ProLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bnt_ProLimparActionPerformed(evt);
            }
        });

        Bnt_ProCancelar.setForeground(new java.awt.Color(0, 0, 0));
        Bnt_ProCancelar.setText("CANCELAR");
        Bnt_ProCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bnt_ProCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bnt_ProCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(Bnt_ProAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(Bnt_ProLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(Bnt_ProCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Bnt_ProCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(Bnt_ProAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Bnt_ProLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(Bnt_ProCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        Bnt_ProEditar.setForeground(new java.awt.Color(0, 0, 0));
        Bnt_ProEditar.setText("EDITAR");
        Bnt_ProEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bnt_ProEditarActionPerformed(evt);
            }
        });

        Bnt_ProExcluir.setForeground(new java.awt.Color(0, 0, 0));
        Bnt_ProExcluir.setText("EXCLUIR");
        Bnt_ProExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bnt_ProExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bnt_ProEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bnt_ProExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Bnt_ProEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(Bnt_ProExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        Tabel_Produtos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        Tabel_Produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Valor Unitario", "Codigo do fornecedor"
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
        jScrollPane1.setViewportView(Tabel_Produtos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        setBounds(0, 0, 1571, 761);
    }// </editor-fold>//GEN-END:initComponents

    private void Bnt_ProCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bnt_ProCadastrarActionPerformed
        this.controle.CadastrarProduto();

    }//GEN-LAST:event_Bnt_ProCadastrarActionPerformed

    private void Bnt_ProAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bnt_ProAtualizarActionPerformed
        this.controle.AtualizarProduto();

    }//GEN-LAST:event_Bnt_ProAtualizarActionPerformed

    private void Bnt_ProLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bnt_ProLimparActionPerformed
        this.controle.Limpar();
    }//GEN-LAST:event_Bnt_ProLimparActionPerformed

    private void Bnt_ProCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bnt_ProCancelarActionPerformed
        this.controle.Cancelar();
    }//GEN-LAST:event_Bnt_ProCancelarActionPerformed

    private void Bnt_ProEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bnt_ProEditarActionPerformed
        this.controle.Editar();
    }//GEN-LAST:event_Bnt_ProEditarActionPerformed

    private void Bnt_ProExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bnt_ProExcluirActionPerformed
        this.controle.ExcluirProduto();
    }//GEN-LAST:event_Bnt_ProExcluirActionPerformed

    private void Box_ProForNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box_ProForNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Box_ProForNomeActionPerformed

    private void Box_ProForNomeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Box_ProForNomeItemStateChanged
        this.controle.ObterForncedor();
    }//GEN-LAST:event_Box_ProForNomeItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bnt_ProAtualizar;
    private javax.swing.JButton Bnt_ProCadastrar;
    private javax.swing.JButton Bnt_ProCancelar;
    private javax.swing.JButton Bnt_ProEditar;
    private javax.swing.JButton Bnt_ProExcluir;
    private javax.swing.JButton Bnt_ProLimpar;
    private javax.swing.JComboBox<String> Box_ProForNome;
    private javax.swing.JTable Tabel_Produtos;
    private javax.swing.JTextField Tex_ProCod;
    private javax.swing.JTextField Tex_ProDescricao;
    private javax.swing.JFormattedTextField Tex_ProForCNPJ;
    private javax.swing.JTextField Tex_ProForCod;
    private javax.swing.JTextField Tex_ProNome;
    private javax.swing.JTextField Tex_ProUnidadeMedida;
    private javax.swing.JTextField Tex_ProValorUnitario;
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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public JComboBox<String> getBox_ProForNome() {
        return Box_ProForNome;
    }

    public void setBox_ProForNome(JComboBox<String> Box_ProForNome) {
        this.Box_ProForNome = Box_ProForNome;
    }

    public JButton getBtn_Cancelar() {
        return Bnt_ProCancelar;
    }

    public void setBtn_Cancelar(JButton Btn_Cancelar) {
        this.Bnt_ProCancelar = Btn_Cancelar;
    }

    public JButton getBtn_Limpar() {
        return Bnt_ProLimpar;
    }

    public void setBtn_Limpar(JButton Btn_Limpar) {
        this.Bnt_ProLimpar = Btn_Limpar;
    }

    public JButton getBtn_atalizar() {
        return Bnt_ProAtualizar;
    }

    public void setBtn_atalizar(JButton Btn_atalizar) {
        this.Bnt_ProAtualizar = Btn_atalizar;
    }

    public JButton getBtn_cadastrar() {
        return Bnt_ProCadastrar;
    }

    public void setBtn_cadastrar(JButton Btn_cadastrar) {
        this.Bnt_ProCadastrar = Btn_cadastrar;
    }

    public JButton getBtn_editar() {
        return Bnt_ProEditar;
    }

    public void setBtn_editar(JButton Btn_editar) {
        this.Bnt_ProEditar = Btn_editar;
    }

    public JButton getBtn_excluir() {
        return Bnt_ProExcluir;
    }

    public void setBtn_excluir(JButton Btn_excluir) {
        this.Bnt_ProExcluir = Btn_excluir;
    }

    public JTable getTabel_Produtos() {
        return Tabel_Produtos;
    }

    public void setTabel_Produtos(JTable Tabel_Produtos) {
        this.Tabel_Produtos = Tabel_Produtos;
    }

    public JTextField getTex_ProCod() {
        return Tex_ProCod;
    }

    public void setTex_ProCod(JTextField Tex_ProCod) {
        this.Tex_ProCod = Tex_ProCod;
    }

    public JTextField getTex_ProDescricao() {
        return Tex_ProDescricao;
    }

    public void setTex_ProDescricao(JTextField Tex_ProDescricao) {
        this.Tex_ProDescricao = Tex_ProDescricao;
    }

    public JFormattedTextField getTex_ProForCNPJ() {
        return Tex_ProForCNPJ;
    }

    public void setTex_ProForCNPJ(JFormattedTextField Tex_ProForCNPJ) {
        this.Tex_ProForCNPJ = Tex_ProForCNPJ;
    }

    public JTextField getTex_ProForCod() {
        return Tex_ProForCod;
    }

    public void setTex_ProForCod(JTextField Tex_ProForCod) {
        this.Tex_ProForCod = Tex_ProForCod;
    }

    public JTextField getTex_ProNome() {
        return Tex_ProNome;
    }

    public void setTex_ProNome(JTextField Tex_ProNome) {
        this.Tex_ProNome = Tex_ProNome;
    }

    public JTextField getTex_ProUnidadeMedida() {
        return Tex_ProUnidadeMedida;
    }

    public void setTex_ProUnidadeMedida(JTextField Tex_ProUnidadeMedida) {
        this.Tex_ProUnidadeMedida = Tex_ProUnidadeMedida;
    }

    public JTextField getTex_ProValorUnitario() {
        return Tex_ProValorUnitario;
    }

    public void setTex_ProValorUnitario(JTextField Tex_ProValorUnitario) {
        this.Tex_ProValorUnitario = Tex_ProValorUnitario;
    }

    
}