/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.VContado;
import Vista.VCredito;
import Vista.VIngreso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Usuario
 */
public class VentaControlador {
    private VIngreso vIngreso;
    private VCredito vCredito;
    private VContado vContado;
    private boolean creditoAbierto = false;
    private boolean contadoAbierto = false;

    public VentaControlador(VIngreso vIngreso, VCredito vCredito, VContado vContado) {
        this.vIngreso = vIngreso;
        this.vCredito = vCredito;
        this.vContado = vContado;

        // Asignar listeners a los botones
        this.vIngreso.getBtnCredito().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirVentanaCredito();
            }
        });

        this.vIngreso.getBtnContado().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirVentanaContado();
            }
        });
    }

    private void abrirVentanaCredito() {
        if (!creditoAbierto && !contadoAbierto) {
            creditoAbierto = true;
            vCredito.setVisible(true);
            vCredito.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                    creditoAbierto = false;  // Habilitar el botón cuando se cierre la ventana
                }
            });
        }
    }

    private void abrirVentanaContado() {
        if (!creditoAbierto && !contadoAbierto) {
            contadoAbierto = true;
            vContado.setVisible(true);
            vContado.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                    contadoAbierto = false;  // Habilitar el botón cuando se cierre la ventana
                }
            });
        }
    }
}