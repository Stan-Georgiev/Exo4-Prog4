public class UnsharedFlyweight extends FlyweightBase{
    private Object state;

    @Override
    public void statefulOperation(Object image) {
        state=image;
        System.out.println(image);
    }
}
