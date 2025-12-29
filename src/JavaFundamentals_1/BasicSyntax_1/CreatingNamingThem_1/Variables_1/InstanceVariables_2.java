package JavaFundamentals_1.BasicSyntax_1.CreatingNamingThem_1.Variables_1;
/*Los campos no estaticos tambie se conocen como variables de instancia porque sus valores son unicos para
cada instancia de una clase*/
// Bicicleta
public class InstanceVariables_2 {
    // Variable de instancia
    int  aCurrentSpeed;

    public InstanceVariables_2 (int pCurrentSpeed) { aCurrentSpeed = pCurrentSpeed; }

    public void speed(int pSpeed) { aCurrentSpeed += pSpeed; }

    public void showSpeed() {
        System.out.println("Velocidad actual: " + aCurrentSpeed + " km/h");
    }
}
