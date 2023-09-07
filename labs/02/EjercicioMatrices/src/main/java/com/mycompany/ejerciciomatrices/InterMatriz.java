package com.mycompany.ejerciciomatrices;

import java.util.Scanner;

public class InterMatriz {
    
    public static double[][] matriz(int i, int j){
        Scanner in = new Scanner(System.in);
        double[][] matriz = new double[i][j];
        for(int x=0;x<i;x++){
            for(int y=0;y<j;y++){
                System.out.print("\nValor de la posicion a"+(x+1)+(y+1)+" : ");
                matriz[x][y]=in.nextDouble();
            }
        }
        return matriz;
    }
    public static void mostrarmatriz(double[][] matriz){
        for(int x=0;x<matriz.length;x++){
            for(int y=0;y<matriz[0].length;y++){
                System.out.print("\t"+matriz[x][y]);
            }
            System.out.println("\n");
        }
    }
}
