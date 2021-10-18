public class CaliforniaStylePizza {

    public Pizza createPizza(String type) {

        switch (type) {
            case "cheese":
                return new CaliforniaStyleCheesePizza();
            break;
            case "pepperoni":
                return new CaliforniaStylePepperoniPizza();
            break;
            case "clam":
                return new CaliforniaStyleClamPizza();
            break;
            case "veggie":
                return new CaliforniaStyleVeggiePizza();
            break;
        }

        return null;
    }
}
