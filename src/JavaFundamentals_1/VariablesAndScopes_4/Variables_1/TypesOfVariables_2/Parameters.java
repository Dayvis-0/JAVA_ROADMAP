package JavaFundamentals_1.VariablesAndScopes_4.Variables_1.TypesOfVariables_2;
/*Un parametro es una variable que se pasa a un metodo cuando se llama al
metodo. Los parametros tambien son accesibles unicamente dentro del metodo que los
declara, aunque se les asigna un valor cuando se llama al metodo.*/
public class Parameters {
    public int sumar(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Parameters calc = new Parameters();
        int result = calc.sumar(3, 4);

        System.out.println("Resultado: " + result);
    }
}