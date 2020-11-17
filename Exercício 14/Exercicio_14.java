import java.util.Scanner;
public class Exercicio_14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int [] vetorA = new int [10];
        int [] vetorB = new int [10];
        int numeracao = 1,par=1,impar=0;
        
        System.out.println("Exercícios de Fixação ( Vetor ) ");
        System.out.println("------------");
        System.out.println("Exercício 14");
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
            par=vetorA[x]%2;
            if(par==0){
                vetorB[x]=1;
            }else{
                vetorB[x]=0;
            }
        }
        System.out.println("");
        System.out.println("----------------");
        System.out.println("Vetor B:");
        System.out.println("Se o índice do Vetor A for par = 1");
        System.out.println("Se o índice do Vetor A for ímpar = 0");
        System.out.println("----------------");
        
        for(int x=0;x<=9;x++){
            System.out.print(vetorB[x]+" | ");
        } 
        System.out.println("");
        System.out.println("--------------------");
        System.out.println("FIM DO EXERCÍCIO 14"); 
    }  
}
