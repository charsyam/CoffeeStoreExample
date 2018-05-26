import java.util.HashMap;
import java.util.Collection;

public class MapTypeMenu implements Menu {
    private HashMap<String, MenuItem> menus = new HashMap<>();

    public MapTypeMenu(Collection<MenuItem> menuItems) {
        for (MenuItem menuItem : menuItems) {
            menus.put(menuItem.getName(), menuItem);
        }
    }

    public MenuItem choose(String name) throws NotExistedMenuException {
        if (menus.containsKey(name) == false) {
            throw new NotExistedMenuException(name);
        }

        return menus.get(name);
    }
}
