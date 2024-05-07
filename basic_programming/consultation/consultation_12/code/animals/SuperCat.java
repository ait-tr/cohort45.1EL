package animals;
/*
@date 07.05.2024
@author Sergey Bugaienko
*/

public class SuperCat extends Cat{

    public SuperCat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("SuperCat meow!");
    }

    public void fly() {
        System.out.println("Super cat want flying!");
    }
}
