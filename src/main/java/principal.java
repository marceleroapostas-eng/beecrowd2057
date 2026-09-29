import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
       Scanner leitor = new
            Scanner(System.in);
       
       int S = leitor.nextInt();
       int T = leitor.nextInt();
       int F = leitor.nextInt();
       
       int hora = S + T + F;
       
       if (hora >= 24) {
           hora = hora - 24;
       } else if (hora < 0) {
           hora = hora + 24;
       }
       System.out.println(hora);
    }
}
