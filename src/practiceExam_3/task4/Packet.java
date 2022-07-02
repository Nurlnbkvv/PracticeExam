package practiceExam_3.task4;

public class Packet implements beEble, singEble{

    private String something;

    public Packet(String something) {
        this.something = something;
    }

    Packet leftPacket = new Packet("Телефон");
    Packet rightPacket = new Packet("Cash");

    @Override
    public void be() {
        System.out.println(rightPacket + "есть");
    }

    @Override
    public void sing() {
        System.out.println(leftPacket + "звенить");
    }
}
