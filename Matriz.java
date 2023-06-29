import java.util.Scanner;  //import de la clase Scanner
public class Matriz {

	public static void main(String[] args) {  
		 
        Scanner sc = new Scanner(System.in);  //Se crea un objeto Scanner
        int matriz [][] = new int [20][20];
        int i,j,n,c,u;

        System.out.print("Introduzca N: ");
        n = sc.nextInt(); //leer un entero
        sc.close(); //cierra objeto
        System.out.println();
        //generar matriz
        c=1;
        u=n/2;
        System.out.println("U: "+u);
        //k=1;
        for(j=0;j<n;j++) {
        	matriz[j][0]=c;
        	c++;
        }
        for(i=1;i<n;i++){
          matriz[n-1][i]=c;
          c++;
        }
        for(j=n-1-1;j>=0;j--){
          matriz[j][n-1]=c;
          c++;
        }
        //--------------------
        for(j=0;j<n-1;j++) {
        	matriz[j][1]=c;
        	c++;
        }
        for(i=2;i<n-1;i++){
          matriz[n-2][i]=c;
          c++;
        }
        for(j=n-1-2;j>=0;j--){
          matriz[j][n-2]=c;
          c++;
        }
        //------------------
        for(j=0;j<n-2;j++) {
        	matriz[j][2]=c;
        	c++;
        }
        /*for(i=3;i<n-2;i++){
          matriz[n-3][i]=c;
          c++;
        }
        for(j=n-1-3;j>=0;j--){
          matriz[j][n-3]=c;
          c++;
        }*/

        //mostrar matriz
        for(j=0;j<n;j++) {
        	for(i=0;i<n;i++) {
        		System.out.printf("%3s",matriz[j][i]);
                
        	}
        	System.out.println();
        }
   }

   static void imprimeMatriz(){

    System.out.println("impresion de matriz");
   }

}
