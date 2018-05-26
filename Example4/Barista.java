public class Barista {
    public Coffee make(MenuItem menuItem) throws NotSupportedMenuException {
        return new Coffee(menuItem.getName());
    }
}
