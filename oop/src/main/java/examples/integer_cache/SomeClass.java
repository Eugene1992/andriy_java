package examples.integer_cache;

class SomeClass extends SomeClassParent {

    public static final Integer MAX_VALUE;

    // 2
    static {
        // some logic
        MAX_VALUE = 10;
        System.out.println("examples.integer_cache.SomeClass Static init block");
    }

    // 5
    {
        System.out.println("examples.integer_cache.SomeClass Non static init block");
    }

    // 6
    public SomeClass() {
        System.out.println("examples.integer_cache.SomeClass Constructor");
    }
}

class SomeClassParent {

    // 1
    static {
        System.out.println("examples.integer_cache.SomeClassParent Static init block");
    }

    // 3
    {
        System.out.println("examples.integer_cache.SomeClassParent Non static init block");
    }

    // 4
    public SomeClassParent() {
        System.out.println("examples.integer_cache.SomeClassParent Constructor");
    }

    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
    }
}
