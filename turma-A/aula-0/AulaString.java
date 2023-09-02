import java.util.Scanner;

public class AulaString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a frase que deseja encontrar");
        //String busca = input.nextLine(); 

        System.out.println("Digite uma frase");
        String frase = input.nextLine();
        
        String[] fraseSplit = frase.split(" ");
        for(String letra : fraseSplit){
            System.out.println(letra);
        }

        input.close();
        /* 
        System.out.println("Digite uma frase"); 
        String frase = input.nextLine(); 
         
        String text = new StringBuilder(frase).reverse().toString();
        System.out.println(text); */
        
        /*  int qntVogais = 0;
        
        System.out.println("Digite uma frase: "); 
        String frase = input.nextLine(); 
        
        String[] frase1 = frase.toLowerCase().split(""); 
        for(String letra : frase1){ 
            switch(letra){
                case "a": 
                qntVogais++; 
                break;
                case "e" : 
                qntVogais++;
                break;
                case "i" : 
                qntVogais++;
                break;
                case "o" : 
                qntVogais++;
                break;
                case "u" : 
                qntVogais++;
                break;
            }
        }
        System.out.println("Tem: "+qntVogais+" vogais");  */
        
        
        /* String text = "MANDA O JAB";
        String[] aids = text.split(" ");
        
        // Mamacos me mordam
        
        for (int i = 0; i < aids.length; i++) {
            System.out.println(aids[i]);
        } */
        
        /*
        * String text = "KAUaFd";
         * System.out.println(text.equals("KauaFdp"));
         * System.out.println(text.equalsIgnoreCase("kauafd"));
         */

        /*
         * String text = "TeXT";
         * String textLower = text.toLowerCase();
         * textLower = textLower.substring(0,1).toUpperCase();
         * System.out.println(textLower);
         */

        /*
         * String text = "DaNiKaua";
         * text = text.toLowerCase();
         * char text2 = text.charAt(0);
         * String text3 = String.valueOf(text2).toUpperCase();
         * text = text3+text;
         * System.out.println(text);
         */

    }
}