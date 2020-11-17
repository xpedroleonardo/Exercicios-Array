import java.util.Scanner;
public class Exercicio_12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int [] vetorA = new int [10];
        int numeracao = 1,quant=0;
        
        System.out.println("Exercícios de Fixação ( Vetor ) ");
        System.out.println("------------");
        System.out.println("Exercício 12");
        System.out.println("------------");
        
        for(int x=0;x<=9;x++){
            System.out.println("Digite a idade da "+numeracao+"º pessoa: ");
            vetorA[x]=ler.nextInt();
            numeracao++;    
        }
        
        System.out.println("----------------");
        System.out.println("Vetor A:");
        System.out.println("Idades Digitadas");
        System.out.println("----------------");
        
        for(int x=0;x<=9;x++){
           System.out.print(vetorA[x]+" Anos | ");
           if(vetorA[x]>35){
                quant++;
           }
        }
        
        System.out.println("");
        System.out.println("----------------");
        System.out.println("A Quantidade de pessoas que estão acima dos 35 anos é: "+quant+" Pessoas");
        System.out.println("----------------");
        System.out.println("FIM DO EXERCÍCIO 12"); 
    }  
}
