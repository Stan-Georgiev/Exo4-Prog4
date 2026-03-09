public class Context {
    private final String uniqueState;
    private final FlyweightBase flyweight;

    public Context(String uniqueState,FlyweightBase flyweight) {
        this.uniqueState = uniqueState;
        this.flyweight = flyweight;
    }

    public void operation(){
        flyweight.statefulOperation(uniqueState);
    }
}
