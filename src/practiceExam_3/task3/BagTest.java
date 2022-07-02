package practiceExam_3.task3;


import practiceExam_3.task3.bottleView.Bottle;
import practiceExam_3.task3.flatView.Book;
import practiceExam_3.task3.flatView.Document;
import practiceExam_3.task3.fluidView.CocaCola;
import practiceExam_3.task3.fluidView.Aqua;
import practiceExam_3.task3.circleView.Apple;
import practiceExam_3.task3.circleView.Circle;
import practiceExam_3.task3.circleView.TennisBalls;

public class BagTest {
    public static void main(String[] args) {
        Apple[] apples = new Apple[20];
        for (int i = 0; i < apples.length; i++) {
            apples[i] = new Apple();
        }
        Bag bag1 = new Bag(apples, new Book(), new Bottle(new CocaCola()));

        TennisBalls[] tennisBalls = new TennisBalls[50];
        for (int i = 0; i < tennisBalls.length; i++) {
            tennisBalls[i] = new TennisBalls();
        }
        Bag bag2 = new Bag(tennisBalls, new Document(), new Bottle(new Aqua()));

        Circle[] appleAndBalls = new Circle[13];
        for (int i = 0; i < appleAndBalls.length; i++) {
            if (i < 10) {
                appleAndBalls[i] = new Apple();
            } else appleAndBalls[i] = new TennisBalls();
        }
        Bag bag3 = new Bag(appleAndBalls, new Document(), new Bottle(new CocaCola()));

        System.out.println(bag1);
        System.out.println(bag2);
        System.out.println(bag3);
    }
}