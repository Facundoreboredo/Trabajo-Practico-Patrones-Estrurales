package Decorator;

public class PlanBasico implements Plan{
        @Override
        public String getDescripcion() {
            return "Decorator.Plan Básico";
        }

        @Override
        public double getCosto() {
            return 1000.0;
        }
}
