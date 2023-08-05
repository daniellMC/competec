import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);        

        int tamanho = input.nextInt(); 
        
        String listPokemons[] = new String[tamanho];
        input.nextLine();          
          
        for(int i = 0; i < listPokemons.length;i++){
            listPokemons[i] = input.nextLine();            
        }
        //String ordenado[] = new String[tamanho];
         
        
        //Desafio 2 
        /* 
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        input.nextLine(); 

        String[] cadeias = new String[N];
        for (int i = 0; i < N; i++) {
            cadeias[i] = input.nextLine();
        }

        String valorGenetico = input.nextLine();
        int count = 0;

        for (String cadeia : cadeias) {
            if (cadeia.equals(valorGenetico)) {
                count++;
            }
        }

        if (count > 1) {
            System.out.println("Achei o danado");
        } else if (count == 1) {
            System.out.println("Ainda não é o suficiente");
        } else {
            System.out.println("Sumiuu!");
        }*/

        input.close();
    }
}
