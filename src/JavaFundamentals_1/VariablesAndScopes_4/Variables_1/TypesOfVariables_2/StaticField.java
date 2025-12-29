package JavaFundamentals_1.VariablesAndScopes_4.Variables_1.TypesOfVariables_2;
/*Un campo estatico es una variable que pertenece a una clase. Un campo estatico tiene el
mismo valor para todos  los objetos que accede a el. Los campos estaticos tambien se denominan
variables de clase.*/
public class StaticField {
    // Campo estaticos
    static int totalObjectos = 0;
    public StaticField() { totalObjectos++; }
    public static void mostrarTotal() {
        System.out.println("Totoal de objetos creados: " + totalObjectos);
    }
}

class TestOne {
    public static void main(String[] args) {
        new StaticField();
        new StaticField();

        StaticField.mostrarTotal();
    }
}