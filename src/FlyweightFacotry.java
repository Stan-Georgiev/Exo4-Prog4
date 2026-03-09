import java.util.HashMap;
import java.util.LinkedHashMap;

public class FlyweightFacotry {
    private final HashMap<String, FlyweightBase> flyweights = new LinkedHashMap<>();

    public FlyweightBase getFlyweight(String key) {
        if (flyweights.containsKey(key)) {
            return flyweights.get(key);
        }
        else {
            ConcreteFlyweight newFlyweight = new ConcreteFlyweight();
            flyweights.put(key, newFlyweight);
            return newFlyweight;
        }
    }

}
