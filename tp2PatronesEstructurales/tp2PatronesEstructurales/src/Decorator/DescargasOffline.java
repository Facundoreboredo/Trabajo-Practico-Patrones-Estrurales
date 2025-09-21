package Decorator;

public class DescargasOffline extends PlanDecorador{
    public DescargasOffline(Plan plan) {
        super(plan);
    }

    @Override
    public String getDescripcion() {
        return plan.getDescripcion() + " + Descargas Offline";
    }

    @Override
    public double getCosto() {
        return plan.getCosto() + 700.0;
    }
}
