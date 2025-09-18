package domain;

import java.util.Scanner;

public class Lab_2 {
    Scanner sc = new Scanner(System.in);

    // 13) Suma de números pares entre 2 y 1000
    public void ejercicio13() {
        int suma = 0;
        for (int i = 2; i <= 1000; i += 2) {
            suma += i;
        }
        System.out.println("13) La suma de los números pares de 2 a 1000 es: " + suma);
    }

    // 14) Convertir Celsius a Fahrenheit
    public void ejercicio14() {
        System.out.println("14) Ingrese la temperatura en grados Celsius: ");
        int gradosCelsius = sc.nextInt();
        double gradosFaren = (9.0 / 5.0) * gradosCelsius + 32;
        System.out.println("La temperatura en Fahrenheit es: " + gradosFaren);
    }

    // 15) Potencia X^n
    public void ejercicio15(int x, int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= x;
        }
        System.out.println("15) La potencia de " + x + " elevado a " + n + " es: " + resultado);
    }

    // 16) Mes del año según número
    public void ejercicio16() {
        System.out.println("16) Ingrese un número del 1 al 12: ");
        int numero = sc.nextInt();
        String mes;
        switch (numero) {
            case 1: mes = "Enero"; break;
            case 2: mes = "Febrero"; break;
            case 3: mes = "Marzo"; break;
            case 4: mes = "Abril"; break;
            case 5: mes = "Mayo"; break;
            case 6: mes = "Junio"; break;
            case 7: mes = "Julio"; break;
            case 8: mes = "Agosto"; break;
            case 9: mes = "Septiembre"; break;
            case 10: mes = "Octubre"; break;
            case 11: mes = "Noviembre"; break;
            case 12: mes = "Diciembre"; break;
            default: mes = "Número inválido. Debe ser entre 1 y 12.";
        }
        System.out.println("El mes correspondiente es: " + mes);
    }

    // 17) Función F(x)
    public void ejercicio17() {
        System.out.print("17) Ingrese un número entero (x): ");
        int x = sc.nextInt();
        double resultado;
        if (x > 0) {
            resultado = x + 5;
        } else if (x < 0) {
            resultado = x * x;
        } else {
            resultado = 1;
        }
        System.out.println("El resultado de F(x) es: " + resultado);
    }

    // 18) Área de triángulo con lados (fórmula de Herón)
    public void ejercicio18() {
        System.out.println("18) Ingrese la medida del lado A: ");
        double ladoA = sc.nextDouble();
        System.out.println("Ingrese la medida del lado B: ");
        double ladoB = sc.nextDouble();
        System.out.println("Ingrese la medida de la base C: ");
        double baseC = sc.nextDouble();

        double p = (ladoA + ladoB + baseC) / 2;
        double area = Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - baseC));
        System.out.println("El área del triángulo es: " + area);
    }

    // 19) Intercambio de valores
    public void ejercicio19() {
        System.out.println("19) Ingrese el valor de A:");
        int A = sc.nextInt();
        System.out.println("Ingrese el valor de B:");
        int B = sc.nextInt();
        System.out.println("Antes: A=" + A + " B=" + B);
        int TEMP = A;
        A = B;
        B = TEMP;
        System.out.println("Después: A=" + A + " B=" + B);
    }

    // 20) Ecuación de la recta y = mx + b
    public void ejercicio20() {
        System.out.println("20) Ingrese x1: ");
        double x1 = sc.nextDouble();
        System.out.println("Ingrese y1: ");
        double y1 = sc.nextDouble();
        System.out.println("Ingrese x2: ");
        double x2 = sc.nextDouble();
        System.out.println("Ingrese y2: ");
        double y2 = sc.nextDouble();

        if (x1 == x2) {
            System.out.println("La recta es vertical: x = " + x1);
        } else {
            double m = (y1 - y2) / (x1 - x2);
            double b = y1 - m * x1;
            System.out.println("La ecuación de la recta es: y = " + m + "x + " + b);
        }
    }

    // 21) Suma de naturales menores que K
    public void ejercicio21() {
        System.out.println("21) Ingrese el valor de K: ");
        int K = sc.nextInt();
        int suma = 0;
        for (int i = 1; i < K; i++) {
            suma += i;
        }
        System.out.println("La suma de los números menores a " + K + " es: " + suma);
    }

    // 22) Promedio de números positivos
    public void ejercicio22() {
        int suma = 0, contador = 0, num;
        System.out.println("22) Ingrese números positivos (0 para terminar):");
        do {
            num = sc.nextInt();
            if (num > 0) {
                suma += num;
                contador++;
            }
        } while (num != 0);
        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("El promedio es: " + promedio);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }
    }

    // 24) Suma de pares e impares entre 1 y 200
    public void ejercicio24() {
        int par = 0, impar = 0;
        for (int i = 1; i <= 200; i++) {
            if (i % 2 == 0) par += i;
            else impar += i;
        }
        System.out.println("24) Suma de pares: " + par);
        System.out.println("    Suma de impares: " + impar);
    }

    // 25) Suma de cuadrados de los 100 primeros
    public void ejercicio25() {
        long suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += (long) i * i;
        }
        System.out.println("25) La suma de los cuadrados de 1 a 100 es: " + suma);
    }

    // 26) Factorial
    public void ejercicio26() {
        System.out.print("26) Ingrese un número para calcular su factorial: ");
        int num = sc.nextInt();
        int resultFact = 1;
        for (int i = 1; i <= num; i++) {
            resultFact *= i;
        }
        System.out.println("El factorial de " + num + " es: " + resultFact);
    }

    // 27) Máximo de 10 números
    public void ejercicio27() {
        System.out.println("27) Ingrese 10 números:");
        int mayor, menor, num = sc.nextInt();
        mayor = menor = num;

        for (int i = 1; i < 10; i++) {
            num = sc.nextInt();
            if (num > mayor) mayor = num;
            if (num < menor) menor = num;
        }

        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);
    }
}
