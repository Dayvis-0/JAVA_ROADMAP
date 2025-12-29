package JavaFundamentals_1.BasicSyntax_1.CreatingNamingThem_1.Variables_1;
/*Las variables locales solo son visibles para los metodos en los que se declaran; no son accesibles desde
el resto de la clase*/
public class LocalVariable_4 {
    public void speed() {
        int increase = 1;
        System.out.println("Acelerando: " + increase + " km/h");
    }
}