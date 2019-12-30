package Negocio;

import java.util.Random;
import javax.swing.table.DefaultTableModel;

public class LogicaDelProyecto {

  private int cantidadDeSimulaciones;
  private int[] tiemposEnElServidor;
  private int[] diferenciasDeHoras;
  private int[] minutos;
  private int c;

  public LogicaDelProyecto() {
  }

  public void setCantidadDeSimulaciones(int nuevaCantidad) {
    cantidadDeSimulaciones = nuevaCantidad;
    tiemposEnElServidor = new int[nuevaCantidad];
    minutos = new int[nuevaCantidad];
    diferenciasDeHoras = new int[nuevaCantidad - 1];
    c = 0;
  }

  public void setHorarios(int hE, int mE, int hI, int mI, int hS, int mS) {
    tiemposEnElServidor[c] = (hS - hI) * 60 + (mS - mI);
    minutos[c] = mE;
    if (c > 0) {
      int diferenciaDeHora;
      if (minutos[c - 1] > minutos[c]) {
        diferenciaDeHora = 60 - minutos[c - 1] + minutos[c];
      } else {
        diferenciaDeHora = minutos[c] - minutos[c - 1];
      }
      diferenciasDeHoras[c - 1] = diferenciaDeHora;
    }
    c++;
  }

  public int getcantidadDeSimulaciones() {
    return cantidadDeSimulaciones;
  }

  public DefaultTableModel getModeloCalculosLlegada() {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("Min.");
    modelo.addColumn("p (x)");
    modelo.addColumn("P (ACUM)");
    modelo.addColumn("Intervalo");
    float acum = 0;
    int ant = 1;
    for (int i = 0; i <= cantidadMaximaDeDiferencias(); i++) {
      String[] datos = new String[5];
      datos[0] = Integer.toString(i);
      datos[1] = Float.toString(probXLlegada(i));
      acum += probXLlegada(i);
      datos[2] = Float.toString(acum);
      datos[3] = Integer.toString(ant) + "-" + Integer.toString((int) ((acum * 100) % 100));
      ant = (int) ((acum * 100) + 1);
      modelo.addRow(datos);
    }
    return modelo;
  }

  private int cantidadMaximaDeDiferencias() {
    int max = 0;
    for (int i = 0; i < diferenciasDeHoras.length; i++) {
      if (diferenciasDeHoras[i] > max) {
        max = diferenciasDeHoras[i];
      }
    }
    return max;
  }

  private float probXLlegada(int k) {
    float ca = 0;
    for (int i = 0; i < diferenciasDeHoras.length; i++) {
      if (diferenciasDeHoras[i] == k) {
        ca++;
      }
    }
    return (float) ca / diferenciasDeHoras.length;
  }

  public DefaultTableModel getModeloCalculosAtencion() {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("Min.");
    modelo.addColumn("p (x)");
    modelo.addColumn("P (ACUM)");
    modelo.addColumn("Intervalo");
    float acum = 0;
    int ant = 1;
    for (int i = 0; i <= cantidadMaximaDeTiempoEnElServidor(); i++) {
      String[] datos = new String[5];
      datos[0] = Integer.toString(i);
      datos[1] = Float.toString(probXAtencion(i));
      acum += probXAtencion(i);
      datos[2] = Float.toString(acum);
      datos[3] = Integer.toString(ant) + "-" + Integer.toString((int) ((acum * 100) % 100));
      ant = (int) ((acum * 100) + 1);
      modelo.addRow(datos);
    }
    return modelo;
  }

  private int cantidadMaximaDeTiempoEnElServidor() {
    int max = 0;
    for (int i = 0; i < tiemposEnElServidor.length; i++) {
      if (tiemposEnElServidor[i] > max) {
        max = tiemposEnElServidor[i];
      }
    }
    return max;
  }

  private float probXAtencion(int k) {
    float ca = 0;
    for (int i = 0; i < tiemposEnElServidor.length; i++) {
      if (tiemposEnElServidor[i] == k) {
        ca++;
      }
    }
    return (float) ca / tiemposEnElServidor.length;
  }

  public DefaultTableModel getModeloSimulacion(int cantidadSimulacion,
          DefaultTableModel modeloLlegada, DefaultTableModel modeloAtencion) {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("Nro.");
    modelo.addColumn("Nro. Aleatorio");
    modelo.addColumn("Hora Llegada");
    modelo.addColumn("Nro. Aleatorio");
    modelo.addColumn("Tiempo Servidor");
    float acum = 0;
    int ant = 1;
    for (int i = 1; i <= cantidadSimulacion; i++) {
      String[] datos = new String[6];
      datos[0] = Integer.toString(i);
      int n1 = randomico();
      datos[1] = Integer.toString(n1);
      datos[2] = Integer.toString(nro(n1, modeloLlegada));
      int n2 = randomico();
      datos[3]= Integer.toString(n2);
      datos[4]=Integer.toString(nro(n2, modeloAtencion));
      modelo.addRow(datos);
    }
    return modelo;
  }

  private int randomico() {
    Random r = new Random();
    return r.nextInt(100);
  }

  private int nro(int n, DefaultTableModel modelo) {
    for (int i = 0; i < modelo.getRowCount(); i++) {
      String ele = modelo.getValueAt(i, 3).toString();
      String[] elementos = ele.split("-");
      int a = Integer.parseInt(elementos[0]);
      int b = Integer.parseInt(elementos[1]);
      if (b == 0 && a != 1) {
        b = 100;
      }
      if (n >= a && n <= b) {
        return Integer.parseInt(modelo.getValueAt(i, 0).toString());
      }
    }
    return Integer.parseInt(modelo.getValueAt(modelo.getRowCount()-1, 0).toString());
  }
}
