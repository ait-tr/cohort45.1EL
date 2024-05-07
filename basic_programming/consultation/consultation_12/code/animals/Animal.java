package animals;
/*
@date 07.05.2024
@author Sergey Bugaienko
*/

import java.util.Objects;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("Animal say Hello!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public String toString() {
//        return "Animal{" +
//                "name='" + name + '\'' +
//                '}';
//    }
}


