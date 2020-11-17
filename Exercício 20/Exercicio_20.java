import java.util.Scanner;
public class Exercicio_20 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int [] vetorA = new int [5];
        int numeracao = 1,resul,tabua=1,mult,y;
        
        System.out.println("Exercícios de Fixação ( Vetor ) ");
        System.out.println("------------");
        System.out.println("EXERCÍCIO 20");
        System.out.println("------------");
        System.out.println("Vetor A");
        System.out.println("");
        
        for(int x=0;x<=4;x++){
            System.out.println("Digite o "+numeracao+"º número: ");
            vetorA[x]=ler.nextInt();
            numeracao++;
        } 
        System.out.println("-----------------------");
        System.out.println("Vetor A:");
        System.out.println("Números Digitados");
        System.out.println("-----------------------");
        
        for(int x=0;x<=4;x++){
            System.out.print(vetorA[x]+" | ");
        }
        
        System.out.println("");
        System.out.println("-----------------------");
        
        for(int x=0;x<=4;x++){
                y=1;
                mult=1;
                System.out.println("Tabuada do "+tabua+"º Número: ");
                System.out.println("");
                System.out.println("| Tabuada do "+vetorA[x]+" |");
                System.out.println("");
                while(y<=10){
                    resul=vetorA[x]*mult;
                    System.out.println(vetorA[x]+" x "+mult+" = "+resul);
                    mult++;
                    y++;
                }
                tabua++;
                System.out.println("-----------------------");
            
        }
        System.out.println("FIM DO EXERCÍCIO 20"); 
    } 
}
