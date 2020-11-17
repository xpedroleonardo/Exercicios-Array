import java.util.Scanner;
public class Exercicio_18 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int [] vetorA = new int [10];
        int [] vetorB = new int [10];
        int [] vetorC = new int [20];
        int numeracao = 1,y=10;
        
        System.out.println("Exercícios de Fixação ( Vetor ) ");
        System.out.println("------------");
        System.out.println("EXERCÍCIO 18");
        System.out.println("------------");
        System.out.println("Vetor A");
        System.out.println("");
        for(int x=0;x<=9;x++){
            System.out.println("Digite o "+numeracao+"º número: ");
            vetorA[x]=ler.nextInt();
            numeracao++;    
        }
        System.out.println("");
        System.out.println("------------");
        System.out.println("Vetor B");
        System.out.println("");
        
        numeracao=1;
        for(int x=0;x<=9;x++){
            System.out.println("Digite o "+numeracao+"º número: ");
            vetorB[x]=ler.nextInt();
            numeracao++;    
        }
        for(int x=0;x<=9;x++){
            vetorC[x]=vetorA[x];
        }
        
        for(int x=0;x<=9;x++){
            vetorC[y]=vetorB[x];
            y++;
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
        System.out.println("Números Digitados");
        System.out.println("----------------");
        
        for(int x=0;x<=9;x++){
            System.out.print(vetorB[x]+" | ");
        }
         System.out.println("");
        System.out.println("----------------");
        System.out.println("Vetor C:");
        System.out.println("Junção dos Vetores A e B");
        System.out.println("----------------");
        
        for(int x=0;x<=19;x++){
            System.out.print(vetorC[x]+" | ");
        }
        System.out.println("");
        System.out.println("----------------");
        System.out.println("FIM DO EXERCÍCIO 18");
    }
    
}
