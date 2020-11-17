import java.util.Scanner;
public class Exercicio_11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int [] vetorA = new int [10];
        int numeracao = 1,quant=0,soma=0;
        double soma2=0,media,quant2=0;
        
        System.out.println("Exercícios de Fixação ( Vetor ) ");
        System.out.println("------------");
        System.out.println("Exercício 11");
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
            if(vetorA[x]<15){
                soma=soma+vetorA[x];
            }else if(vetorA[x]==15){
                quant++;
            }else{
                soma2=soma2+vetorA[x];
                quant2++;
            }
        } 
        media=soma2/quant2;
        System.out.println("");
        System.out.println("----------------");
        System.out.println("Soma dos Elementos Menores que 15 é igual a: "+soma);
        System.out.println("A Quantidade de Elementos Que São iguais a 15 é: "+quant);
        System.out.println("A Média dos Números superiores a 15 é: "+media);
        System.out.println("----------------");
        System.out.println("FIM DO EXERCÍCIO 11"); 
    }
    
}
