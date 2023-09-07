public class EjercicioMatrices {
    public static void main(String[] args) {
        int i, j, opcion, opcion1, opcion2, opcionm, opcione, opciont;
        double[][] matriz1 = null, matriz2 = null;
        double escalar = 0;
        do{
            opcion=Mostrar.menu();
            switch(opcion){
                case 1: do{
                            opcion1=Mostrar.menu1();
                            switch(opcion1){
                                case 1: System.out.print("\nIngrese la cantidad de filas: ");
                                        i=Lectura.entradaint();
                                        System.out.print("\nIngrese la cantidad de columnas: ");
                                        j=Lectura.entradaint();
                                        matriz1=Lectura.matriz(i, j);
                                        break;
                                case 2: System.out.print("\nIngrese la cantidad de filas: ");
                                        i=Lectura.entradaint();
                                        System.out.print("\nIngrese la cantidad de columnas: ");
                                        j=Lectura.entradaint();
                                        matriz2=Lectura.matriz(i, j);
                                        break;
                                case 3: System.out.print("\nIngrese el escalar: ");
                                        escalar=Lectura.entradadouble();
                                        break;
                                default:System.out.println("Opcion Invalida.");
                                        break;
                            }
                        }while(opcion1!=4);
                        break;
                case 2: do{
                            opcion2=Mostrar.menu2();
                            switch(opcion2){
                                case 1: if(matriz1.length==matriz2.length & matriz1[0].length==matriz2[0].length){
                                            Mostrar.mostrarmatriz(OperacionesMatriz.sumamatrices(matriz1, matriz2));
                                }
                                        else
                                            System.out.println("No se pueden sumar matrices de distintas dimensiones.");
                                        break;
                                case 2: System.out.print("\n\t¿Que desea realizar?\n1.MatrizA*MatrizB\n2.MatrizB*MatrizA\n3.MatrizA*MatrizA\n4.MatrizB*MatrizB\n: ");
                                        opcionm=Lectura.entradaint();
                                        switch(opcionm){
                                            case 1: if(matriz1[0].length==matriz2.length)
                                                        Mostrar.mostrarmatriz(OperacionesMatriz.multiplicarmatrices(matriz1, matriz2));
                                                    else
                                                        System.out.println("No se pueden multiplicar estas matrices en el orden indicado.");
                                                    break;
                                            case 2: if(matriz2[0].length==matriz1.length)
                                                        Mostrar.mostrarmatriz(OperacionesMatriz.multiplicarmatrices(matriz2, matriz1));
                                                    else
                                                        System.out.println("No se pueden multiplicar estas matrices en el orden indicado.");
                                                    break;
                                            case 3: if(matriz1[0].length==matriz1.length)
                                                        Mostrar.mostrarmatriz(OperacionesMatriz.multiplicarmatrices(matriz1, matriz1));
                                                    else
                                                        System.out.println("No se pueden multiplicar estas matrices en el orden indicado.");
                                                    break;
                                            case 4: if(matriz2[0].length==matriz2.length)
                                                        Mostrar.mostrarmatriz(OperacionesMatriz.multiplicarmatrices(matriz2, matriz2));
                                                    else
                                                        System.out.println("No se pueden multiplicar estas matrices en el orden indicado.");
                                                    break;
                                        }
                                        break;
                                case 3: System.out.print("\n\t¿Que desea realizar?\n1.MatrizA*Escalar\n2.MatrizB*Escalar\n: ");
                                        opcione=Lectura.entradaint();
                                        switch(opcione){
                                            case 1: Mostrar.mostrarmatriz(OperacionesMatriz.matrizporescalar(matriz1, escalar));
                                                    break;
                                            case 2: Mostrar.mostrarmatriz(OperacionesMatriz.matrizporescalar(matriz2, escalar));
                                                    break;
                                        }
                                        break;
                                case 4: System.out.print("\n\t¿Que desea realizar?\n1.MatrizA Transpuesta\n2.MatrizB Transpuesta\n: ");
                                        opciont=Lectura.entradaint();
                                        switch(opciont){
                                            case 1: Mostrar.mostrarmatriz(OperacionesMatriz.matriztranspuesta(matriz1));
                                                    break;
                                            case 2: Mostrar.mostrarmatriz(OperacionesMatriz.matriztranspuesta(matriz2));
                                                    break;
                                        }
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
