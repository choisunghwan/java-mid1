package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter Outer = new InnerOuter();
        InnerOuter.Inner inner = Outer.new Inner();
        inner.print();

        System.out.println("inner.getClass() = " + inner.getClass());

    }
}

