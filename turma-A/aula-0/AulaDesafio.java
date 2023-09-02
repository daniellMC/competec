import java.util.Scanner; 
public class AulaDesafio {
    //Desafio 01 
    /* public static void main(String[] args) {
            Text(); 
    }
    public static void Text(){
        System.out.println("compeTOP");
    } */
    //Desafio 02
    /* public static void main(String[] args) {
      int soma = Soma(10,20); 
      System.out.println(soma);
    }
    public static int Soma(int num1,int num2){
        return num1 + num2; 
    } */
    //Desafio 03
    /* public static void main(String[] args) {
        Tabuada(2);
    }
    public static void Tabuada(int num){
        for(int i = 0; i <= 10;i++){
            System.out.println(num + " X " + i + " = "+num*i);
        }
    } */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de frutas");
        int qntFrutas = input.nextInt();

        double[] result = Convercao(qntFrutas);
        
        
        System.out.printf("Valor em Dolar = %.2f\n",result[1]);
        System.out.printf("Valor em Real = %.2f\n",result[0]);
        System.out.printf("Valor em Euro = %.2f\n",result[2]);
        System.out.printf("Valor em Iene = %.2f\n",result[3]);

        input.close(); 
    }
    public static double[] Convercao(int qntFrutas){
        double reais = qntFrutas*0.47;
        double dolar = qntFrutas*0.091;
        double euros = qntFrutas*0.077;
        double ienes = qntFrutas*10;
        
        double[] result = new double [4];
        result[0] = reais; 
        result[1] = dolar; 
        result[2] = euros; 
        result[3] = ienes; 

        return result;
    }
}