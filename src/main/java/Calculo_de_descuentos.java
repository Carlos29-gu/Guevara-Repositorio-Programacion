/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GUEVARA VERA
 */
public class Calculo_de_descuentos {
      
  // Este método calcula el descuento, recibe un monto total y un porcentaje del descuento que queremos aplicar
    public static double calcularDescuento(double montoTotal, double porcentajeDescuento) {
        // Aquí calculamos cuánto vale el descuento multiplicando el monto por el porcentaje y dividiéndolo entre 100 para sacr el valor del porcentaje
        double descuento = montoTotal * (porcentajeDescuento / 100);
        // Luego devolvemos ese valor para quien haya llamado a este método use
        return descuento;
    }

    // Este método es un poco parecido al anterior, pero recibe el monto total a pagar
    // Usamos sobrecarga para que si no me das el porcentaje, asuma que quieres un 10% de descuento
    public static double calcularDescuento(double montoTotal) {
        //  Llamamos al método, pero siempre con  el 10% como porcentaje
        return calcularDescuento(montoTotal, 10);
    }

    public static void main(String[] args) {
        // Aquí declaro dos montos de ejemplo para probar el programa
        double monto1 = 300;
        double monto2 = 450;

        // Llamamos al método que solo recibe montoTotal que aplica un descuento del 10%
        double descuento1 = calcularDescuento(monto1);
        // Mostramos en consola el resultado
        System.out.println("Para un monto de " + monto1 + ", se aplica un descuento del 10%.");
        System.out.println("Descuento aplicado: " + descuento1);
        System.out.println("Monto final a pagar: " + (monto1 - descuento1));
        System.out.println(); // Línea en blanco para separar resultados y quede más ordenado

        // Ahora llamamos al método con monto total y porcentaje de 15%
        double descuento2 = calcularDescuento(monto2, 15);
        // Mostramos en consola algo parecido al anterior explicando qué porcentaje usamos
        System.out.println("Para un monto de " + monto2 + ", se aplica un descuento del 15%.");
        System.out.println("Descuento aplicado: " + descuento2);
        System.out.println("Monto final a pagar: " + (monto2 - descuento2));
    }
}