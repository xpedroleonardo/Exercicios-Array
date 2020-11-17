import java.util.Scanner;
public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int [] vetorA = new int [10];
        int [] vetorB = new int [10];
        int numeracao = 1;
        
        System.out.println("Exercícios de Fixação ( Vetor ) ");
        System.out.println("------------");
        System.out.println("EXERCÍCIO 6");
        System.out.println("------------");
        
        for(int x=0;x<=9;x++){
            System.out.println("Digite o "+numeracao+"º número: ");
            vetorA[x]=ler.nextInt();
            numeracao++;    
        }
         
        System.out.println("----------------");
        System.out.println("Vetor A:");
        System.out.println("Valores Digitados");
        System.out.println("----------------");
        
        for(int x=0;x<=9;x++){
            System.out.print(vetorA[x]+" | ");
        }
        
        System.out.println("");
        System.out.println("----------------");
        System.out.println("Vetor B:");
        System.out.println("Valor Restante da Divisão do respectivo elemento de A por 2");
        System.out.println("----------------");
        
        for(int x=0;x<=9;x++){                      /*O resultado Sai assim pq a variável é do tipo inteiro*/
            vetorB[x] = vetorA[x]/2;                /*Se fosse Float ou Double, o resultado ia sair em números decimais*/
            System.out.print(vetorB[x]+" | ");
        }
        System.out.println("");
        System.out.println("----------------");
        System.out.println("FIM DO EXERCÍCIO 6");
    }    
}
