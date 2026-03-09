//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FlyweightFacotry factory = new FlyweightFacotry();
        FlyweightBase flyweight1 = factory.getFlyweight("repeating");
        Context context1 = new Context("unique1", flyweight1);
        FlyweightBase flyweight2 = factory.getFlyweight("repeating");
        Context context2 = new Context("unique2", flyweight2);
        FlyweightBase flyweight3 = new UnsharedFlyweight();
        Context context3 = new Context("unique3", flyweight3);
        context1.operation();
        context2.operation();
        context3.operation();
        }
    }