package logic;



import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Lab_1 {
    Scanner sc = new Scanner(System.in);

    public void ejercicio1() {
        System.out.println("Digite el número: ");
        int num1 = sc.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("El número ingresado es par.");
        } else {
            System.out.println("El número ingresado es impar.");
        }
    }

    public void ejercicio2() {
        System.out.println("Digite el número: ");
        int numab = sc.nextInt();

        if (numab < 0) {
            numab = -numab;
        }

        System.out.println("El valor absoluto es: " + numab);
    }

    public void ejercicio3() {
        int suma = 0;
        int num = 3;

        while (num <= 99) {
            System.out.println(num);
            suma += num;
            num += 3;
        }

        System.out.println("La suma de los números es: " + suma);
    }

    public void ejercicio4() {
        int[] numeros = new int[3];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite un número:");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Arreglo desordenado:");
        for (int numero : numeros) {
            System.out.print(numero + ", ");
        }

        Arrays.sort(numeros);

        System.out.println("\nArreglo ordenado:");
        for (int numero : numeros) {
            System.out.print(numero + ", ");
        }
        System.out.println();
    }

    public void ejercicio5() {
        System.out.println("Digite el primer número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite el segundo número: ");
        int num2 = sc.nextInt();

        int result;

        if (num1 == num2) {
            result = num1 * num2;
            System.out.println("El resultado de la multiplicación es: " + result);
        } else if (num1 > num2) {
            result = num1 - num2;
            System.out.println("El resultado de la resta es: " + result);
        } else {
            result = num1 + num2;
            System.out.println("El resultado de la suma es: " + result);
        }
    }

    public void ejercicio6() {
        boolean huboDiez = false;
        int nota;

        do {
            System.out.print("Ingrese una nota (0 a 10) o -1 para terminar: ");
            nota = sc.nextInt();

            if (nota == 10) {
                huboDiez = true;
            }

        } while (nota != -1);

        if (huboDiez) {
            System.out.println("Sí hubo una nota con valor 10.");
        } else {
            System.out.println("No hubo ninguna nota con valor 10.");
        }
    }

    public void ejercicio7_Pulsaciones() {
        System.out.println("Ingrese su sexo (F/M):");
        String sexo = sc.next();

        System.out.println("Ingrese su edad (años):");
        int edad = sc.nextInt();

        double pulsaciones;

        if (sexo.equalsIgnoreCase("F")) {
            pulsaciones = (220 - edad) / 10.0;
        } else {
            pulsaciones = (210 - edad) / 10.0;
        }

        System.out.println("El número de pulsaciones es: " + pulsaciones);
    }

    public void ejercicio8() {
        System.out.print("Ingrese el salario mensual: ");
        double salario = sc.nextDouble();

        System.out.print("Ingrese los años de antigüedad: ");
        int antiguedad = sc.nextInt();

        double utilidad;

        if (antiguedad < 1) {
            utilidad = salario * 0.05;
        } else if (antiguedad < 2) {
            utilidad = salario * 0.07;
        } else if (antiguedad < 5) {
            utilidad = salario * 0.10;
        } else if (antiguedad < 10) {
            utilidad = salario * 0.15;
        } else {
            utilidad = salario * 0.20;
        }

        System.out.println("La utilidad a recibir es: " + utilidad);
    }

    public void ejercicio9() {
        System.out.println("Ingrese un número para verificar si es primo: ");
        int numero = sc.nextInt();

        int divisores = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores++;
            }
        }

        if (divisores == 2) {
            System.out.println("El número es primo.");
        } else {
            System.out.println("El número NO es primo.");
        }
    }

    public void ejercicio10() {
        final double precioUnitario = 11000;

        System.out.print("Ingrese la cantidad de computadoras a comprar: ");
        int cantidad = sc.nextInt();

        double precioTotal = cantidad * precioUnitario;
        double descuento;

        if (cantidad < 5) {
            descuento = precioTotal * 0.10;
        } else if (cantidad < 10) {
            descuento = precioTotal * 0.20;
        } else {
            descuento = precioTotal * 0.40;
        }

        double totalPagar = precioTotal - descuento;

        System.out.println("Cantidad de computadoras: " + cantidad);
        System.out.println("Precio total sin descuento: $" + precioTotal);
        System.out.println("Monto descontado: $" + descuento);
        System.out.println("Monto total a pagar: $" + totalPagar);
    }

    public void ejercicio11_generarPrimos() {
        System.out.println("Ingrese un número (mayor o igual a 2):");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("No hay números primos menores que 2.");
            return;
        }

        List<Integer> primos = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            boolean esPrimo = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                primos.add(i);
            }
        }

        System.out.println("Números primos entre 2 y " + n + ": " + primos);
    }

    public void ejercicio12() {
        System.out.println("Ingrese la base del triángulo:");
        int base = sc.nextInt();

        System.out.println("Ingrese la altura del triángulo:");
        int altura = sc.nextInt();

        int area = (base * altura) / 2;

        System.out.println("El valor del área es: " + area);
    }
}
