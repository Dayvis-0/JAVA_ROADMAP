package JavaFundamentals_1.BasicSyntax_1.BranchingWithSwitch_8.ChooseFromStatements_2;
/*La declaracion switch prueba expresiones basadas unicamente en un unico numero
entero, valor numerado o String objeto*/
public class WithSwitchDeclaration {
    public static void main(String[] args) {
        int month = 1;

        // El siguiente codigo podria escribirse con una declaracion switch
        if (month == 1) {
            System.out.println("January");
        } else if (month == 2) {
            System.out.println("February");
        } // ... and so on
    }
}