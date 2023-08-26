import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);   
        
        System.out.print("Digite o número de Pokémons: ");
        int n = input.nextInt();

        String[] pokemons = new String[n];
        System.out.println("Digite os nomes dos Pokémons:");

        for (int i = 0; i < n; i++) {
            pokemons[i] = input.next();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (pokemons[i].compareToIgnoreCase(pokemons[j]) > 0) {
                    String temp = pokemons[i];
                    pokemons[i] = pokemons[j];
                    pokemons[j] = temp;
                }
            }
        }

        System.out.print("Pokémons organizados: [");
        for (int i = 0; i < n; i++) {
            System.out.print(pokemons[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // System.out.println("Digite a quantidade de pokémons: ");
        // int tamanho = input.nextInt(); 
        
        // String listPokemons[] = new String[tamanho];
        
        // System.out.println("Digite o nome dos pokémons: ");
        // input.nextLine();            
        // for(int i = 0; i < tamanho;i++){
        //     listPokemons[i] = input.nextLine();            
        // }
        // String ordenado[] = new String[tamanho];
        
        // for(int i = 0; i < tamanho -1;i++){
        //     System.out.println("=============================");
        //     for(int j = i+1; j < tamanho; j++){
        //         int res = listPokemons[i].compareToIgnoreCase(listPokemons[j]);
        //         System.out.println("Array J: "+ j + listPokemons[j]);
        //         System.out.println("Array I: "+ i + listPokemons[i]);
        //         if(res < 0){
        //             ordenado[j] = listPokemons[i];
        //             //1
        //             ordenado[i] = listPokemons[j];
        //         }else if(res > 0){
        //             //0
        //             ordenado[i] = listPokemons[j];
        //             //1
        //             ordenado[j] = listPokemons[i];
        //         }
        //         // else{
        //         //     System.out.println("Ana é a primeira");
        //         // }   
        //     }
        // }

        // for(int i = 0; i < tamanho; i++){
        //     System.out.println("Posição"+ i +": "+ordenado[i]);
        // }
        //Desafio 2 
        /*
        Scanner input = new Scanner(System.in);

        int tamanho = input.nextInt();
        input.nextLine(); 

        String[] cadeias = new String[tamanho];

        for (int i = 0; i < tamanho; i++) {
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
