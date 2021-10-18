public class ChicagoStylePizzaStore extends PizzaStore{

    public Pizza createPizza(String type) {

        switch (type) {
            case "cheese":
                return new ChicagoStyleCheesePizza();
                break;
            case "pepperoni":
                return new ChicagoStylePepperoniPizza();
                break;
            case "clam":
                return new ChicagoStyleClamPizza();
                break;
            case "veggie":
                return new ChicagoStyleVeggiePizza();
                break;
        }

        return null;
    }
}
