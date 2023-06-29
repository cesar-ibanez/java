// Matriz con diagonales
import java.util.Scanner;
public class Matriz01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //Se crea un objeto Scanner
        int matriz [][] = new int [20][20];
        int n;

        System.out.print("Introduzca N: ");
        n = sc.nextInt(); //leer un entero
        sc.close(); //cierra objeto
        generaMatriz(matriz, n);
        imprimeMatriz(matriz,n);
    }
    
    // ***Genera Matriz ***
    static void generaMatriz(int matriz[][],int n){
        int cont=1;
        int fil,col,diag,lim;

        for(diag=0; diag<n*2-1; diag++){
            
            if(diag<n){

                col=0;
                for(fil=diag; fil>=0; fil--){
                    matriz[fil][col]=cont;
                    cont++;
                    col++;
                }
            }else{
                lim = diag-n+1;
                col=lim;
                for(fil=n-1; fil>=lim; fil--){
                    matriz[fil][col]=cont;
                    cont++;
                    col++;
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
