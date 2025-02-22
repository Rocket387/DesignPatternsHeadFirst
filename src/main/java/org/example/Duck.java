package org.example;

public abstract class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck() {

    }

    public void display() {

    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void performFly(){
        flyBehaviour.fly();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehaviour(FlyBehaviour fb) {
        flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb) {
        quackBehaviour = qb;
    }

}
