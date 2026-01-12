package JavaFundamentals_1.BasicSyntax_1.UsingOperators_5.UnaryOperators_4;
/*Los operadores de icremento/disminucion se pueden aplicar antes(prefijo) o despues (postfijo)
del operando. La unica diferencia es que la version prefijo (++result) se evalua al valor
incrementado, mientras que la version pstfijo (result++) se evalua al valor original*/
public class UnarioPrePos {
    public static void main() {
        // EJEMPLO 1: Prefijo - Incrementa ANTES de usar el valor
        int x = 5;
        int resultadoPrefijo = ++x;
        System.out.println("Prefijo: x = " + x + ", resultado = " + resultadoPrefijo);

        // EJEMPLO 2: Postfijo - Usa el valor ORIGINAL, luego incrementa
        int y = 5;
        int resultadoPostfijo = y++;
        System.out.printf("Postfijo: y = " + y + ", resultado = " + resultadoPostfijo);

        // EJEMPLO 3: Diferencia CRITICA en bucles
        System.out.println("\n----Diferencia en bucles-----");
        int a = 0;

        while (++a < 3) {
            System.out.println("Prefijo: a = " + a);
        }
    }
}
