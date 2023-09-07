public class Mostrar {
    public static int menu(){
        System.out.println("\t\tCalculadora de Matrices\n1.Matrices\n2.Operaciones\n3.Salir");
        return Lectura.entradaint();
    }
    public static int menu1(){
        System.out.println("\t\tMatrices\n1.Matriz A\n2.Matriz B\n3.Escalar\n4.Volver");
        return Lectura.entradaint();
    }
    public static int menu2(){
        System.out.println("\t\tOperaciones de Matrices\n1.Suma de Matrices\n2.Producto de Matrices\n3.Matriz por escalar C\n4.Matriz transpuesta\n5.Volver");
        return Lectura.entradaint();
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
