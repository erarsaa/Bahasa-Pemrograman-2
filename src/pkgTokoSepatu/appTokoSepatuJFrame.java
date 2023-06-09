/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgTokoSepatu;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ervina Rosa
 */
public class appTokoSepatuJFrame extends javax.swing.JFrame {

    cSepatu spt[];
    int jspt; //jumlah sepatu master di array spt
    cPembelian pb;
    double totalbiaya;
    int jpb; //jumlah sepatu yg dibeli
    
    public appTokoSepatuJFrame() {
        spt = new cSepatu[5];
        pb = null;
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

        jTabbedPaneSepatu = new javax.swing.JTabbedPane();
        jPanelPembelian = new javax.swing.JPanel();
        jPanelSepatu1 = new javax.swing.JPanel();
        jButtonTambahPembelian = new javax.swing.JButton();
        jButtonHapusPembelian = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButtonTambahBelanja = new javax.swing.JButton();
        jButtonBatalPembelian = new javax.swing.JButton();
        jLabelKode = new javax.swing.JLabel();
        jLabelTotalBiaya = new javax.swing.JLabel();
        jPanelSepatu = new javax.swing.JPanel();
        jButtonTambahSepatu = new javax.swing.JButton();
        jButtonUbahSepatu = new javax.swing.JButton();
        jButtonHapusSepatu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonTambahPembelian.setText("Tambah");
        jButtonTambahPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTambahPembelianActionPerformed(evt);
            }
        });

        jButtonHapusPembelian.setText("Hapus Sepatu");
        jButtonHapusPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusPembelianActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Merk", "Harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButtonTambahBelanja.setText("Tambah Sepatu");
        jButtonTambahBelanja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTambahBelanjaActionPerformed(evt);
            }
        });

        jButtonBatalPembelian.setText("Batal");
        jButtonBatalPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBatalPembelianActionPerformed(evt);
            }
        });

        jLabelKode.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabelKode.setText("Kode : ");

        jLabelTotalBiaya.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabelTotalBiaya.setText("Total Biaya : ");

        javax.swing.GroupLayout jPanelSepatu1Layout = new javax.swing.GroupLayout(jPanelSepatu1);
        jPanelSepatu1.setLayout(jPanelSepatu1Layout);
        jPanelSepatu1Layout.setHorizontalGroup(
            jPanelSepatu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanelSepatu1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSepatu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSepatu1Layout.createSequentialGroup()
                        .addComponent(jButtonTambahPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jButtonBatalPembelian)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonTambahBelanja)
                        .addGap(1, 1, 1)
                        .addComponent(jButtonHapusPembelian))
                    .addComponent(jLabelKode)
                    .addComponent(jLabelTotalBiaya))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanelSepatu1Layout.setVerticalGroup(
            jPanelSepatu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSepatu1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSepatu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTambahPembelian)
                    .addComponent(jButtonHapusPembelian)
                    .addComponent(jButtonTambahBelanja)
                    .addComponent(jButtonBatalPembelian))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelKode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTotalBiaya)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelPembelianLayout = new javax.swing.GroupLayout(jPanelPembelian);
        jPanelPembelian.setLayout(jPanelPembelianLayout);
        jPanelPembelianLayout.setHorizontalGroup(
            jPanelPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
            .addGroup(jPanelPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelPembelianLayout.createSequentialGroup()
                    .addGap(0, 12, Short.MAX_VALUE)
                    .addComponent(jPanelSepatu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 12, Short.MAX_VALUE)))
        );
        jPanelPembelianLayout.setVerticalGroup(
            jPanelPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 343, Short.MAX_VALUE)
            .addGroup(jPanelPembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelPembelianLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelSepatu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPaneSepatu.addTab("Pembelian", jPanelPembelian);

        jButtonTambahSepatu.setText("Tambah");
        jButtonTambahSepatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTambahSepatuActionPerformed(evt);
            }
        });

        jButtonUbahSepatu.setText("Ubah");
        jButtonUbahSepatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUbahSepatuActionPerformed(evt);
            }
        });

        jButtonHapusSepatu.setText("Hapus");
        jButtonHapusSepatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusSepatuActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Merk", "Harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanelSepatuLayout = new javax.swing.GroupLayout(jPanelSepatu);
        jPanelSepatu.setLayout(jPanelSepatuLayout);
        jPanelSepatuLayout.setHorizontalGroup(
            jPanelSepatuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSepatuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSepatuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSepatuLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jButtonTambahSepatu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonUbahSepatu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonHapusSepatu)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelSepatuLayout.setVerticalGroup(
            jPanelSepatuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSepatuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSepatuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTambahSepatu)
                    .addComponent(jButtonUbahSepatu)
                    .addComponent(jButtonHapusSepatu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneSepatu.addTab("Sepatu", jPanelSepatu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneSepatu)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneSepatu)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTambahPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTambahPembelianActionPerformed
        // TODO add your handling code here:
        //untuk menyiapkan object pembelian (container)
        //array object sepatu lewat tombol Tambah Sepatu
        String kd = JOptionPane.showInputDialog(this, "Masukkan Kode");
        int jum = Integer.parseInt(JOptionPane.showInputDialog(this, "Berapa Sepatu?"));
        pb = new cPembelian(kd,jum);
        totalbiaya=0; jpb=0;
        jLabelKode.setText("Kode : "+kd);
        jLabelTotalBiaya.setText("Total Biaya: "+totalbiaya);
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_jButtonTambahPembelianActionPerformed

    private void jButtonTambahSepatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTambahSepatuActionPerformed
        // TODO add your handling code here:
        if(jspt<5){
            String m = JOptionPane.showInputDialog(this, "Masukkan Merk");
            double h = Double.parseDouble(JOptionPane.showInputDialog(this, "Masukkan Harga"));
            boolean ada=false;
            for (int i = 0; i < jspt; i++) {
                if(spt[i].getMerk().equalsIgnoreCase(m)){
                    ada=true;
                    break;
                }
            }
            if(ada==true){
                JOptionPane.showMessageDialog(this, "Merk sudah ada");
            }
            else{
                spt[jspt]=new cSepatu(m,h);
                String row[][] = new String[1][2];
                row[0][0] = spt[jspt].getMerk();
                row[0][1] = String.valueOf(spt[jspt].getHarga());
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                model.addRow(row[0]);
                jspt++;
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Kapasitas penuh!");
        }
    }//GEN-LAST:event_jButtonTambahSepatuActionPerformed

    private void jButtonUbahSepatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUbahSepatuActionPerformed
        // TODO add your handling code here:
        //asumsinya yg berubah adalah data harga saja
        boolean ketemu=false;
        int indeks=0;
        String id = JOptionPane.showInputDialog(this, "Masukkan Merk");
        //cek cari dulu ID di array 
        for (int i = 0; i < jspt; i++) {
            indeks=i;
            if(spt[i].getMerk().equalsIgnoreCase(id)){
                ketemu=true;
                break;
            }
        }
        if(ketemu==true){
            String h = JOptionPane.showInputDialog(this, "Masukkan Harga Baru");
            int j = JOptionPane.showConfirmDialog(this, "Yakin diubah?");
            if(j==0){
                spt[indeks].setHarga(Double.parseDouble(h));
                
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                //update sel data pada baris indeks, kolom ke-2 dgn data harga baru
                model.setValueAt(h, indeks, 1);
                JOptionPane.showMessageDialog(this, "Berhasil diperbaharui");
            }
            else{
                JOptionPane.showMessageDialog(this, "Batal update!");
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Merk tidak ada!");
        }
    }//GEN-LAST:event_jButtonUbahSepatuActionPerformed

    private void jButtonHapusSepatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusSepatuActionPerformed
        // TODO add your handling code here:
        //cari dulu di array object sepatu
        boolean ketemu=false;
        int indeks=0;
        String id = JOptionPane.showInputDialog(this, "Masukkan Merk");
        for (int i = 0; i < jspt; i++) {
            indeks=i;
            if(spt[i].getMerk().equalsIgnoreCase(id)){
                ketemu=true;
                break;
            }
        }
        if(ketemu==true){
            int j = JOptionPane.showConfirmDialog(this, "Yakin dihapus?");
            if(j==0){
                for (int i = indeks; i < jspt; i++) {
                    if(i==jspt-1)
                        spt[i] = null;
                    else
                        spt[i] = spt[i+1];
                }
                jspt--;
                //update isi tabel
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                model.removeRow(indeks);
                JOptionPane.showMessageDialog(this, "Berhasil dihapus..");
            }
            else 
                JOptionPane.showMessageDialog(this, "Batal dihapus..");
        }
        else{
            JOptionPane.showMessageDialog(this, "Merk tidak ada");
        }
    }//GEN-LAST:event_jButtonHapusSepatuActionPerformed

    private void jButtonBatalPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBatalPembelianActionPerformed
        // TODO add your handling code here:
        pb=null;
        totalbiaya=0; jpb=0;
        jLabelKode.setText("Kode : ");
        jLabelTotalBiaya.setText("Total Biaya: ");
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        model.removeRow(0);
    }//GEN-LAST:event_jButtonBatalPembelianActionPerformed

    private void jButtonTambahBelanjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTambahBelanjaActionPerformed
        // TODO add your handling code here:
        cSepatu s=null;
        if(jpb<pb.getMS()){
            String m = JOptionPane.showInputDialog(this, "Masukkan Merk");
            boolean ada=false;
            for (int i = 0; i < jspt; i++) {
                if(spt[i].getMerk().equalsIgnoreCase(m)){
                    ada=true;
                    s=spt[i];
                    break;
                }
            }
            if(ada==true){
                pb.addSepatu(s);
                jpb++;
                totalbiaya=totalbiaya+s.getHarga();
                jLabelTotalBiaya.setText("Total Biaya: "+totalbiaya);
                
                String row[][] = new String[1][3];
                row[0][0] = String.valueOf(jpb);
                row[0][1] = s.getMerk();
                row[0][2] = String.valueOf(s.getHarga());
                DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
                model.addRow(row[0]);
                JOptionPane.showMessageDialog(this, "Tambah Sukses");
            }
            else
                JOptionPane.showMessageDialog(this, "Merk Tidak Ada");
        }
        else JOptionPane.showMessageDialog(this, "Kapasitas Penuh");
    }//GEN-LAST:event_jButtonTambahBelanjaActionPerformed

    private void jButtonHapusPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusPembelianActionPerformed
        // TODO add your handling code here:
        if(jpb>0){
            //cari dulu merk di array object sepatu di dlm pembelian
            boolean ketemu=false;
            int indeks=0;
            cSepatu s[] = pb.getSepatu();
            String id = JOptionPane.showInputDialog(this, "Masukkan Merk");
            for (int i = 0; i < pb.getMS(); i++) {
                indeks=i;
                if(s[i].getMerk().equalsIgnoreCase(id)){
                    ketemu=true;
                    break;
                }
            }
            if(ketemu==true){
                int j = JOptionPane.showConfirmDialog(this, "Yakin dihapus?");
                if(j==0){
                    totalbiaya=totalbiaya-s[indeks].getHarga();
                    jLabelTotalBiaya.setText("Total Biaya: "+totalbiaya);
                    pb.delSepatu(id);
                    jpb--;
                    //hapus isi tabel
                    DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
                    model.removeRow(indeks);
                    JOptionPane.showMessageDialog(this, "Berhasil dihapus..");
                }
                else JOptionPane.showMessageDialog(this, "Batal dihapus!");
            }
            else{
                JOptionPane.showMessageDialog(this, "Merk Tidak Ada");
            }
        }
        else JOptionPane.showMessageDialog(this, "Kosong!");
    }//GEN-LAST:event_jButtonHapusPembelianActionPerformed

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
            java.util.logging.Logger.getLogger(appTokoSepatuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(appTokoSepatuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(appTokoSepatuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(appTokoSepatuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new appTokoSepatuJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBatalPembelian;
    private javax.swing.JButton jButtonHapusPembelian;
    private javax.swing.JButton jButtonHapusSepatu;
    private javax.swing.JButton jButtonTambahBelanja;
    private javax.swing.JButton jButtonTambahPembelian;
    private javax.swing.JButton jButtonTambahSepatu;
    private javax.swing.JButton jButtonUbahSepatu;
    private javax.swing.JLabel jLabelKode;
    private javax.swing.JLabel jLabelTotalBiaya;
    private javax.swing.JPanel jPanelPembelian;
    private javax.swing.JPanel jPanelSepatu;
    private javax.swing.JPanel jPanelSepatu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPaneSepatu;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
