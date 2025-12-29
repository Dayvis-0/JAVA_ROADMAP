package JavaFundamentals_1.BasicSyntax_1.CreatingNamingThem_1.Variables_1;

public class Variables_1 {

    public static void main(String[] args) {
        // Variables de instancia
        System.out.println("\tVariables de instanca:");
        InstanceVariables_2 bici1 = new InstanceVariables_2(10);
        InstanceVariables_2 bici2 = new InstanceVariables_2(20);

        bici1.speed(5);

        bici1.showSpeed(); // La velocidad cambia, ya que se le aumento 5
        bici2.showSpeed(); //  La velocidad no cambia, ya que no se le aumento nada
        // A esto se le llama variable de instancia, porque sus valores son unicos en cada instancia

        // Variables de clase
        System.out.println("\n\tVariables de clase");
        VariablesClass_3.showNumOfGears(); // No es necesaio crear una instancia, ya que pertenece a la clase

        // Variable local
        System.out.println("\n\tVariable local");
        LocalVariable_4 bici3 = new LocalVariable_4();

        bici3.speed();
        //System.out.println(increase); Error: no es visible aqui

        // Variable parametro
        System.out.println("\n\tVariable de parametro");
        VariableParameter_5 vp =  new VariableParameter_5();

        vp.speed(10);
    }
}