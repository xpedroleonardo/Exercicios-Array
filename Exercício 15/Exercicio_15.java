import java.util.Scanner;
public class Exercicio_15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int [] vetorA = new int [10];
        int [] vetorB = new int [10];
        int [] vetorC = new int [10];
        int numeracao = 1;
        
        System.out.println("Exercícios de Fixação ( Vetor ) ");
        System.out.println("------------");
        System.out.println("Exercício 15");
        System.out.println("------------");
        
        System.out.println("Vetor A:");
        System.out.println("");
        
        for(int x=0;x<=9;x++){
            System.out.println("Digite o "+numeracao+"º Número: ");
            vetorA[x]=ler.nextInt();
            numeracao++;    
        }
        numeracao = 1;
        
        System.out.println("");
        System.out.println("Vetor B:");
        System.out.println("");
        
        for(int x=0;x<=9;x++){
            System.out.println("Digite o "+numeracao+"º Número: ");
            vetorB[x]=ler.nextInt();
            numeracao++;    
        }
        
        for(int x=0;x<=9;x++){
            if(vetorA[x]>vetorB[x]){
                vetorC[x]=1;
            }else if(vetorA[x]==vetorB[x]){
                vetorC[x]=0;
            }else{
                vetorC[x]=-1;
            }
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
        System.out.println("Se o índice do Vetor A for maior que o do Vetor B = 1");
        System.out.println("Se o índice do Vetor A for igual ao do Vetor B = 0");
        System.out.println("Se o índice do Vetor A for menor que o do Vetor B = -1");
        System.out.println("----------------");
        
        for(int x=0;x<=9;x++){
            System.out.print(vetorC[x]+" | ");
        }
        System.out.println("");
        System.out.println("--------------------");
        System.out.println("FIM DO EXERCÍCIO 15"); 
    }   
}
