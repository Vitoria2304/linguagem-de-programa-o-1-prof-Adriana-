import java.util.Scanner;
public class Multiplo {

    public void numeros() {

        int num1;
        int num2;
        Multiplo resul1;
        resul1 = new Multiplo();
        Multiplo resul2 = new Multiplo();
        Scanner s = new Scanner(System.in);
        IO.println("digite um número");
        num1 = s.nextInt();
        IO.println("digite outro número");
        num2 = s.nextInt();
        if (num1 % num2 == 0) {
            IO.println("Esses números são multiplos");
    } else {
            IO.println("o número não é multiplo");
        }
    }
}
