package com.mycompany.ejerciciomatrices;

import java.util.Scanner;

public class Menus {
    public static int menu(){
        Scanner in = new Scanner(System.in);
        System.out.println("\t\tCalculadora de Matrices\n1.Matrices\n2.Operaciones\n3.Salir");
        return in.nextInt();
    }
    public static int menu1(){
        Scanner in = new Scanner(System.in);
        System.out.println("\t\tMatrices\n1.Matriz A\n2.Matriz B\n3.Escalar\n4.Volver");
        return in.nextInt();
    }
    public static int menu2(){
        Scanner in = new Scanner(System.in);
        System.out.println("\t\tOperaciones de Matrices\n1.Suma de Matrices\n2.Producto de Matrices\n3.Matriz por escalar C\n4.Matriz transpuesta\n5.Volver");
        return in.nextInt();
    }
}
