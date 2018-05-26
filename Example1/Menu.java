import java.util.List;

public class Menu {
    private List<MenuItem> menus;

    public Menu(List<MenuItem> menus) {
        this.menus = menus;
    }

    public MenuItem choose(String name) {
        for (MenuItem menuItem : menus) {
            if (menuItem.getName().equals(name)) {
                return menuItem;
            }
        }

        return null;
    }
}
