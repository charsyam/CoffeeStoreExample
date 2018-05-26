import java.util.Map;

public interface Menu {
    MenuItem choose(String name) throws NotExistedMenuException;
}
