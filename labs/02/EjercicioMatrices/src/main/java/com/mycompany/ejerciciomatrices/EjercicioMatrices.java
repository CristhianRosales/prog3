package com.mycompany.ejerciciomatrices;
import java.util.Scanner;

public class EjercicioMatrices {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, j, opcion, opcion1, opcion2, opcionm;
        double[][] matriz1 = null, matriz2 = null, matrizR;
        double escalar;
        do{
            opcion=Menus.menu();
            switch(opcion){
                case 1: do{
                            opcion1=Menus.menu1();
                            switch(opcion1){
                                case 1: System.out.print("\nIngrese la cantidad de filas: ");
                                        i=in.nextInt();
                                        System.out.print("\nIngrese la cantidad de columnas: ");
                                        j=in.nextInt();
                                        matriz1=InterMatriz.matriz(i, j);
                                        break;
                                case 2: System.out.print("\nIngrese la cantidad de filas: ");
                                        i=in.nextInt();
                                        System.out.print("\nIngrese la cantidad de columnas: ");
                                        j=in.nextInt();
                                        matriz2=InterMatriz.matriz(i, j);
                                        break;
                                case 3: System.out.print("\nIngrese el escalar: ");
                                        escalar=in.nextDouble();
                                        break;
                                default:System.out.println("Opcion Invalida.");
                                        break;
                            }
                        }while(opcion1!=4);
                        break;
                case 2: do{
                            opcion2=Menus.menu2();
                            switch(opcion2){
                                case 1: if(matriz1.length==matriz2.length & matriz1[0].length==matriz2[0].length){
                                            matrizR=OperacionesMatriz.sumamatrices(matriz1, matriz2);
                                            InterMatriz.mostrarmatriz(matrizR);
                                }
                                        else
                                            System.out.println("No se pueden sumar matrices de distintas dimensiones.");
                                        break;
                                case 2: System.out.print("\n\t¿Que desea realizar?\n1.MatrizA*MatrizB\n2.MatrizB*MatrizA\n3.MatrizA*MatrizA\n4.MatrizB*MatrizB\n: ");
                                        opcionm=in.nextInt();
                                        switch(opcionm){
                                            case 1: if(matriz1[0].length==matriz2.length)
                                                        InterMatriz.mostrarmatriz(OperacionesMatriz.multiplicarmatrices(matriz1, matriz2));
                                                    else
                                                        System.out.println("No se pueden multiplicar estas matrices en el orden indicado.");
                                                    break;
                                            case 2: if(matriz2[0].length==matriz1.length)
                                                        InterMatriz.mostrarmatriz(OperacionesMatriz.multiplicarmatrices(matriz2, matriz1));
                                                    else
                                                        System.out.println("No se pueden multiplicar estas matrices en el orden indicado.");
                                                    break;
                                            case 3: InterMatriz.mostrarmatriz(OperacionesMatriz.multiplicarmatrices(matriz1, matriz1));
                                                    break;
                                            case 4: InterMatriz.mostrarmatriz(OperacionesMatriz.multiplicarmatrices(matriz2, matriz2));
                                                    break;
                                        }
                                        break;
                                case 3: 
                                        break;
                                case 4: 
                                        break;
                                default:System.out.println("Opcion Invalida.");
                                        break;
                            }
                        }while(opcion2!=5);
                        break;
                default:System.out.println("Opcion Invalida.");
                        break;
            }
        }while(opcion!=3);
    }
}
