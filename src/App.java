public class App {
    public static void main(String[] args) throws Exception {
        long numeroIntroducido1  = Long.parseLong(System.console().readLine("Por favor, introduzca un número: "));
        long numeroIntroducido2  = Long.parseLong(System.console().readLine("Introduzca otro número: "));

        long numero1 = numeroIntroducido1;
        long volteado1 = 0;
        int longitud = 0;

        while (numero1 > 0) {
            volteado1 = (volteado1 * 10) + (numero1 % 10);
            numero1 /= 10;
            longitud++;
        }

        long numero2 = numeroIntroducido2;
        long volteado2 = 0;

        while (numero2 > 0) {
            volteado2 = (volteado2 * 10) + (numero2 % 10);
            numero2 /= 10;
        }

        long resultadoPares = 0;
        long resultadoImpares = 0;
        int digito;

        for (int i = 0; i < longitud; i++) {
            digito = (int)(volteado1 % 10);

            if ((digito % 2) == 0) {
                resultadoPares = resultadoPares * 10 + digito;
            } else {
                resultadoImpares = resultadoImpares * 10 + digito;
            }

            digito = (int)(volteado2 % 10);

            if ((digito % 2) == 0) {
                resultadoPares = resultadoPares * 10 + digito;
            } else {
                resultadoImpares = resultadoImpares * 10 + digito;
            }

            volteado1 /= 10;
            volteado2 /= 10;
        }

        System.out.println("El número de los dígitos pares es: " + resultadoPares);
        System.out.println("El número de los dígitos impares es: " + resultadoImpares);
    }
}
