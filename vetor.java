import java.util.Scanner;
public class vetor {
    
    public static void main(String [] args) {
    
    int n;
    int[] a;
    
        Scanner teclado = new Scanner(System.in);
    
        System.out.println("Insira o numero de alunos");
        n = teclado.nextInt();

         a = new int[n];
    
        for (int i = 0; i < a.length; i++)
        {
        System.out.printf("Insira a nota do aluno %d\n",i+1);

         a[i] = teclado.nextInt();
         
        }

        for (int i = 0; i < a.length; i++)
        {
        System.out.printf("Nota do aluno %d: %d\n",i+1,a[i]);
        }
        
    }

    }
    

