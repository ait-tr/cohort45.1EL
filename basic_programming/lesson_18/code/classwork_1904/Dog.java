package classwork_1904;
/*
@date 19.04.2024
@author Sergey Bugaienko
*/

public class Dog {
    String name;
    int weight;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    String whoAmI() {
        return "I am dog " + this.name + ", my weight: " + this.weight;
    }

    void eat() {
        System.out.println("Я кушаю, ням-ням!");
        weight++;
    }

    void run() {

        while (weight < 3) {
            System.out.println("Сорян! Я слишком худая и голодная! Бежать не могу!");
            System.out.println("Надо поесть! Мой вес сейчас: " + weight);

            eat();
        }

        System.out.println("Я бегу!"); //Двигать строку / строки по коду Alt + Shift + стрелка вверх / вниз
        weight -= 2; //  weight = weight - 2;


        // Ctrl + D - продублировать строку / строки
        /*
        weight *= 1; weight = weight * 1;
        weight /= 2; weight = weight / 2;
        weight += 5; weight = weight + 5;
        weight++; weight = weight +1 ;
         */

    }
}
