package JavaFundamentals_1.BasicSyntax_1.UsingOperators_5.UnaryOperators_4;
/*Lo operadores unarios requieren solo un operando; realizan varias operaciones, como aumentar
disminuir un valor por uno, negar una expresion o invertir el valor de un booleano*/
public class UnaryOperator {
    public static void main(String[] args) {
        int result = +1;
        System.out.println(result);

        result--;
        System.out.println(result);

        result++;
        System.out.println(result);

        result = -result;
        System.out.println(result);

        boolean success = false;
        System.out.println(success);
        System.out.println(!success);
    }

}
