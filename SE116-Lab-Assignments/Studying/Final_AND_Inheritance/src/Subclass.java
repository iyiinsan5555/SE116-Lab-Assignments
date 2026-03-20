public class Subclass extends Superclass {
    public static void main(String[] args) {
        Subclass subclass = new Subclass();
        System.out.println(subclass.property1);
        System.out.println(subclass.property2);
        //System.out.println(subclass.property3); java: property3 has private access in Superclass
        System.out.println(subclass.property4);

        System.out.println(subclass.method1());
        System.out.println(subclass.method2());
        //subclass.method3(); //java: cannot find symbol  symbol:   method method3()  location: variable subclass of type Subclass
        System.out.println(subclass.method4()); //Inherited but cannot override it! (Cuz its final)

    }
}
