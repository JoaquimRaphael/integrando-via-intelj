package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        a = scan.nextInt();

        System.out.println("Digite o segundo valor:");
        b = scan.nextInt();

        Integer somar = somar(a, b);
        Integer subtrair = subtrair(a, b);
        Integer multiplicar = multiplicar(a,b);
        Integer dividir = dividir(a, b);

        System.out.println(somar);
        System.out.println(subtrair);
        System.out.println(multiplicar);
        System.out.println(dividir);


    }

    public static Integer somar(int a, int b) {
        return a + b;
    }

    public static Integer subtrair(int a, int b) {
        return a - b;
    }
    public static Integer multiplicar(int a, int b) {
        return a * b;
    }
    public static Integer dividir(int a, int b) {
        return a / b;
    }



}