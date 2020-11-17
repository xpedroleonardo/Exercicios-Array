import java.util.Scanner;
public class Exercicio_8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int [] vetorA = new int [10];
        int numeracao = 1,soma=0;
        
        System.out.println("Exercícios de Fixação ( Vetor ) ");
        System.out.println("------------");
        System.out.println("Exercício 8");
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
        for(int x=0;x<=9;x++){
        soma = soma+vetorA[x];   
        }
        System.out.println("");
        System.out.println("------------");
        System.out.println("A Soma de todos os Números Digitados é igual a: "+soma);
        System.out.println("----------------");
        System.out.println("FIM DO EXERCÍCIO 8");
    } 
}
