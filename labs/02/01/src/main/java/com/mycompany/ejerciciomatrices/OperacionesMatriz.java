package com.mycompany.ejerciciomatrices;

public class OperacionesMatriz {
    public static double[][] sumamatrices(double[][] matriz1, double[][] matriz2){
        double[][] matriz = new double[matriz1.length][matriz1[0].length];
        for(int x=0;x<matriz.length;x++){
            for(int y=0;y<matriz[0].length;y++){
                matriz[x][y]=matriz1[x][y]+matriz2[x][y];
            }
        }
        return matriz;
    }
    public static double[][] multiplicarmatrices(double[][] matriz1, double[][] matriz2){
        double[][] matriz = new double[matriz1.length][matriz2[0].length];
        int i=matriz1[0].length;
        for(int x=0;x<matriz1.length;x++){
            for(int y=0;y<matriz2[0].length;y++){
                for(int z=0;z<i;z++){
                    matriz[x][y]+=matriz1[x][z]*matriz2[z][y];
                }
            }
        }
        return matriz;
    }
    public static double[][] matrizporescalar(double[][] matriz1, double escalar){
        double[][] matriz = new double[matriz1.length][matriz1[0].length];
        for(int x=0;x<matriz.length;x++){
            for(int y=0;y<matriz[0].length;y++){
                matriz[x][y]=matriz1[x][y]*escalar;
            }
        }
        return matriz;
    }
    public static double[][] matriztranspuesta(double[][] matriz1){
        double[][] matriz = new double[matriz1[0].length][matriz1.length];
        for(int x=0;x<matriz.length;x++){
            for(int y=0;y<matriz[0].length;y++){
                matriz[x][y]=matriz1[y][x];
            }
        }
        return matriz;
    }
}
