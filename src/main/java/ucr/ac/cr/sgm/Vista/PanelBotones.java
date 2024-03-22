/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ucr.ac.cr.sgm.Vista;

import java.awt.event.ActionListener;

/**
 *
 * @author daryl
 */
public class PanelBotones extends javax.swing.JPanel {

    /**
     * Creates new form PanelBotones
     */
    public PanelBotones() {
        initComponents();
    }
    
    public void escucharBotones(ActionListener manejador){
        this.btnAgregar.addActionListener(manejador);
        this.btnEditar.addActionListener(manejador);
        this.btnEliminar.addActionListener(manejador);
        this.btnReporte.addActionListener(manejador);
        this.btnSalir.addActionListener(manejador);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Agregar.png"))); // NOI18N
        btnAgregar.setActionCommand("Agregar");
        add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 24, -1, -1));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Editar.png"))); // NOI18N
        btnEditar.setActionCommand("Editar");
        add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 24, -1, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Borrar.png"))); // NOI18N
        btnEliminar.setActionCommand("Eliminar");
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 24, -1, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Casa.png"))); // NOI18N
        btnSalir.setActionCommand("Salir");
        add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        btnReporte.setText("Reporte");
        add(btnReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, 50));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnSalir;
    // End of variables declaration//GEN-END:variables
}
