import java.util.Scanner;

public class Camp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] arrNum = new int[N];
    
    for(int i =0; i < arrNum.length;i++){
        arrNum[i] = input.nextInt();
    }
    int menorNum = 100000000,posicao = 0;
    for(int i = 0; i < arrNum.length; i++){
        if(arrNum[i] <= menorNum && arrNum[i] >= 1 ){
            menorNum = arrNum[i];
            posicao = i;
        }
    }
    System.out.println("Menor valor: "+ menorNum);
    System.out.println("Posicao: "+ posicao);

        input.close();
    }
}
