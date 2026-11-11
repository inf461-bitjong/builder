package cours;

import cours.abstractions.MonteurPizza;
import cours.builders.MonteurPizzaPiquante;
import cours.builders.MonteurPizzaReine;
import cours.modeles.Pizza;

public class Directeur {
    public Pizza construirePizzaReine() {
        MonteurPizza pizzaReine = new MonteurPizzaReine();
        return pizzaReine.getPizza();
    }

    public Pizza construirePizzaPiquante() {
        MonteurPizza pizzaPiquante = new MonteurPizzaPiquante();
        return pizzaPiquante.getPizza();
    }
}
