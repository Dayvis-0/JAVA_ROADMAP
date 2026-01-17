package JavaFundamentals_1.BasicSyntax_1.UsingOperators_5.UnaryOperators_4;
/*Los operadores de icremento/disminucion se pueden aplicar antes(prefijo) o despues (postfijo)
del operando. La unica diferencia es que la version prefijo (++result) se evalua al valor
incrementado, mientras que la version postfijo (result++) se evalua al valor original*/
public class UnarioPrePos {
    public static void main() {
        // EJEMPLO 1: Prefijo - Incrementa ANTES de usar el valor
        int x = 5;
        System.out.printf("Valor de x al inicio: " + x);
        int resultadoPrefijo = ++x;
        System.out.println("\nPrefijo: x = " + x + ", resultado = " + resultadoPrefijo);

        // EJEMPLO 2: Postfijo - Usa el valor ORIGINAL, luego incrementa
        int y = 5;
        System.out.printf("Valor de y al inicio: " + y);
        int resultadoPostfijo = y++;
        System.out.printf("\nPostfijo: y = " + y + ", resultado = " + resultadoPostfijo);

        // EJEMPLO 3: Diferencia CRITICA en bucles
        System.out.println("\n----Diferencia en bucles-----");
        int a = 0;

        while (++a < 3) {
            System.out.println("Prefijo: a = " + a);
        }
    }
}
