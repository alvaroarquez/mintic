/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mintic.calculadora;

import javax.swing.JOptionPane;
import java.lang.Math;
import java.text.DecimalFormat;

/**
 *
 * @author alvar
 */
public class Proce_poo {

    double res;
    double valor_1;
    double valor_2;
    DecimalFormat df = new DecimalFormat("#0.00");
    // ACCION DE SUMA//
    public void suma() {
        try {
            valor_1 = Double.parseDouble(JOptionPane.showInputDialog("Valor 1"));
            valor_2 = Double.parseDouble(JOptionPane.showInputDialog("Valor 2"));
            res = valor_1 + valor_2;
            JOptionPane.showMessageDialog(null, "Resultado Suma de: " + " Valor 1: " + valor_1 + " + Valor 2: " + valor_2 + " : " + df.format(res));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Numeros taja no letras ni simbolos");
        }

    }
    // ACCION DE RESTA//
    public void resta() {
        try {
            valor_1 = Double.parseDouble(JOptionPane.showInputDialog("Valor 1"));
            valor_2 = Double.parseDouble(JOptionPane.showInputDialog("Valor 2"));
            res = valor_1 - valor_2;
            JOptionPane.showMessageDialog(null, "Resultado Resta de: " + " Valor 1: " + valor_1 + " - Valor 2: " + valor_2 + " : " + df.format(res));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Numeros taja no letras ni simbolos");
        }

    }
    // ACCION DE MULTIPLICACION//
    public void multiplicacion() {
        try {
            valor_1 = Double.parseDouble(JOptionPane.showInputDialog("Valor 1"));
            valor_2 = Double.parseDouble(JOptionPane.showInputDialog("Valor 2"));
            res = valor_1 * valor_2;
            JOptionPane.showMessageDialog(null, "Resultado Suma de: " + " Valor 1: " + valor_1 + " * Valor 2: " + valor_2 + " : " + df.format(res));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Numeros taja no letras ni simbolos");
        }

    }
    // ACCION DE DIVISION//
    public void division() {
        try {
            valor_1 = Double.parseDouble(JOptionPane.showInputDialog("Valor 1"));
            if (valor_1 != 0) {
                valor_2 = Double.parseDouble(JOptionPane.showInputDialog("Valor 2"));
                if (valor_2 != 0) {
                    res = valor_1 / valor_2;
                    JOptionPane.showMessageDialog(null, "Resultado Division de: " + " Valor 1: " + valor_1 + " / Valor 2: " + valor_2 + " : " + df.format(res));
                } else {
                    JOptionPane.showMessageDialog(null, "Entre 0 no Matematico");

                }

            } else {
                JOptionPane.showMessageDialog(null, "Entre 0 no Matematico");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Numeros taja no letras ni simbolos");

        }
    }
    // ACCION DE POTENCIA//
    public void potencia() {
        try {
            valor_1 = Double.parseDouble(JOptionPane.showInputDialog("Valor 1"));
            valor_2 = Double.parseDouble(JOptionPane.showInputDialog("Valor 2"));
            res = Math.pow(valor_1, valor_2);
            JOptionPane.showMessageDialog(null, valor_1 + "^" + valor_2 + "=" + df.format(res));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Numeros taja no letras ni simbolos");
        }

    }
    // ACCION DE RAIZ//
    public void raiz() {
          try {
                valor_1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor"));
                res = Math.sqrt(valor_1);
                JOptionPane.showMessageDialog(null, "Resultado Raiz Cuadrada de: " + valor_1 + " : " + df.format(res));

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Numeros taja no letras ni simbolos");
                }

    }
}
