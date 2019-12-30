package Presentacion;
/*
FECHA:
    *08 de Julio del 2019

IMPLEMENTADO POR:
    *Rosel Rios Alejandra Gabriela
    *Torrez Aramayo Jorge Rodrigo

MATERIA:
    *Investigación Operativa 2

GESTION:
    *1-2019
*/
import Negocio.LogicaDelProyecto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProyectoForm extends javax.swing.JFrame {

  LogicaDelProyecto analisis;
  int c;
  DefaultTableModel modelo;

  public ProyectoForm() {
    initComponents();
    empezarAInsertarBtn.setEnabled(false);
    insertarIteracionBtn.setEnabled(false);
    ejecutarBtn.setEnabled(false);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jButton3 = new javax.swing.JButton();
    jButton4 = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();
    empezarAInsertarBtn = new javax.swing.JButton();
    ejecutarBtn = new javax.swing.JButton();
    nuevoBtn = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    cantidadDeClientesInput = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    jScrollPane2 = new javax.swing.JScrollPane();
    tablaHorarios = new javax.swing.JTable();
    jLabel3 = new javax.swing.JLabel();
    horaLlegadaInput = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    minutoLlegadaInput = new javax.swing.JTextField();
    horaSalidaInput = new javax.swing.JTextField();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    minutoSalidaInput = new javax.swing.JTextField();
    jLabel8 = new javax.swing.JLabel();
    insertarIteracionBtn = new javax.swing.JButton();
    horaIngresoInput = new javax.swing.JTextField();
    jLabel9 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    minutoIngresoInput = new javax.swing.JTextField();
    jScrollPane3 = new javax.swing.JScrollPane();
    tablaDeCalculosLlegada = new javax.swing.JTable();
    jLabel11 = new javax.swing.JLabel();
    jLabel12 = new javax.swing.JLabel();
    cantidadDeSimulacionesInput = new javax.swing.JTextField();
    jScrollPane4 = new javax.swing.JScrollPane();
    tablaSimulacion = new javax.swing.JTable();
    jScrollPane5 = new javax.swing.JScrollPane();
    tablaDeCalculosAtencion = new javax.swing.JTable();
    jLabel13 = new javax.swing.JLabel();
    jLabel14 = new javax.swing.JLabel();

    jButton3.setText("Ejecutar");

    jButton4.setText("Ejecutar");

    jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
    jScrollPane1.setViewportView(jTable1);

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    empezarAInsertarBtn.setText("Empezar a Insertar");
    empezarAInsertarBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        empezarAInsertarBtnActionPerformed(evt);
      }
    });
    getContentPane().add(empezarAInsertarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 240, 38));

    ejecutarBtn.setText("Ejecutar Simulacion");
    ejecutarBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        ejecutarBtnActionPerformed(evt);
      }
    });
    getContentPane().add(ejecutarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 140, 41));

    nuevoBtn.setText("Nuevo");
    nuevoBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        nuevoBtnActionPerformed(evt);
      }
    });
    getContentPane().add(nuevoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 240, 36));

    jLabel1.setText("Cant. Simulaciones");
    getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));
    getContentPane().add(cantidadDeClientesInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 90, -1));

    jLabel2.setText("TABLA DE SIMULACION");
    getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, 20));

    tablaHorarios.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Nro. Cliente", "Hora Llegada", "Hora Ingreso", "Hora Salida", "Tiempo Servidor"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    tablaHorarios.getTableHeader().setReorderingAllowed(false);
    jScrollPane2.setViewportView(tablaHorarios);
    if (tablaHorarios.getColumnModel().getColumnCount() > 0) {
      tablaHorarios.getColumnModel().getColumn(0).setResizable(false);
      tablaHorarios.getColumnModel().getColumn(1).setResizable(false);
      tablaHorarios.getColumnModel().getColumn(2).setResizable(false);
      tablaHorarios.getColumnModel().getColumn(4).setResizable(false);
    }

    getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 480, 300));

    jLabel3.setText("HORA");
    getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, 23));
    getContentPane().add(horaLlegadaInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 37, -1));

    jLabel4.setText("LLEGADA");
    getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

    jLabel5.setText(":");
    getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));
    getContentPane().add(minutoLlegadaInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 37, -1));
    getContentPane().add(horaSalidaInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 37, -1));

    jLabel6.setText("SALIDA");
    getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

    jLabel7.setText(":");
    getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));
    getContentPane().add(minutoSalidaInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 37, -1));

    jLabel8.setText("MINUTO");
    getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, 23));

    insertarIteracionBtn.setText("Insertar Iteracion N");
    insertarIteracionBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        insertarIteracionBtnActionPerformed(evt);
      }
    });
    getContentPane().add(insertarIteracionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 240, 30));
    getContentPane().add(horaIngresoInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 37, -1));

    jLabel9.setText("INGRESO");
    getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

    jLabel10.setText(":");
    getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));
    getContentPane().add(minutoIngresoInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 37, -1));

    tablaDeCalculosLlegada.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Min.", "p (x)", "P (ACUM)", "Intervalos"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false, false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    tablaDeCalculosLlegada.getTableHeader().setReorderingAllowed(false);
    jScrollPane3.setViewportView(tablaDeCalculosLlegada);
    if (tablaDeCalculosLlegada.getColumnModel().getColumnCount() > 0) {
      tablaDeCalculosLlegada.getColumnModel().getColumn(0).setResizable(false);
      tablaDeCalculosLlegada.getColumnModel().getColumn(1).setResizable(false);
      tablaDeCalculosLlegada.getColumnModel().getColumn(2).setResizable(false);
    }

    getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, 290, 300));

    jLabel11.setText("TABLA DE HORARIOS");
    getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, 20));

    jLabel12.setText("Cantidad de Clientes");
    getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
    getContentPane().add(cantidadDeSimulacionesInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 90, -1));

    tablaSimulacion.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Nro.", "Nro. Aleatorio", "Hora Llegada", "Hora Ingreso", "Tiempo Servidor"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    tablaSimulacion.getTableHeader().setReorderingAllowed(false);
    jScrollPane4.setViewportView(tablaSimulacion);
    if (tablaSimulacion.getColumnModel().getColumnCount() > 0) {
      tablaSimulacion.getColumnModel().getColumn(0).setResizable(false);
      tablaSimulacion.getColumnModel().getColumn(1).setResizable(false);
      tablaSimulacion.getColumnModel().getColumn(2).setResizable(false);
      tablaSimulacion.getColumnModel().getColumn(4).setResizable(false);
    }

    getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 730, 280));

    tablaDeCalculosAtencion.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Min.", "p (x)", "P (ACUM)", "Intervalos"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false, false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    tablaDeCalculosAtencion.getTableHeader().setReorderingAllowed(false);
    jScrollPane5.setViewportView(tablaDeCalculosAtencion);
    if (tablaDeCalculosAtencion.getColumnModel().getColumnCount() > 0) {
      tablaDeCalculosAtencion.getColumnModel().getColumn(0).setResizable(false);
      tablaDeCalculosAtencion.getColumnModel().getColumn(1).setResizable(false);
      tablaDeCalculosAtencion.getColumnModel().getColumn(2).setResizable(false);
    }

    getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 360, 290, 280));

    jLabel13.setText("TABLA DE LLEGADAS");
    getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, -1, 20));

    jLabel14.setText("TABLA DE ATENCION");
    getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 340, -1, 20));

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void empezarAInsertarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empezarAInsertarBtnActionPerformed
    try {
      c = 1;
      int cantidadDeSimulaciones = Integer.parseInt(cantidadDeClientesInput.getText());
      analisis.setCantidadDeSimulaciones(cantidadDeSimulaciones);
      insertarIteracionBtn.setText("Introducir Iteracion " + c);
      insertarIteracionBtn.setEnabled(true);
      empezarAInsertarBtn.setEnabled(false);
      modelo = new DefaultTableModel();
      modelo.addColumn("Nro. Cliente");
      modelo.addColumn("Hora Llegada");
      modelo.addColumn("Hora Ingreso");
      modelo.addColumn("Hora Salida");
      modelo.addColumn("Tiempo Servidor");
    } catch (Exception e) {
      JOptionPane.showMessageDialog(rootPane, "INTRODUCIR CANTIDAD DE CLIENTES");
    }
  }//GEN-LAST:event_empezarAInsertarBtnActionPerformed

  private void nuevoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoBtnActionPerformed
    empezarAInsertarBtn.setEnabled(true);
    analisis = new LogicaDelProyecto();
    modelo = new DefaultTableModel();
    modelo.addColumn("Nro. Cliente");
    modelo.addColumn("Hora Llegada");
    modelo.addColumn("Hora Ingreso");
    modelo.addColumn("Hora Salida");
    modelo.addColumn("Tiempo Servidor");
    tablaHorarios.setModel(modelo);
    modelo = new DefaultTableModel();
    modelo.addColumn("Min.");
    modelo.addColumn("p (x)");
    modelo.addColumn("P (ACUM)");
    modelo.addColumn("Intervalo");
    tablaDeCalculosLlegada.setModel(modelo);
    tablaDeCalculosAtencion.setModel(modelo);
    cantidadDeClientesInput.setText("");
    modelo = new DefaultTableModel();
    modelo.addColumn("Nro.");
    modelo.addColumn("Nro. Aleatorio");
    modelo.addColumn("Hora Llegada");
    modelo.addColumn("Nro. Aleatorio");
    modelo.addColumn("Tiempo Servidor");
    tablaSimulacion.setModel(modelo);
  }//GEN-LAST:event_nuevoBtnActionPerformed

  private void insertarIteracionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarIteracionBtnActionPerformed
    try {
      int horaLlegada = Integer.parseInt(horaLlegadaInput.getText());
      int horaSalida = Integer.parseInt(horaSalidaInput.getText());
      int horaIngreso = Integer.parseInt(horaIngresoInput.getText());
      int minutoLlegada = Integer.parseInt(minutoLlegadaInput.getText());
      int minutoSalida = Integer.parseInt(minutoSalidaInput.getText());
      int minutoIngreso = Integer.parseInt(minutoIngresoInput.getText());
      int tiempoEnElServidor = (horaSalida - horaIngreso) * 60 + (minutoSalida - minutoIngreso);
      minutoLlegadaInput.setText("");
      minutoSalidaInput.setText("");
      minutoIngresoInput.setText("");
      analisis.setHorarios(horaLlegada, minutoLlegada, horaIngreso, minutoIngreso, horaSalida, minutoSalida);
      String[] datos = new String[5];
      datos[0] = Integer.toString(c);
      datos[1] = Integer.toString(horaLlegada) + ":" + Integer.toString(minutoLlegada);
      datos[2] = Integer.toString(horaIngreso) + ":" + Integer.toString(minutoIngreso);
      datos[3] = Integer.toString(horaSalida) + ":" + Integer.toString(minutoSalida);
      datos[4] = Integer.toString(tiempoEnElServidor);
      modelo.addRow(datos);
      tablaHorarios.setModel(modelo);
      tablaDeCalculosLlegada.setModel(analisis.getModeloCalculosLlegada());
      tablaDeCalculosAtencion.setModel(analisis.getModeloCalculosAtencion());
      c++;
      if (c <= analisis.getcantidadDeSimulaciones()) {
        insertarIteracionBtn.setText("Introducir Iteracion " + c);
      } else {
        insertarIteracionBtn.setEnabled(false);
        insertarIteracionBtn.setText("Introducir Iteracion N");
        horaLlegadaInput.setText("");
        horaSalidaInput.setText("");
        horaIngresoInput.setText("");
        ejecutarBtn.setEnabled(true);
      }
    } catch (Exception e) {
      JOptionPane.showMessageDialog(rootPane, "DATOS ERRONEOS");
    }
  }//GEN-LAST:event_insertarIteracionBtnActionPerformed

  private void ejecutarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejecutarBtnActionPerformed
    try {
      int cantidadDeSimulaciones = Integer.parseInt(cantidadDeSimulacionesInput.getText());
      tablaSimulacion.setModel(analisis.getModeloSimulacion(
              cantidadDeSimulaciones,
              (DefaultTableModel)tablaDeCalculosLlegada.getModel(),
              (DefaultTableModel)tablaDeCalculosAtencion.getModel()));
    } catch (Exception e) {
      JOptionPane.showMessageDialog(rootPane, "INTRODUCIR CANTIDAD DE SIMULACIONES");
    }
  }//GEN-LAST:event_ejecutarBtnActionPerformed

  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new ProyectoForm().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextField cantidadDeClientesInput;
  private javax.swing.JTextField cantidadDeSimulacionesInput;
  private javax.swing.JButton ejecutarBtn;
  private javax.swing.JButton empezarAInsertarBtn;
  private javax.swing.JTextField horaIngresoInput;
  private javax.swing.JTextField horaLlegadaInput;
  private javax.swing.JTextField horaSalidaInput;
  private javax.swing.JButton insertarIteracionBtn;
  private javax.swing.JButton jButton3;
  private javax.swing.JButton jButton4;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel13;
  private javax.swing.JLabel jLabel14;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JScrollPane jScrollPane3;
  private javax.swing.JScrollPane jScrollPane4;
  private javax.swing.JScrollPane jScrollPane5;
  private javax.swing.JTable jTable1;
  private javax.swing.JTextField minutoIngresoInput;
  private javax.swing.JTextField minutoLlegadaInput;
  private javax.swing.JTextField minutoSalidaInput;
  private javax.swing.JButton nuevoBtn;
  private javax.swing.JTable tablaDeCalculosAtencion;
  private javax.swing.JTable tablaDeCalculosLlegada;
  private javax.swing.JTable tablaHorarios;
  private javax.swing.JTable tablaSimulacion;
  // End of variables declaration//GEN-END:variables

  private void borrarTodasLasTablas() {

  }
}
