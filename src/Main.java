public class Main {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[2];

        empleados[0]=new EmpleadoTiempoCompleto("Nombre", "Lolpa", 4545);
        empleados[1]=new EmpleadoTiempoMedio("NOmbre", "Lolpo", 23, 543);

        for(Empleado empleado:empleados){
            System.out.println("Empleado: "+empleado.getNombre()+" - Salario mensual: $"+empleado.calcularSalario());
        }
    }
}