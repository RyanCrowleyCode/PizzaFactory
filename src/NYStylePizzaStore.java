public class NYStylePizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {

        switch (type) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "pepperoni":
//                return new NYStylePepperoniPizza();
                break;
            case "clam":
//                return new NYStyleClamPizza();
                break;
            case "veggie":
//                return new NYStyleVeggiePizza();
                break;
        }
        
        return null;
    }
}
