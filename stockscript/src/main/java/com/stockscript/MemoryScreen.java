package com.stockscript;

import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MemoryScreen {

    //
    public static int Ventana(Map<String, Simbolo> memoria){
        JFrame Ventana = new JFrame("Tabla de símbolos");
        Ventana.setSize(800, 400);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ventana.setLocationRelativeTo(null); // Centrar en la pantalla

          // Columnas de la tabla
        String[] columnas = {"Variable", "Tipo de dato", "Valor"};

        // Modelo de la tabla
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        // Recorrer el HashMap y agregar sus datos
        for (Map.Entry<String, Simbolo> entrada : memoria.entrySet()) {

            String nombre = entrada.getKey();
            Simbolo simbolo = entrada.getValue();

            Object[] fila = {
                nombre,
                simbolo.tipo,
                simbolo.valor
            };

            modelo.addRow(fila);
        }

        // Crear JTable con el modelo
        JTable tabla = new JTable(modelo);

        // Panel principal
        JPanel panel = new JPanel();

        // Botón para cerrar
        JButton boton = new JButton("Cerrar ventana");
        boton.addActionListener(e -> Ventana.dispose());

        panel.add(new JScrollPane(tabla));
        panel.add(boton);

        Ventana.add(panel);
        Ventana.setVisible(true);

        return 0;
    }
}
