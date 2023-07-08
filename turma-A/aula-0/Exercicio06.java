import java.util.Scanner;
public class Exercicio06{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    /*  Exercio 01 
        int num[] = new int[10];
        for(int i = 0; i < 5; i++){
            System.out.println("Digite um número");   
            num[i] = input.nextInt();
        }
        int numMenor = num[0];
        int numMaior = num[0];
        for(int j = 0;j < 5; j++){  
            if(numMaior < num[j]){
                numMaior = num[j];
            }  
            if(numMenor > num[j]){
                numMenor = num[j];
            }
        }
        
        System.out.println("Menor número do vetor: " + numMenor);
        System.out.println("Maior número do vetor: "+ numMaior );
        */
        /* Exercio 02
        int[][] tabela = {{4,6},{1,7}};
        int lin = 2;
        int col = 2;
        for(int i = 0; i < lin; i++){
            for(int j = 0; j < col; j++){
                System.out.print(tabela[i][j] + " ");
            }
        }    */
        // Exercio 03
        
        // Exercio 04
        int[][] matrizA = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int[][] matrizB = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int[][] matrizResultado = new int[3][3];
        for(int i = 0;i < 3;i++){
            for(int j = 0; j < 3;j++){
                matrizResultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
          for(int i = 0;i < 3;i++){
            for(int j = 0; j < 3;j++){
                System.out.println(matrizResultado[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}