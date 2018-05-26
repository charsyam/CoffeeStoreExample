public class Customer {
    public void order(String menuName, Menu menu, Barista brista) {
        MenuItem menuItem = menu.choose(menuName);
        Coffee coffee = brista.make(menuItem);
        System.out.println("Drink coffee : " + coffee.getName());
    }
}
