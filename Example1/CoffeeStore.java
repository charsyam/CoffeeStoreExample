import java.util.ArrayList;
import java.util.List;

public class CoffeeStore {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Barista brista = new Barista();

        List<MenuItem> coffeeMenu = new ArrayList<MenuItem>();
        coffeeMenu.add(new MenuItem("americano", 3000));
        coffeeMenu.add(new MenuItem("caffelatte", 4000));
        coffeeMenu.add(new MenuItem("cafuchino", 4000));

        Menu menu = new Menu(coffeeMenu);

        customer.order("americano", menu, brista);
    }
}
