//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class CalculoIMC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su peso en kilogramos (use la coma): ");
        double peso = input.nextDouble();

        System.out.println("Ingrese su altura (use la coma): ");
        double altura = input.nextDouble();

        if (peso <= 0 || altura <= 0 ) {
            System.out.println("No ingrese el numero '0', ni valores negativos ");
            return;
        }

        double imc = peso / (altura * altura);

        if (imc <18.5) {
            System.out.println("El IMC es: " + imc);
            System.out.println("Usted tiene un bajo peso");
        } else if (18.5 <= imc && imc < 25) {
            System.out.println("El IMC es: " + imc);
            System.out.println ("Usted tiene un peso normal");
        } else if (25 <= imc && imc < 30) {
            System.out.println("El IMC es: " + imc);
            System.out.println("Usted tiene sobrepeso");
        }else {
            System.out.println("El IMC es: " + imc);
            System.out.println("Usted tiene obesidad");
        }

    }}