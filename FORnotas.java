import java.util.Scanner;
public class FORnotas {
    
    public static void main(String [] args) {
    
    int n;
    int nota;
    int soma = 0;
    int media;
    
        Scanner teclado = new Scanner(System.in);
    
        System.out.println("Insira o numero de alunos");
        n = teclado.nextInt();
    
        for (int i = 0; i < n; i++)
        {
        System.out.printf("Insira a nota do aluno %d\n",i+1);
         nota = teclado.nextInt();
         soma += nota;
        }
        media = soma/n;
        System.out.printf("Media = %d", media);
    }
    }
    

