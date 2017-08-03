/**
 * Test App
 * Created by tanc on 2017/8/3.
 */
public class App {

    private String name;

    static {
        System.out.println("hello app");
    }

    public App() {
        this("tanc");
        System.out.println("hello init");
    }

    public App(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
