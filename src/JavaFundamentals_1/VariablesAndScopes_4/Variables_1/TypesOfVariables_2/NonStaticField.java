package JavaFundamentals_1.VariablesAndScopes_4.Variables_1.TypesOfVariables_2;
/*Un campo no estatico es una variable que pertenece a un objeto. Los objetos mantienen
su estado interno en campos no estaticos. Los campos no estaticos tambien se denominan
variables de instancia, porque pertenecen a instancias  (objectos) de un clase*/
public class NonStaticField {
    // Campo no estaticp
    String nombre;
    public NonStaticField(String nombre) { this.nombre = nombre; }
    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }
}

class Test {
    public static void main(String[] args) {
        NonStaticField p1 = new NonStaticField("Ana");
        NonStaticField p2 = new NonStaticField("Juan");

        p1.saludar();
        p2.saludar();
    }
}