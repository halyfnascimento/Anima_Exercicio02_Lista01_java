import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Me diga um numero");
        numero = teclado.nextInt();
        teclado.close();
        System.out.println("O número informado foi: " + numero);
    }
}
