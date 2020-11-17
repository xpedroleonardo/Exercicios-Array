import java.util.Scanner;
public class Exercicio_16 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int [] vetorA = new int [10];
        char [] vetorB = new char [10];
        int numeracao = 1;
        
        System.out.println("Exercícios de Fixação ( Vetor ) ");
        System.out.println("------------");
        System.out.println("Exercício 16");
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
            if(vetorA[x]<7){
                vetorB[x]= 'a' ;
            }else if(vetorA[x]==7){
                vetorB[x]= 'b' ;
            }else if((vetorA[x]>7)&&(vetorA[x]<10)){
                vetorB[x]= 'c' ;
            }else if(vetorA[x]==10){
                vetorB[x]= 'd' ;
            }else{
                vetorB[x]= 'e' ;
            }
        }
        System.out.println("");
        System.out.println("----------------");
        System.out.println("Vetor B:");
        System.out.println("Se o índice do Vetor A for menor que 7 = a");
        System.out.println("Se o índice do Vetor A for igual a 7 = b");
        System.out.println("Se o índice do Vetor A for maior que 7 e menor que 10 = c");
        System.out.println("Se o índice do Vetor A for igual a 10 = d");
        System.out.println("Se o índice do Vetor A for maior que 10 = e");
        System.out.println("----------------");
        
        for(int x=0;x<=9;x++){
            System.out.print(vetorB[x]+" | ");
        } 
        System.out.println("");
        System.out.println("--------------------");
        System.out.println("FIM DO EXERCÍCIO 16");
    }   
}
