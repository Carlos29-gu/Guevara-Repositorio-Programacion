/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.repositorioprogramacion;
import java.util.Arrays;
/**
 *
 * @author GUEVARA VERA
 */
public class RepositorioProgramacion {

//Programa 2: Ordenación de Arreglo Multidimensional
public static void main(String[] args) {
        int[][] matriz = {
            {5, 12, 7},
            {9, 3, 6},
            {4, 8, 10}
        };

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        int filaAOrdenar = 1; // ordenamos la fila 1 (segunda fila)
        ordenarFila(matriz, filaAOrdenar);

        System.out.println("Matriz con fila " + filaAOrdenar + " ordenada:");
        imprimirMatriz(matriz);
    }

    public static void ordenarFila(int[][] matriz, int fila) {
        Arrays.sort(matriz[fila]);
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y] + " ");
            }
            System.out.println();
        }
    }
}
