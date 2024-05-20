import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        double saldo = new Scanner(System.in).nextDouble();
        double valorSolicitado = new Scanner(System.in).nextDouble();
        if (saldo > valorSolicitado){
            saldo = saldo - valorSolicitado;
        }else
            System.out.println("Saldo insuficiente");

        System.out.printf("Seu saldo é:"+saldo);
    }
}
