package ejercicio05;

public class Oficina {
	private int empleadosMaximos;
	private Empleado[] empleados;
	
	public Oficina(int empleadosMaximos) {
		this.empleadosMaximos = empleadosMaximos;
		empleados = new Empleado[empleadosMaximos];
	}
	
	public void anyadirEmpleadoFijo(String nombre, double sueldoBase, double dineroRecaudadoVentas, double porcentajeImpuestos) {
		int UNO = 1;
		EmpleadoFijo eF = new EmpleadoFijo(nombre, sueldoBase, dineroRecaudadoVentas, porcentajeImpuestos);
		empleados[Empleado.empleadosGenerados-UNO] = eF;		
	}
	public void anyadirEmpleadoComision(String nombre, double sueldoBase, double dineroRecaudadoVentas, double porcentajeIncentivo) {
		int UNO = 1;
		EmpleadoAComision eC = new EmpleadoAComision(nombre, sueldoBase, dineroRecaudadoVentas, porcentajeIncentivo);
		empleados[Empleado.empleadosGenerados-UNO] = eC;		
	}

	public Empleado[] getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Empleado[] empleados) {
		this.empleados = empleados;
	}
	
	
}
