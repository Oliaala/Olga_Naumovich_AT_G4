package tasks.classwork.day6;

public class С extends A {

    @Override
    public int foo(int x) {

        System.out.println(x * 5);
        return super.foo(x * 5);
    }
}
