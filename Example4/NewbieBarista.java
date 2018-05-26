public class NewbieBarista extends Barista {
    public Coffee make(MenuItem menuItem) throws NotSupportedMenuException {
        if (menuItem.getName().equals("americano") == false) {
            throw new NotSupportedMenuException(menuItem.getName());
        }

        return new Coffee(menuItem.getName());
    }
}
