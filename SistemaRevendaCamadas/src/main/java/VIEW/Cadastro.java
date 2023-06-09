/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package VIEW;

import com.formdev.flatlaf.*;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author William
 */
public class Cadastro extends javax.swing.JDialog {

    /**
     * Creates new form Cadastro
     */
    public Cadastro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jTextField5 = new javax.swing.JTextField();
        mnuPopupLista = new javax.swing.JPopupMenu();
        mnuEditar = new javax.swing.JMenuItem();
        mnuManutencao = new javax.swing.JMenuItem();
        pnlCadastro = new javax.swing.JPanel();
        lblMarca = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        lblAno = new javax.swing.JLabel();
        lblCor = new javax.swing.JLabel();
        txtCor = new javax.swing.JTextField();
        spnAno = new javax.swing.JSpinner();
        lblMotor = new javax.swing.JLabel();
        spnMotor = new javax.swing.JSpinner();
        lblCombustivel = new javax.swing.JLabel();
        cboxCombustivel = new javax.swing.JComboBox<>();
        lblCambio = new javax.swing.JLabel();
        lblDirecao = new javax.swing.JLabel();
        cboxCambio = new javax.swing.JComboBox<>();
        cboxDirecao = new javax.swing.JComboBox<>();
        cboxMarca = new javax.swing.JComboBox<>();
        cboxModelo = new javax.swing.JComboBox<>();
        lblCadastro = new javax.swing.JLabel();
        pnlDadosCompra = new javax.swing.JPanel();
        lblFornecedor = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        txtFornecedor = new javax.swing.JTextField();
        ftxtData = new javax.swing.JFormattedTextField();
        lblPlaca = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        pnlVeiculos = new javax.swing.JPanel();
        ScrollPane_Lista = new javax.swing.JScrollPane();
        tblVeiculos = new javax.swing.JTable();

        mnuEditar.setText("Editar");
        mnuEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEditarActionPerformed(evt);
            }
        });
        mnuPopupLista.add(mnuEditar);

        mnuManutencao.setText("jMenuItem1");
        mnuManutencao.setActionCommand("Manutenções");
        mnuPopupLista.add(mnuManutencao);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder("Ficha Tecnica"));

        lblMarca.setText("Marca");

        lblModelo.setText("Modelo");

        lblAno.setText("Ano");

        lblCor.setText("Cor");

        spnAno.setModel(new javax.swing.SpinnerNumberModel(2000, 2000, 2030, 1));
        spnAno.setToolTipText("");
        spnAno.setValue(2000);

        lblMotor.setText("Potência do motor");

        spnMotor.setModel(new javax.swing.SpinnerNumberModel(1.0d, null, null, 0.10000000000000009d));
        spnMotor.setToolTipText("");
        spnMotor.setName(""); // NOI18N
        spnMotor.setValue(1);

        lblCombustivel.setText("Combustível");

        cboxCombustivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Álcool", "Diesel", "Elétrico", "Flex", "Gasolina", "Híbrido" }));
        cboxCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxCombustivelActionPerformed(evt);
            }
        });

        lblCambio.setText("Câmbio");

        lblDirecao.setText("Direção");

        cboxCambio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Automático", "Manual", "Semi-automático" }));

        cboxDirecao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Assistida", "Elétrica", "Hidraulica", "Mecanica" }));

        cboxMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fiat", "Volkswagen" }));
        cboxMarca.setSelectedIndex(-1);
        cboxMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxMarcaActionPerformed(evt);
            }
        });

        cboxModelo.setEnabled(false);

        javax.swing.GroupLayout pnlCadastroLayout = new javax.swing.GroupLayout(pnlCadastro);
        pnlCadastro.setLayout(pnlCadastroLayout);
        pnlCadastroLayout.setHorizontalGroup(
            pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblModelo)
                    .addComponent(lblAno)
                    .addComponent(lblCor)
                    .addComponent(lblMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCor, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(spnAno)
                    .addComponent(cboxMarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboxModelo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastroLayout.createSequentialGroup()
                        .addComponent(lblMotor)
                        .addGap(18, 18, 18)
                        .addComponent(spnMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCadastroLayout.createSequentialGroup()
                        .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCombustivel)
                            .addComponent(lblDirecao)
                            .addComponent(lblCambio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboxCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboxDirecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboxCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
        );
        pnlCadastroLayout.setVerticalGroup(
            pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroLayout.createSequentialGroup()
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca)
                    .addComponent(lblCombustivel)
                    .addComponent(cboxCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelo)
                    .addComponent(lblCambio)
                    .addComponent(cboxCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAno)
                    .addComponent(spnAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDirecao)
                    .addComponent(cboxDirecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCor)
                    .addComponent(lblMotor)
                    .addComponent(spnMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        lblCadastro.setBackground(new java.awt.Color(0, 0, 0));
        lblCadastro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCadastro.setText("Cadastro de Automóveis");

        pnlDadosCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados da compra"));

        lblFornecedor.setText("Fornecedor");

        lblValor.setText("Valor (R$)");

        lblData.setText("Data");

        try {
            ftxtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout pnlDadosCompraLayout = new javax.swing.GroupLayout(pnlDadosCompra);
        pnlDadosCompra.setLayout(pnlDadosCompraLayout);
        pnlDadosCompraLayout.setHorizontalGroup(
            pnlDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosCompraLayout.createSequentialGroup()
                .addGroup(pnlDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosCompraLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDadosCompraLayout.createSequentialGroup()
                                .addComponent(lblData)
                                .addGap(48, 48, 48))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosCompraLayout.createSequentialGroup()
                                .addComponent(lblValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosCompraLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblFornecedor)
                        .addGap(18, 18, 18)))
                .addGroup(pnlDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftxtData, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        pnlDadosCompraLayout.setVerticalGroup(
            pnlDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosCompraLayout.createSequentialGroup()
                .addGroup(pnlDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFornecedor)
                    .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(pnlDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValor))
                .addGap(6, 6, 6)
                .addGroup(pnlDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData)
                    .addComponent(ftxtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        lblPlaca.setText("Placa do carro");

        txtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaActionPerformed(evt);
            }
        });

        btnAdicionar.setText("Adicionar");
        btnAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        pnlVeiculos.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de veiculos não vendidos"));

        tblVeiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Modelo", "Cor", "Ano", "Placa", "Fornecedor", "Valor compra", "Data compra"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVeiculos.setComponentPopupMenu(mnuPopupLista);
        ScrollPane_Lista.setViewportView(tblVeiculos);

        javax.swing.GroupLayout pnlVeiculosLayout = new javax.swing.GroupLayout(pnlVeiculos);
        pnlVeiculos.setLayout(pnlVeiculosLayout);
        pnlVeiculosLayout.setHorizontalGroup(
            pnlVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollPane_Lista)
        );
        pnlVeiculosLayout.setVerticalGroup(
            pnlVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVeiculosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPane_Lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlVeiculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlDadosCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblPlaca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lblCadastro)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdicionar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblCadastro)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlDadosCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPlaca)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir))
                .addGap(18, 18, 18)
                .addComponent(pnlVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaActionPerformed

    
    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        String marca = cboxMarca.getSelectedItem().toString();
        String modelo = cboxModelo.getSelectedItem().toString();
        int ano = Integer.parseInt(spnAno.getValue().toString());
        String cor = txtCor.getText();
        String combustivel = cboxCombustivel.getSelectedItem().toString();
        String cambio = cboxCambio.getSelectedItem().toString();
        String direcao = cboxDirecao.getSelectedItem().toString();
        double p_motor = Double.parseDouble(spnMotor.getValue().toString());
        
        String fornecedor = txtFornecedor.getText();
        double valor_compra = Double.parseDouble(txtValor.getText());
        String data_compra = ftxtData.getText();
        String placa = txtPlaca.getText();
        
        adicionarTabela(marca,modelo,cor,ano,placa,fornecedor,valor_compra, data_compra);
        //ComboBox_Direcao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Assistida", "Elétrica", "Hidraulica", "Mecanica" }));
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void adicionarTabela(String marca, String modelo, String cor, int ano, String placa, String fornecedor, double valor_compra, String data_compra){
        Object lista[] = {marca, modelo, cor, ano, placa, fornecedor, valor_compra, data_compra};
        ((DefaultTableModel) tblVeiculos.getModel() ).addRow(lista);
        tblVeiculos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        
        /*( (DefaultTableModel) tblVeiculos.getModel() ).addRow( new Object[8]     );
        
        int linha = tblVeiculos.getRowCount() - 1;
        int col = 0;
        
        tblVeiculos.setValueAt(marca, linha, col++);
        tblVeiculos.setValueAt(modelo, linha, col++);
        tblVeiculos.setValueAt(cor, linha, col++);
        tblVeiculos.setValueAt(ano, linha, col++);
        tblVeiculos.setValueAt(placa, linha, col++);
        tblVeiculos.setValueAt(fornecedor, linha, col++);
        tblVeiculos.setValueAt(valor_compra, linha, col++);
        tblVeiculos.setValueAt(data_compra, linha, col++);
        cboxDirecao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "teste", "Elétrica", "Hidraulica", "Mecanica" }));
        */
        limparCampos();
        
    }
    
    private void limparCampos(){
        cboxMarca.setSelectedIndex(-1);
        cboxMarca.setEnabled(false);
        spnAno.setValue(2000);
        txtCor.setText("");
        cboxCombustivel.setSelectedIndex(0);
        cboxCambio.setSelectedIndex(0);
        cboxDirecao.setSelectedIndex(0);
        spnMotor.setValue(1);
        txtFornecedor.setText("");
        txtValor.setText("");
        ftxtData.setText("");
        txtPlaca.setText("");

       /* String modelo = .getText();
        int ano = Integer.parseInt(.getValue().toString());
        String cor = .getText();
        String combustivel = .getSelectedItem().toString();
        String cambio = .getSelectedItem().toString();
        String direcao = .getSelectedItem().toString();
        double p_motor = Double.parseDouble(.getValue().toString());
        
        String fornecedor = .getText();
        double valor_compra = Double.parseDouble(.getText());
        String data_compra = .getText();
        String placa = .getText();
        */
    }

    private void cboxCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxCombustivelActionPerformed

    }//GEN-LAST:event_cboxCombustivelActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linhaSelecionada = tblVeiculos.getSelectedRow();
        if(linhaSelecionada >= 0){
            if(JOptionPane.showConfirmDialog(this, "Desejar realmente excluir?", "Título", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
              ( (DefaultTableModel) tblVeiculos.getModel() ).removeRow(linhaSelecionada);
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Selecione uma linha.", "Título", JOptionPane.ERROR_MESSAGE);
        }
          
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       /* int linhaSelecionada = tblVeiculos.getSelectedRow();
        int col = 0;
        txtMarca.setText(tblVeiculos.getValueAt(linhaSelecionada, col++).toString());
        txtModelo.setText(tblVeiculos.getValueAt(linhaSelecionada, col++).toString());
        spnAno.setValue(tblVeiculos.getValueAt(linhaSelecionada, col++));
       // TextField_Cor.setText(Table_Lista.getValueAt(linhaSelecionada, col++).toString());
        txtPlaca.setText(tblVeiculos.getValueAt(linhaSelecionada, col++).toString());
        txtFornecedor.setText(tblVeiculos.getValueAt(linhaSelecionada, col++).toString());
        txtValor.setText(tblVeiculos.getValueAt(linhaSelecionada, col++).toString());
        ftxtData.setText(tblVeiculos.getValueAt(linhaSelecionada, col++).toString());    
        */
        
        
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void mnuEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEditarActionPerformed
        
    }//GEN-LAST:event_mnuEditarActionPerformed

    
 
        
    private void inserirModelo(String marca, String[] listaModelos){
        if(cboxMarca.getSelectedItem().equals(marca)){
            ComboBoxModel model = new DefaultComboBoxModel(listaModelos);
            cboxModelo.setModel(model);
            cboxModelo.setEnabled(true);
            
        }
    }
    
    private void cboxMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxMarcaActionPerformed
        String modelosFiat[] = new String[]{"Uno", "Palio", "Strada", "Siena"};
        String modelosVolkswagen[] = new String[]{"Gol"};
        
        inserirModelo("Fiat", modelosFiat);
        inserirModelo("Volkswagen", modelosVolkswagen);
    }//GEN-LAST:event_cboxMarcaActionPerformed
      

    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
         
        /* Create and display the dialog */
        FlatDarculaLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Cadastro dialog = new Cadastro(new javax.swing.JFrame(), true);
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
    private javax.swing.JScrollPane ScrollPane_Lista;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JComboBox<String> cboxCambio;
    private javax.swing.JComboBox<String> cboxCombustivel;
    private javax.swing.JComboBox<String> cboxDirecao;
    private javax.swing.JComboBox<String> cboxMarca;
    private javax.swing.JComboBox<String> cboxModelo;
    private javax.swing.JFormattedTextField ftxtData;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblCambio;
    private javax.swing.JLabel lblCombustivel;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDirecao;
    private javax.swing.JLabel lblFornecedor;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblMotor;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblValor;
    private javax.swing.JMenuItem mnuEditar;
    private javax.swing.JMenuItem mnuManutencao;
    private javax.swing.JPopupMenu mnuPopupLista;
    private javax.swing.JPanel pnlCadastro;
    private javax.swing.JPanel pnlDadosCompra;
    private javax.swing.JPanel pnlVeiculos;
    private javax.swing.JSpinner spnAno;
    private javax.swing.JSpinner spnMotor;
    private javax.swing.JTable tblVeiculos;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
