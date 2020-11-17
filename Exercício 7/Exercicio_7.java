import java.util.Scanner;
public class Exercicio_7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int [] vetorA = new int [10];
        int numeracao = 1,pares=0,quant=0;
        
        System.out.println("Exercícios de Fixação ( Vetor ) ");
        System.out.println("------------");
        System.out.println("EXERCÍCIO 7");
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
        System.out.println("Números Pares");
        System.out.println("----------------");
        
        for(int x=0;x<=9;x++){
             pares=vetorA[x]%2;
            if(pares==0){
                System.out.print(vetorA[x]+" | ");
                quant++;
            }
        }
        System.out.println("");
        System.out.println("----------------");
        System.out.println("A Quantidade de Números pares é de: "+quant+" Números");
        System.out.println("----------------");
        System.out.println("FIM DO EXERCÍCIO 7");
    }  
}
