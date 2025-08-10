/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lucesitas;

/**
 *
 * @author Alonso
 */
public class Lucesitas_Navideñas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String colores[] = {"\u001B[31m*", // Rojo, el "*" significa el símbolo colorido que saldrá al ejecutar
                            "\u001B[32m*", // Verde
                            "\u001B[33m*", // Amarillo
                            "\u001B[34m*", // Azul
                            "\u001B[35m*", // Magenta
                            "\u001B[36m*"  // Cyan
        };
        
        while (true) {            
            System.out.println("\u001B[2J");
            System.out.flush();
            
            for (int i = 0; i < 20; i++) {
                int color = (int)(Math.random()*colores.length);
                System.out.print(colores[color] + " ");
            }
            System.out.println("\n\n\u001B[0mFELIZ NAVIDAD");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }
    
}
