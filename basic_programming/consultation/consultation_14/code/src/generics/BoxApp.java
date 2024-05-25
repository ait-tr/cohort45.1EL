package generics;
/*
@date 25.05.2024
@author Sergey Bugaienko
*/

public class BoxApp {
    public static void main(String[] args) {

        SimpleBox box = new SimpleBox(10);
        SimpleBox box1 = new SimpleBox(20);

        System.out.println(box);

        int sum =(int) box.getValue() + (int) box1.getValue();

        System.out.println(sum);

        SimpleBox box2 = new SimpleBox("30");

        SimpleBox[] boxes = new SimpleBox[3];
        boxes[0] = box;
        boxes[1] = box1;
        boxes[2] = box2;

        int sum1 = 0;
        for (int i = 0; i < boxes.length;   i++) {
            sum1 += (int) boxes[i].getValue(); // требует преобразования
        }

        System.out.println(sum1);


    }
}
