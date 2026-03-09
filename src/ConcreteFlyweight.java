public class ConcreteFlyweight extends  FlyweightBase{

    @Override
    public void statefulOperation(Object image) {
        System.out.println(image);
    }
}
