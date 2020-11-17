import java.util.Scanner;
public class Exercicio_13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double [] nota1 = new double [10];
        double [] nota2 = new double [10];
        double [] resul = new double [10];
        int numeracao = 1;
        
        System.out.println("Exercícios de Fixação ( Vetor ) ");
        System.out.println("------------");
        System.out.println("Exercício 13");
        System.out.println("------------");
        System.out.println("Notas Do 1º Semestre:");
        System.out.println("");
        
        for(int x=0;x<=9;x++){
            System.out.println("Digite a nota do "+numeracao+"º aluno: ");
            nota1[x]=ler.nextDouble();
            numeracao++;    
        }
        
        System.out.println("");
        System.out.println("Notas Do 2º Semestre:");
        System.out.println("");
        
        numeracao = 1;
        for(int x=0;x<=9;x++){
            System.out.println("Digite a nota do "+numeracao+"º aluno: ");
            nota2[x]=ler.nextDouble();
            numeracao++;    
        }
        System.out.println("");
        System.out.println("--------------------");
        System.out.println("Média Final dos Alunos");
        System.out.println("--------------------");
        System.out.println("");
        
        numeracao = 1;
        for(int x=0;x<=9;x++){
            resul[x]=(nota1[x]+nota2[x])/2;
            System.out.println("Nota média do "+numeracao+"º aluno: ");
            System.out.println("");
            System.out.print(resul[x]);
            
            if(resul[x]>=7){
                System.out.println(" Parabens, Você foi Aprovado!!!");
            }else{
                System.out.println(" Infelizmente Você foi Reprovado.");
            }
            numeracao++;
            System.out.println("");
            System.out.println("-----------------------------------");
        }
         System.out.println("FIM DO EXERCÍCIO 13"); 
    } 
}
