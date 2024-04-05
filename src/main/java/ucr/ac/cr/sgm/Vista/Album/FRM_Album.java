/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ucr.ac.cr.sgm.Vista.Album;

import java.awt.event.MouseListener;
import javax.swing.table.DefaultTableModel;
import ucr.ac.cr.sgm.Modelo.Cancion;

/**
 *
 * @author daryl
 */
public class FRM_Album extends javax.swing.JFrame {

    /**
     * Creates new form FRM_Album
     */
    public FRM_Album() {
        initComponents();
    }
    
    public void setTblCancionesRegistradas(String[][] listaCanciones){
        this.tblCancionesRegistradas.setModel(new DefaultTableModel(listaCanciones, Cancion.Titulos_CANCION));
        this.jScrollPane1.setViewportView(this.tblCancionesRegistradas);
    }
    
    public String[] getRow(){
        String[] listSelect=new String[this.tblCancionesRegistradas.getColumnCount()];
        int selectRow=this.tblCancionesRegistradas.getSelectedRow();
        for(int i=0; i<listSelect.length;i++){
            listSelect[i]=tblCancionesRegistradas.getValueAt(selectRow, i).toString();
        }
        return listSelect;
    }
    
    public void escucharMouse(MouseListener manejador){
        this.tblCancionesRegistradas.addMouseListener(manejador);
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
        jLabel2 = new javax.swing.JLabel();
        txtNombreAlbum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        spLanzamiento = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCancionesRegistradas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCancionesAlbum = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnAgregarAlbum = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Crear Album de Canciones");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 17, -1, -1));

        jLabel2.setText("Nombre del Album:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 54, -1, -1));
        getContentPane().add(txtNombreAlbum, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 51, 160, -1));

        jLabel3.setText("Año Lanzamiento:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 54, -1, -1));

        spLanzamiento.setModel(new javax.swing.SpinnerNumberModel(2024, 1578, 2024, 1));
        getContentPane().add(spLanzamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 51, 112, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Lista de Canciones Registradas");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, -1));

        tblCancionesRegistradas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblCancionesRegistradas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 530, 164));

        tblCancionesAlbum.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblCancionesAlbum);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 530, 180));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Lista de Canciones para el Album");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, -1));

        btnAgregarAlbum.setText("Agregar Album");
        getContentPane().add(btnAgregarAlbum, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, -1, -1));

        btnCerrar.setText("Cerrar");
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 560, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAlbum;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spLanzamiento;
    private javax.swing.JTable tblCancionesAlbum;
    private javax.swing.JTable tblCancionesRegistradas;
    private javax.swing.JTextField txtNombreAlbum;
    // End of variables declaration//GEN-END:variables
}
