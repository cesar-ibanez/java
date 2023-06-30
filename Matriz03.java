import java.util.Scanner;
public class Matriz03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz [][] = new int[20][20];
        int n;

        //leer n
        System.out.print("Introduzca N: ");
        n = sc.nextInt(); //leer un entero
        sc.close(); //cierra objeto
        System.out.println();

        //genera matriz
        generaMatriz(matriz, n);
        //muestra matriz
        imprimeMatriz(matriz, n);

        
    }
    // *** Genera Matriz
    static void generaMatriz(int matriz[][], int n){
        int fil, col, cont = 1, lin;

        for(lin = 0; lin<n; lin++){
            fil=lin;
            col=lin;
            if(lin<n/2){
                for(fil=lin ; fil>=0 ; fil--){
                    matriz[fil][col]=cont;
                    col++;
                    cont++;
                }

            } else {
                for(col=fil ; col<n; col++){
                    matriz[fil][col]=cont;
                    fil--;
                    cont++;
                }
            }
        }
    }
    // ***Imprime Matriz ***
    static void imprimeMatriz(int matriz[][],int n){
        int fila,columna;
        System.out.println();
        for(fila=0;fila<n;fila++) {
        	for(columna=0;columna<n;columna++) {
        		System.out.printf("%3s",matriz[fila][columna]);
                
        	}
        	System.out.println();
        }
    }
}
