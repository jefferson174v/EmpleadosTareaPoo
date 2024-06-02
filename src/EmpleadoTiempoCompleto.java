public class EmpleadoTiempoCompleto extends Empleado{

    private double salarioTotal;

    public EmpleadoTiempoCompleto(String nombre, String numeroIdentificacion, double salarioTotal) {
        super(nombre, numeroIdentificacion);
        this.salarioTotal=salarioTotal;
    }

    @Override
    public double calcularSalario() {
        return (salarioTotal/12);
    }
}
