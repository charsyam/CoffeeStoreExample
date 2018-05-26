public class Barista {
    public Coffee make(MenuItem menuItem) {
        return new Coffee(menuItem.getName());
    }
}
