// Matriz con diagonales ROMBOS
import java.util.Scanner;

public class Matriz19_01 {
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
        int fil,col,rom;

        for(rom=0; rom<=n-1; rom++){
            if(rom<n/2){

                //lado 1
                col=0;
                for(fil=rom; fil>=0; fil--){
                    matriz[fil][col]=cont;
                    cont++;
                    col++;
                }
                //lado 2
                col=n-1-rom;
                for(fil=0; fil<=rom; fil++){
                    matriz[fil][col]=cont;
                    cont++;
                    col++;
                }
                //lado 3
                col=n-1;
                for(fil=n-1-rom; fil<n; fil++){
                    matriz[fil][col]=cont;
                    cont++;
                    col--;
                }
                //lado 4
                col=rom;
                for(fil=n-1; fil>=n-1-rom; fil--){
                    matriz[fil][col]=cont;
                    cont++;
                    col--;
                }
            }else if (n%2==0){
                //lado1
                col=rom-(n/2)+1;
                for(fil=n/2-1; fil>=rom-(n/2)+1; fil--){
                    matriz[fil][col]=cont;
                    cont++;
                    col++;
                }
                //lado2
                col=n/2;
                for(fil=rom-(n/2)+1; fil<n/2; fil++){
                    matriz[fil][col]=cont;
                    cont++;
                    col++;
                }
                //lado3
                
                col=(n-2)-(rom-n/2);
                for(fil=n/2; fil<=(n-2)-(rom-n/2); fil++){
                    matriz[fil][col]=cont;
                    cont++;
                    col--;
                }
                
                //lado4
                
                col=n/2-1;
                for(fil=(n-2)-(rom-n/2); fil>=n/2; fil--){
                    matriz[fil][col]=cont;
                    cont++;
                    col--;
                }
                
            } else {
                //lado uno
                col=rom-(n/2);
                for(fil=n/2; fil>=rom-(n/2); fil--){
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
