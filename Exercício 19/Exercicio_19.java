import java.util.Scanner;
public class Exercicio_19 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int [] vetorA = new int [20];
        int [] vetorB = new int [20];
        int [] vetorC = new int [20];
        int numeracao = 1, b=0,c=0,par;
        
        System.out.println("Exercícios de Fixação ( Vetor ) ");
        System.out.println("------------");
        System.out.println("EXERCÍCIO 19");
        System.out.println("------------");
        System.out.println("Vetor A");
        System.out.println("");
        
        for(int x=0;x<=19;x++){
            System.out.println("Digite o "+numeracao+"º número: ");
            vetorA[x]=ler.nextInt();
            numeracao++;
            par=vetorA[x]%2;
            if(par==0){
                vetorB[b]= vetorA[x];
                b++;
            }else{
                vetorC[c]= vetorA[x];
                c++;
            }
        }
        
        System.out.println("----------------");
        System.out.println("Vetor A:");
        System.out.println("Números Digitados");
        System.out.println("----------------");
        
        for(int x=0;x<=19;x++){
            System.out.print(vetorA[x]+" | ");
        }
        
        System.out.println("");
        System.out.println("----------------");
        System.out.println("Vetor B:");
        System.out.println("Elementos Pares do Vetor A");
        System.out.println("----------------");
        for(int x=0;x<=19;x++){
            if(vetorB[x]>0){
                System.out.print(vetorB[x]+" | ");
            }
        }
        System.out.println("");
        System.out.println("----------------");
        System.out.println("Vetor C:");
        System.out.println("Elementos Ímpares do Vetor A");
        System.out.println("----------------");
        
        for(int x=0;x<=19;x++){
            if(vetorC[x]>0){
                System.out.print(vetorC[x]+" | ");
            }
        }
        System.out.println("");
        System.out.println("----------------");
        System.out.println("FIM DO EXERCÍCIO 19");   
    }  
}
