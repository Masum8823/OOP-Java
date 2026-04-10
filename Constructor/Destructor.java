// Task 6:
// Create a class TestGC with:
// ✓ A constructor printing "Object created"
// ✓ Override finalize() to print "Object destroyed"
// ✓ In main(), create objects and set them to null, then call System.gc().

class TestGC {

    TestGC() {
        System.out.println("Object is created");
    }

    protected void finalize() {
        System.out.println("Object is destroyed");
    }
}

public class Destructor {
    public static void main(String[] args) {

        TestGC obj1 = new TestGC();
        obj1 = null;
        System.gc();
    }
}