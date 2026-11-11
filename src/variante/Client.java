package variante;

public class Client {
    public static void main(String[] args) {
        Configurator configurator = new Configurator();

        System.out.println("=== Configurator Gamming Computer ===");
        configurator.buildGamingComputer().displaySpecs();

        System.out.println("\n=== Configurator Office Computer ===");
        configurator.buildOfficeComputer().displaySpecs();
    }
}
