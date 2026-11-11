package cours;

public class Client {
    public static void main(String[] args) {
        Directeur directeur = new Directeur();

        System.out.println("............Pizza Reine Fabriquée............");
        directeur.construirePizzaReine().print();

        System.out.println("\n...Pizza Piquante Fabriquée...");
        directeur.construirePizzaPiquante().print();
    }
}
