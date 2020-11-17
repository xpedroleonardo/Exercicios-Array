import java.util.Scanner;
public class Exercicio_10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int [] vetorA = new int [10];
        int numeracao = 1;
        double impar,media,soma=0,quant=0;
        
        System.out.println("Exercícios de Fixação ( Vetor ) ");
        System.out.println("------------");
        System.out.println("Exercício 10");
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
        System.out.println("Números Ímpares");
        System.out.println("----------------");
        
        for(int x=0;x<=9;x++){
             impar=vetorA[x]%2;
            if(impar==1){
                System.out.print(vetorA[x]+" | ");
                soma = soma+vetorA[x];  
                quant++;
            }
        }
        media=soma/quant;
        
        System.out.println("");
        System.out.println("----------------");
        System.out.println("A Média dos Números Impares é de: "+media);
        System.out.println("----------------");
        System.out.println("FIM DO EXERCÍCIO 10"); 
    }  
}
