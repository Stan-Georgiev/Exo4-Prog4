public class ConcreteFlyweight extends FlyweightBase {

    public ConcreteFlyweight(String chemin) {
        this.chemin = chemin;
    }

    @Override
    public void statefulOperation(Object image) {
        System.out.println("Chemin: " + chemin + " | Image: " + image);
    }
}