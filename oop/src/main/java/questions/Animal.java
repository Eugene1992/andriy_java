package questions;

class Bacteria {

    Animal eat() {
        return new Animal();
    }
}

class Animal extends Bacteria {

    protected Animal eat() {
        return new Animal();
    }
}

class Cat extends Animal {

    @Override
    public Cat eat() {
        return null;
    }
}

class HomeCat extends Cat {

    @Override
    public HomeCat eat() {
        return null;
    }
}

