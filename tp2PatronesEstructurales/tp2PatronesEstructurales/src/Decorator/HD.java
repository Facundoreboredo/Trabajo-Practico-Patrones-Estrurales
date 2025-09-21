package Decorator;

public class HD extends PlanDecorador{
    public HD(Plan plan) {
        super(plan);
    }
    @Override
    public String getDescripcion() {
        return plan.getDescripcion() + " + Decorator.HD";
    }

    @Override
    public double getCosto() {
        return plan.getCosto() + 500.0;
    }
}
