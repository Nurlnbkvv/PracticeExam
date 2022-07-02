package practiceExam_3.task3;

import practiceExam_3.task3.bottleView.BottleView;
import practiceExam_3.task3.flatView.FlatView;
import practiceExam_3.task3.circleView.Apple;
import practiceExam_3.task3.circleView.Circle;
import practiceExam_3.task3.circleView.TennisBalls;

    /* 3. В рюкзак помещается что-то плоское, что-то имеющее форм бутылки (цилиндрическое) и несколько круглых вещей.

        Собрать 3 рюкзака.
        Поместить в них:
        В первый - 20 яблок, книгу и кока-колу
        Во второй - 50 теннисных мячей, папку и бутылку воды

        В третий - 10 яблок, 3 теннисных мяча, папку и кока-колу
     */

public class Bag {
    private Circle[] array;
    private FlatView flatView;
    private BottleView bottleView;
    private final int id;
    private static int amount;

    public Bag(Circle[] array, FlatView flatView, BottleView bottleView) {
        this.array = array;
        this.flatView = flatView;
        this.bottleView = bottleView;
        amount++;
        this.id = amount;
    }

    public Circle[] getArray() {
        return array;
    }

    public void setArray(Circle[] array) {
        this.array = array;
    }

    public FlatView getFlat() {
        return flatView;
    }

    public void setFlat(FlatView flatView) {
        this.flatView = flatView;
    }

    public BottleView getBottleView() {
        return bottleView;
    }

    public void setCylindrical(BottleView bottleView) {
        this.bottleView = bottleView;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Рюкзак: " + " | " + id + " | " + getAmount() + " | " + flatView + " | " + bottleView;
    }

    private String getAmount() {
        int amountApple = 0;
        int amountTennis = 0;
        for (Circle circle : this.array) {
            if (circle instanceof Apple) {
                amountApple++;
            }
            if (circle instanceof TennisBalls) {
                amountTennis++;
            }
        }
        if(amountApple != 0 && amountTennis == 0) {
            return amountApple + " Яблоки";
        }
        if(amountApple == 0 && amountTennis != 0) {
            return amountTennis + " Теннесные мячи";
        }
        if(amountApple != 0 & amountTennis != 0) {
            return amountApple + " Яблоки | " + amountTennis + " Теннесные мячи";
        }
        return "";
    }
}

