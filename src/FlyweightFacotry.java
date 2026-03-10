import java.util.HashMap;
import java.util.Map;

public class FlyweightFacotry {

    private final Map<String, FlyweightBase> flyweights = new HashMap<>();

    public FlyweightBase getFlyweight(String key) {

        FlyweightBase flyweight = flyweights.get(key);

        if (flyweight == null) {
            System.out.println("Creating new flyweight for key: " + key);

            flyweight = new ConcreteFlyweight(key);
            flyweights.put(key, flyweight);
        } else {
            System.out.println("Reusing existing flyweight for key: " + key);
        }

        return flyweight;
    }
}