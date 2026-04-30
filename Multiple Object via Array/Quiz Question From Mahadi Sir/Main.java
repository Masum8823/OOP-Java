class A {
    private int x;

    A(int x) {
        this.x = x;
    }

    int f() {
        return x + 2;
    }
}

class B extends A {

    B(int x) {
        super(x);
    }

    int f() {
        return super.f() + 3;
    }
}

public class Main {

    public static void main(String[] a) {

        A[] arr = new A[5];

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                arr[i] = new A(i);
            else
                arr[i] = new B(i);
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int v = arr[i].f();
            sum = sum + v;
            System.out.println(v);
        }

        System.out.println(sum);
    }
}