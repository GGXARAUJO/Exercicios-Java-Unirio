import java.util.Scanner;
public class formatacaotempo {
    public static void main(String [] args) {
    int t;
    int hora;
    int minuto;
    int segundo;
    int resto;


    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe o tempo em segundos");
    t = teclado.nextInt();


   hora = t/3600;
   resto = t %3600;
   minuto = resto/60;
   segundo= resto % 60;
    
    

    System.out.printf("%d:%d:%d\n",hora,minuto,segundo);
    
}
}
