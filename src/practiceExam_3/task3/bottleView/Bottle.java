package practiceExam_3.task3.bottleView;


import practiceExam_3.task3.fluidView.Fluid;

public class Bottle extends BottleView {
    private Fluid fluid;

    public Bottle(Fluid fluid) {
        this.fluid = fluid;
    }

    public Fluid getLiquid() {
        return fluid;
    }

    public void setLiquid(Fluid fluid) {
        this.fluid = fluid;
    }

    @Override
    public String toString() {
        return "Бутылка " + fluid;
    }
}

