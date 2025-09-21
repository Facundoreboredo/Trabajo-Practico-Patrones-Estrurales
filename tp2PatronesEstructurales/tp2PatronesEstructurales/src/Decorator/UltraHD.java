package Decorator;

public class UltraHD extends PlanDecorador {
    public UltraHD(Plan plan) {
        super(plan);
    }

    @Override
    public String getDescripcion() {
        return plan.getDescripcion() + " + Decorator.UltraHD";
    }

    @Override
    public double getCosto() {
        return plan.getCosto() + 1000.0;
    }
}
