package unidad9;

public class PruebaEmpleadoPorHoras9_15 {

	public static void main(String[] args) {
		
		EmpleadoPorHoras9_15 empleado1=new EmpleadoPorHoras9_15("luis", "mendez", "10000", 100, 42);
		
		
		System.out.print("Empleado por comision.\n"
        		+          "Nombre:                    "+empleado1.obtenerPrimerNombre()+"\n"
        				 + "Primer apellido:           "+empleado1.obtenerApellidoPaterno()+"\n"
        				 + "Numero Socuial:            "+empleado1.obtenerNumeroSeguroSocial()+"\n"
                         + "Sueldo Por Hora:           "+empleado1.obtenerSueldo()+"\n"
                         + "Horas Trabajadas:          "+empleado1.obtenerHoras()+"\n"
                         + "Sueldo Total:              "+empleado1.ingresos());
		
		empleado1.establecerHoras(50); 
		empleado1.establecerSueldo(20);
		System.out.printf("%n%s:%n%n%s%n", "Información actualizada del empleado obtenida por toString", empleado1.toString());
		System.out.printf("Los ingresos son: $%,.2f%n", empleado1.ingresos());

	}

}
