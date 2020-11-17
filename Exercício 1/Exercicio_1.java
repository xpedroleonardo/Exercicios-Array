import java.util.Scanner;
public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String [] vetorA = new String [5];
        String [] vetorB = new String [5];
        int numeracao = 1;
        
        System.out.println("Exercícios de Fixação ( Vetor ) ");
        System.out.println("------------");
        System.out.println("EXERCÍCIO 1");
        System.out.println("------------");
        
        for(int x=0;x<=4;x++){
            System.out.println("Digite a "+numeracao+"º letra/Palavra: ");
            vetorA[x]=ler.nextLine();
            numeracao++;    
        }
        
        System.out.println("----------------");
        System.out.println("Vetor A:");
        System.out.println("Letras/Palavras");
        System.out.println("----------------");
        
        for(int x=0;x<=4;x++){
            System.out.print(vetorA[x]+" | ");
        }
        
        System.out.println("");
        System.out.println("----------------");
        System.out.println("Vetor B:");
        System.out.println("Letras/Palavras");
        System.out.println("----------------");
        
        for(int x=0;x<=4;x++){
            vetorB[x]= vetorA[x]; 
            System.out.print(vetorB[x]+" | ");
        }
        System.out.println("");
        System.out.println("----------------");
        System.out.println("FIM DO EXERCÍCIO 1");
    }
    
}
