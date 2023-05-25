/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import registroestudiante.ArbolEstudiantes;
import registroestudiante.Estudiante;


/**
 *
 * @author 57319
 */
public class Registro extends javax.swing.JFrame {

    private DefaultTableModel modelo;
    int contador=0;
    
    public Registro() {
        initComponents();
        cargarInterfaz();
        quemarDatos();
     
    }

     public void cargarInterfaz(){
       String datos[][]={};
       String columna[]={"Nombre","Apellido","Codigo","Cedula","Semestre","Carrera","Promedio"};
       modelo=new DefaultTableModel(datos, columna);
       jTableRegistro.setModel(modelo);
   }
    public void quemarDatos(){
    ArbolEstudiantes arbol = new ArbolEstudiantes();
    // Insertar estudiantes
    Estudiante estudiante1 = new Estudiante("Juan", "Perez", 50, 123456789, 3, "Ingeniería", 4.5);
    Estudiante estudiante2 = new Estudiante("Maria", "Lopez", 25, 987654321, 2, "Arquitectura", 3.8);
    Estudiante estudiante3 = new Estudiante("Pedro", "Gomez", 75, 456789123, 4, "Medicina", 4.2);
    arbol.insertarEstudiante(estudiante1);
    arbol.insertarEstudiante(estudiante2);
    arbol.insertarEstudiante(estudiante3);
    //
   
// Obtener los estudiantes del árbol
    

// Agregar las filas al modelo de tabla
//    for (Estudiante estudiante : estudiantes) {
//    Object[] fila = {
//        estudiante.getNombres(),
//        estudiante.getApellidos(),
//        estudiante.getCodigo(),
//        estudiante.getCedula(),
//        estudiante.getSemestre(),
//        estudiante.getCarrera(),
//        estudiante.getPromedio()
//       
//    };
//    modelo.addRow(fila);
//}

// Object[]datos=new Object[modelo.getColumnCount()];

//          
//        }
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRegistro = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPnlRegistro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTxtFdNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTxtFldApellido = new javax.swing.JTextField();
        jTxtFldCodigo = new javax.swing.JTextField();
        jTxtFldCedula = new javax.swing.JTextField();
        jTxtFldSemestre = new javax.swing.JTextField();
        jTxtFldCarrera = new javax.swing.JTextField();
        jTxtFldPromedio = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jTableRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableRegistro);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GESTION DE ESTUDIANTES");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Lista en PreOrden");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("jButton4");

        jButton5.setText("Salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Registro");

        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre");

        jTxtFdNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFdNombreActionPerformed(evt);
            }
        });

        jLabel4.setText("Apellido");

        jLabel5.setText("codigo");

        jLabel6.setText("cedula");

        jLabel7.setText("semestre");

        jLabel8.setText("carrera");

        jLabel9.setText("Promedio");

        jTxtFldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFldCodigoActionPerformed(evt);
            }
        });

        jTxtFldCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFldCedulaActionPerformed(evt);
            }
        });

        jTxtFldPromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFldPromedioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnlRegistroLayout = new javax.swing.GroupLayout(jPnlRegistro);
        jPnlRegistro.setLayout(jPnlRegistroLayout);
        jPnlRegistroLayout.setHorizontalGroup(
            jPnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlRegistroLayout.createSequentialGroup()
                .addGroup(jPnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnlRegistroLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(33, 33, 33)
                        .addGroup(jPnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTxtFldApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                .addComponent(jTxtFdNombre)
                                .addComponent(jTxtFldCodigo)
                                .addComponent(jTxtFldCedula)
                                .addComponent(jTxtFldSemestre)
                                .addComponent(jTxtFldCarrera)
                                .addComponent(jTxtFldPromedio))))
                    .addGroup(jPnlRegistroLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jButton2)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPnlRegistroLayout.setVerticalGroup(
            jPnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlRegistroLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtFdNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTxtFldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTxtFldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTxtFldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTxtFldSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTxtFldCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTxtFldPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(29, 29, 29))
        );

        jTextField7.setText("codigo: ");

        jButton6.setText("jButton6");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3)
                            .addComponent(jButton1))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 73, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155)))
                .addComponent(jPnlRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(370, 370, 370))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPnlRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(54, 54, 54))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4)
                            .addComponent(jButton6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addComponent(jButton5)
                        .addGap(19, 19, 19))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       ArbolEstudiantes arbol = new ArbolEstudiantes();
        int codigo=Integer.parseInt(JOptionPane.showInputDialog("Cual es el codigo del estudiante a buscar "));
        // Buscar estudiantes
        Estudiante estudianteEncontrado = arbol.buscarEstudiante(codigo);
        if (estudianteEncontrado != null) {
            System.out.println("Estudiante encontrado: " + estudianteEncontrado.getNombres());
        } else {
            
            
            System.out.println("Estudiante no encontrado");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
       ArbolEstudiantes arbol = new ArbolEstudiantes();
       String
       nombre=jTxtFdNombre.getText();
       String apellido=jTxtFldApellido.getText();
       int codigo=Integer.parseInt(jTxtFldCodigo.getText());
       int cedula=Integer.parseInt(jTxtFldCedula.getText());
       int semestre=Integer.parseInt(jTxtFldSemestre.getText());
       String carrera=jTxtFldApellido.getText();
       double promedio=Double.parseDouble(jTxtFldPromedio.getText());
       Estudiante estudiante=new Estudiante(nombre, apellido, codigo, cedula, semestre, carrera, promedio);
       // agrego los estudiantes al arbol
        arbol.insertarEstudiante(estudiante);
      
        //lleno la tabla
        modelo.addRow(new Object[]{
        jTxtFdNombre.getText(),jTxtFldApellido.getText(),jTxtFldCodigo.getText(),jTxtFldCedula.getText()
        ,jTxtFldSemestre.getText(),jTxtFldCarrera.getText(),jTxtFldPromedio.getText()});
        
       //elimino la info que queda en el jtext
       jTxtFdNombre.setText("");
       jTxtFldApellido.setText("");
       jTxtFldCodigo.setText("");
       jTxtFldCedula.setText("");
       jTxtFldSemestre.setText("");
       jTxtFldCarrera.setText("");
       jTxtFldPromedio.setText("");
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTxtFdNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFdNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFdNombreActionPerformed

    private void jTxtFldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFldCodigoActionPerformed

    private void jTxtFldCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFldCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFldCedulaActionPerformed

    private void jTxtFldPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFldPromedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFldPromedioActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
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
    private javax.swing.JPanel jPnlRegistro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRegistro;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTxtFdNombre;
    private javax.swing.JTextField jTxtFldApellido;
    private javax.swing.JTextField jTxtFldCarrera;
    private javax.swing.JTextField jTxtFldCedula;
    private javax.swing.JTextField jTxtFldCodigo;
    private javax.swing.JTextField jTxtFldPromedio;
    private javax.swing.JTextField jTxtFldSemestre;
    // End of variables declaration//GEN-END:variables
}
