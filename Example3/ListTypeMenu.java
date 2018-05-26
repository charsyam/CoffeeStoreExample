import java.util.List;

public class ListTypeMenu implements Menu {
    private List<MenuItem> menus;

    public ListTypeMenu(List<MenuItem> menus) {
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
