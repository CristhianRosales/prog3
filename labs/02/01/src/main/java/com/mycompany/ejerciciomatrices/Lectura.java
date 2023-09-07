package com.mycompany.ejerciciomatrices;

import java.util.Scanner;

public class Lectura {
    public static double[][] matriz(int i, int j){
        double[][] matriz = new double[i][j];
        for(int x=0;x<i;x++){
            for(int y=0;y<j;y++){
                System.out.print("\nValor de la posicion a"+(x+1)+(y+1)+" : ");
                matriz[x][y]=entradadouble();
            }
        }
        return matriz;
    }
    public static int entradaint(){
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    public static double entradadouble(){
        Scanner in = new Scanner(System.in);
        return in.nextDouble();
    }
}
