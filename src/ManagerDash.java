import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ManagerDash extends javax.swing.JFrame {

    private User user; // logged-in user
    private DefaultTableModel model;

    // Default constructor
    public ManagerDash() {
        initComponents();
        initTable();
    }

    // Setter for the logged-in user
    public void setUser(User user) {
        this.user = user;
        setTitle("Manager Dashboard - " + user.getUsername());
        showWelcomeMessage();
    }

    // Display welcome message
    private void showWelcomeMessage() {
        if (user != null) {
            JOptionPane.showMessageDialog(this,
                    "Welcome, " + user.getUsername() + "!", "Info",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void initTable() {
        model = new DefaultTableModel(
                new Object[][]{
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String[]{"Cupcake ID", "Product Name", "Price", "Quantity"}
        );
        tblCupcakes.setModel(model);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblPrice = new javax.swing.JPanel();
        lblCupcakeID = new javax.swing.JLabel();
        lblProductName = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        lblCategory = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        txtCupcakeID = new javax.swing.JTextField();
        txtProductName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        lblAddCupcakeTitle = new javax.swing.JLabel();
        cmbCategory = new javax.swing.JComboBox();
        btnAddCupcake = new javax.swing.JButton();
        btnViewCupcakes = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        scrollCupcakes = new javax.swing.JScrollPane();
        tblCupcakes = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        lblSubtitle = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPrice.setBackground(new java.awt.Color(204, 204, 204));

        lblCupcakeID.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblCupcakeID.setText("Cupcake ID");

        lblProductName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblProductName.setText("Product Name");

        jLabel43.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel43.setText("Price");

        lblCategory.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblCategory.setText("Category");

        lblQuantity.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblQuantity.setText("Quantity");

        lblAddCupcakeTitle.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblAddCupcakeTitle.setText("Add Cupcake ");

        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAddCupcake.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAddCupcake.setText("Add");
        btnAddCupcake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCupcakeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lblPriceLayout = new javax.swing.GroupLayout(lblPrice);
        lblPrice.setLayout(lblPriceLayout);
        lblPriceLayout.setHorizontalGroup(
            lblPriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblPriceLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(lblPriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProductName)
                    .addComponent(jLabel43)
                    .addComponent(lblCupcakeID))
                .addGap(18, 18, 18)
                .addGroup(lblPriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblPriceLayout.createSequentialGroup()
                        .addGroup(lblPriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCupcakeID, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(lblPriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCategory)
                            .addComponent(lblQuantity))
                        .addGap(10, 10, 10)
                        .addGroup(lblPriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtQuantity)
                            .addComponent(cmbCategory, 0, 109, Short.MAX_VALUE)))
                    .addGroup(lblPriceLayout.createSequentialGroup()
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddCupcake)))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblPriceLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAddCupcakeTitle)
                .addGap(172, 172, 172))
        );
        lblPriceLayout.setVerticalGroup(
            lblPriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblPriceLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblAddCupcakeTitle)
                .addGap(18, 18, 18)
                .addGroup(lblPriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCupcakeID)
                    .addComponent(lblCategory)
                    .addComponent(txtCupcakeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(lblPriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductName)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantity))
                .addGap(28, 28, 28)
                .addGroup(lblPriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddCupcake))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel2.add(lblPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 94, -1, -1));

        btnViewCupcakes.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnViewCupcakes.setText("View Cupcakes");
        btnViewCupcakes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCupcakesActionPerformed(evt);
            }
        });
        jPanel2.add(btnViewCupcakes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 337, -1, -1));

        btnExit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel2.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 337, -1, -1));

        tblCupcakes.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollCupcakes.setViewportView(tblCupcakes);

        jPanel2.add(scrollCupcakes, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 413, 468, 95));

        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("SWEET CUPCAKE SHOP");
        jPanel2.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 20, -1, -1));

        lblSubtitle.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblSubtitle.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtitle.setText("Manager Dashboard");
        jPanel2.add(lblSubtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 54, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Create Cashier Account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 200, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cashier.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCupcakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCupcakeActionPerformed
        String id = txtCupcakeID.getText().trim();
        String name = txtProductName.getText().trim();
        String price = txtPrice.getText().trim();
        String quantity = txtQuantity.getText().trim();
        String category = cmbCategory.getSelectedItem().toString();

        if (id.isEmpty() || name.isEmpty() || price.isEmpty() || quantity.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        model.addRow(new Object[]{id + " - " + category, name, price, quantity});
        JOptionPane.showMessageDialog(this, "Cupcake added successfully!");

        txtCupcakeID.setText("");
        txtProductName.setText("");
        txtPrice.setText("");
        txtQuantity.setText("");
    
    }//GEN-LAST:event_btnAddCupcakeActionPerformed

    private void btnViewCupcakesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCupcakesActionPerformed
        JOptionPane.showMessageDialog(this, "Displaying cupcake list...");
    }//GEN-LAST:event_btnViewCupcakesActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        NewCashier newCashierFrame = new NewCashier();
        newCashierFrame.setVisible(true);
        newCashierFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed
private void addCashier() {
    // Logic to add a cashier
    JOptionPane.showMessageDialog(this, "Cashier added successfully!");
}


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
            java.util.logging.Logger.getLogger(ManagerDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerDash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCupcake;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnViewCupcakes;
    private javax.swing.JComboBox cmbCategory;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAddCupcakeTitle;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblCupcakeID;
    private javax.swing.JPanel lblPrice;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblSubtitle;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane scrollCupcakes;
    private javax.swing.JTable tblCupcakes;
    private javax.swing.JTextField txtCupcakeID;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
