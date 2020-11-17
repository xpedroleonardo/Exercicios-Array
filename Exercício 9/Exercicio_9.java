import java.util.Scanner;
public class Exercicio_9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int [] vetorA = new int [10];
        int numeracao = 1,mult=0,soma=0;
        
        System.out.println("Exercícios de Fixação ( Vetor ) ");
        System.out.println("------------");
        System.out.println("EXERCÍCIO 9");
        System.out.println("------------");
        
        for(int x=0;x<=9;x++){
            System.out.println("Digite o "+numeracao+"º número: ");
            vetorA[x]=ler.nextInt();
            numeracao++;    
        }
        
        System.out.println("----------------");
        System.out.println("Vetor A:");
        System.out.println("Números Digitados");
        System.out.println("----------------");
        
        for(int x=0;x<=9;x++){
            System.out.print(vetorA[x]+" | ");
        }
        System.out.println("");
        System.out.println("----------------");
        System.out.println("Números Multiplos de 5");
        System.out.println("----------------");
        
        for(int x=0;x<=9;x++){
             mult=vetorA[x]%5;
            if(mult==0){
                System.out.print(vetorA[x]+" | ");
                soma= soma+vetorA[x];
            }
        }
        System.out.println("");
        System.out.println("----------------");
        System.out.println("O Resultado da soma dos Números Multiplos de 5 é de: "+soma);
        System.out.println("----------------");
        System.out.println("FIM DO EXERCÍCIO 9"); 
       
    }   
}
