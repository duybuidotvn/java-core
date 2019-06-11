import io.duybuivn.je3.item2.NyPizza;
import io.duybuivn.je3.item2.Pizza;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        NyPizza pizza = new NyPizza.Builder(NyPizza.Size.SMALL).addTopping(Pizza.Topping.SAURCE).addTopping(Pizza.Topping.ONION).build();

        System.out.println(pizza);
    }
}
