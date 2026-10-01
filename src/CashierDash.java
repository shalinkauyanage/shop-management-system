import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CashierDash extends javax.swing.JFrame {

    private User user;
    private DefaultTableModel model;

    // Constructor
    public CashierDash() {
        initComponents();
        setTitle("Cashier Dashboard");
        setLocationRelativeTo(null); // Center window
        setupTable();
        setupCategories();
    }

    // Set the logged-in user
    public void setUser(User user) {
        this.user = user;
        setTitle("Cashier Dashboard - " + user.getUsername());
        showWelcomeMessage();
    }

    // Welcome message
    private void showWelcomeMessage() {
        if (user != null) {
            JOptionPane.showMessageDialog(this,
                    "Welcome, " + user.getUsername() + "!",
                    "Login Successful",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Setup categories
    private void setupCategories() {
        cmbCategory.removeAllItems();
        cmbCategory.addItem("Chocolate");
        cmbCategory.addItem("Vanilla");
        cmbCategory.addItem("Strawberry");
        cmbCategory.addItem("Red Velvet");
    }

    // Setup table
    private void setupTable() {
        model = new DefaultTableModel(
                new Object[][]{},
                new String[]{"Cupcake ID", "Product Name", "Category", "Price", "Quantity"}
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
        jLabel2 = new javax.swing.JLabel();

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
                .addGroup(lblPriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblPriceLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblCupcakeID)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblPriceLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(lblPriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43)
                            .addComponent(lblProductName))))
                .addGroup(lblPriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblPriceLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(txtCupcakeID, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lblPriceLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblPriceLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(lblPriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblQuantity)
                    .addComponent(lblCategory))
                .addGap(10, 10, 10)
                .addGroup(lblPriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(lblPriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtQuantity)
                        .addComponent(cmbCategory, 0, 109, Short.MAX_VALUE))
                    .addComponent(btnAddCupcake))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblPriceLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAddCupcakeTitle)
                .addGap(171, 171, 171))
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
                .addGap(39, 39, 39)
                .addGroup(lblPriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProductName)
                    .addComponent(lblQuantity)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(lblPriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblPriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel43))
                    .addComponent(btnAddCupcake))
                .addGap(27, 27, 27))
        );

        jPanel2.add(lblPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 94, 468, -1));

        btnViewCupcakes.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnViewCupcakes.setText("View Cupcakes");
        btnViewCupcakes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCupcakesActionPerformed(evt);
            }
        });
        jPanel2.add(btnViewCupcakes, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 334, -1, -1));

        btnExit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel2.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 334, -1, -1));

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

        jPanel2.add(scrollCupcakes, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 370, 468, 91));

        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("SWEET CUPCAKE SHOP");
        jPanel2.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 22, -1, -1));

        lblSubtitle.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblSubtitle.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtitle.setText("Cashier Dashboard");
        jPanel2.add(lblSubtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 61, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cashier.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewCupcakesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCupcakesActionPerformed
       JOptionPane.showMessageDialog(this, "Total cupcakes listed: " + model.getRowCount());
    }//GEN-LAST:event_btnViewCupcakesActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
         int confirm = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to exit?",
                "Confirm Exit",
                JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            dispose();
    }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAddCupcakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCupcakeActionPerformed
       String id = txtCupcakeID.getText().trim();
        String name = txtProductName.getText().trim();
        String category = cmbCategory.getSelectedItem().toString();
        String price = txtPrice.getText().trim();
        String quantity = txtQuantity.getText().trim();

        if (id.isEmpty() || name.isEmpty() || price.isEmpty() || quantity.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            model.addRow(new Object[]{id, name, category, price, quantity});
            JOptionPane.showMessageDialog(this, "Cupcake added successfully!");
            txtCupcakeID.setText("");
            txtProductName.setText("");
            txtPrice.setText("");
            txtQuantity.setText("");
        }         
    }//GEN-LAST:event_btnAddCupcakeActionPerformed
 // Your method to handle sales
    private void recordSale() {
        // Logic to record the sale (as we wrote earlier)
    }
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
            java.util.logging.Logger.getLogger(CashierDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierDash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCupcake;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnViewCupcakes;
    private javax.swing.JComboBox cmbCategory;
    private javax.swing.JLabel jLabel2;
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
