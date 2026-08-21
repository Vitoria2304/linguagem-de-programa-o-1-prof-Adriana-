import java.util.Scanner;
public class Main {//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    void main() {
        int num;

        Scanner s = new Scanner(System.in);
        System.out.println("Qual você deseja executar?");
        System.out.println();
        System.out.println("1 - Verificação de Múltiplo");
        System.out.println("2 - Sistema de Login Simplificado");
        System.out.println("3 - Compra com desconto");
        System.out.println("4 - Temperatura");
        System.out.println("5 - Os trinta e cinco camelos");
        System.out.println("6 - Calculadora de viagem");
        System.out.println("7 - Aluguel de carro");

        num = s.nextInt();

        if (num == 1) {
            Multiplo n = new Multiplo();
            n.numeros();

        } else if (num == 2) {
            Sistema l = new Sistema();
            l.login();

        } else if (num == 3) {
            Descont d = new Descont();
            d.dinheiro();

        } else if (num == 4) {
            Temperatura t = new Temperatura();
            t.Tempo();

        } else if (num == 5) {
            Camelo d = new Camelo();
            d.distribuir();

        } else if (num == 6) {
            Viagem m = new Viagem();
            m.mala();

        } else if (num == 7) {
            Aluguel c = new Aluguel();
            c.Carro();


        }
    }
}
