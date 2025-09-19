/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repositorioprogramacion;

/**
 *
 * @author GUEVARA VERA
 */
public class BusquedaArreglo {
    //Programa 1: Búsqueda en Arreglo Multidimensional
  public static void main(String[] args) {
        int[][] matriz = {
            {5, 12, 7},
            {9, 3, 6},
            {4, 8, 10}
        };

        int valorBuscado = 6;
        int[] posicion = buscarValor(matriz, valorBuscado);

        if (posicion[0] == -1) {
            System.out.println("Valor " + valorBuscado + " no encontrado en la matriz.");
        } else {
            System.out.println("Valor " + valorBuscado + " encontrado en la posición: [" 
                + posicion[0] + ", " + posicion[1] + "]");
        }
    }

    public static int[] buscarValor(int[][] matriz, int valor) {
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                if (matriz[x][y] == valor) {
                    return new int[] {x, y};
                }
            }
        }
        return new int[] {-1, -1};
    }
}



