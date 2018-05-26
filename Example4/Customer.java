public class Customer {
    public void order(String menuName, Menu menu, Barista brista) {
        try {
            MenuItem menuItem = menu.choose(menuName);
            Coffee coffee = brista.make(menuItem);
            System.out.println("Drink coffee : " + coffee.getName());
        } catch(NotExistedMenuException e) {
            System.out.println("Can't Drink Not existed menu : " + menuName);
        } catch(NotSupportedMenuException e) {
            System.out.println("Can't Drink Barista is Newbie :  " + menuName);
        }
    }
}
