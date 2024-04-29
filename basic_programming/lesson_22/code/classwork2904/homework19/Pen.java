package classwork2904.homework19;

public class Pen {
    private int inkAmount;

    public Pen() {
        this.inkAmount = 100;
    }

    public int getInkAmount() {
        return inkAmount;
    }

    public void write(String text) {
        // проходим по всей строке
        for (int i = 0; i < text.length(); i++) {
            // если чернила закончились
            if (inkAmount == 0) {
                // прекращаем писать
                break;
            }
            // пишем букву
            System.out.print(text.charAt(i));
            // уменьшаем к-во чернил на 1
            inkAmount--;
        }
        System.out.println();
    }

    public void refill() {
        inkAmount = 100;
    }

    public void checkInk() {
        System.out.println("Remaining ink: " + inkAmount);
    }

}
