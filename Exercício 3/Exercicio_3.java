import java.util.Scanner;
public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int [] vetorA = new int [15];
        int [] vetorB = new int [15];
        int numeracao = 1;
        
        System.out.println("Exercícios de Fixação ( Vetor ) ");
        System.out.println("------------");
        System.out.println("EXERCÍCIO 3");
        System.out.println("------------");
        
        for(int x=0;x<=14;x++){
            System.out.println("Digite o "+numeracao+"º número: ");
            vetorA[x]=ler.nextInt();
            numeracao++;    
        }
         
        System.out.println("----------------");
        System.out.println("Vetor A:");
        System.out.println("Números Digitados");
        System.out.println("----------------");
        
        for(int x=0;x<=14;x++){
            System.out.print(vetorA[x]+" | ");
        }
        
        System.out.println("");
        System.out.println("----------------");
        System.out.println("Vetor B:");
        System.out.println("Números Digitados no Vetor A Elevados ao Quadrado");
        System.out.println("----------------");
        
        for(int x=0;x<=14;x++){           
            vetorB[x]= vetorA[x]*vetorA[x];
            System.out.print(vetorB[x]+" | ");
        }
        System.out.println("");
        System.out.println("----------------");
        System.out.println("FIM DO EXERCÍCIO 3");
    } 
}
