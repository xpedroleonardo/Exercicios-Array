import java.util.Scanner;
public class Exercicio_17 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int [] vetorA = new int [10];
        int [] vetorB = new int [10];
        int numeracao = 1,y=9;
        
        System.out.println("Exercícios de Fixação ( Vetor ) ");
        System.out.println("------------");
        System.out.println("EXERCÍCIO 17");
        System.out.println("------------");
        
        for(int x=0;x<=9;x++){
            System.out.println("Digite o "+numeracao+"º número: ");
            vetorA[x]=ler.nextInt();
            numeracao++;    
        }
        
        for(int x=0;x<=9;x++){
            vetorB[x]=vetorA[y];
            y--;
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
        System.out.println("Vetor B:");
        System.out.println("Elementos do Vetor A Invertido");
        System.out.println("----------------");
        
        for(int x=0;x<=9;x++){
            System.out.print(vetorB[x]+" | ");
        }
        
        System.out.println("");
        System.out.println("----------------");
        System.out.println("FIM DO EXERCÍCIO 17");
        
    }
    
}
