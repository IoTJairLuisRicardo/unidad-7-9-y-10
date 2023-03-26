package unidad9;


public class PruebaEmpleadoPorComision9_14 {

	public static void main(String[] args) 
	{

		EmpleadoPorComision9_14 empleado1=new EmpleadoPorComision9_14("jair", "olivares", "12345", 5, 10);
		
		System.out.print("Empleado por comision.\n"
        		+          "Nombre:                    "+empleado1.obtenerPrimerNombre()+"\n"
        				 + "Primer apellido:           "+empleado1.obtenerApellidoPaterno()+"\n"
        				 + "Numero Socuial:            "+empleado1.obtenerNumeroSeguroSocial()+"\n"
                         + "Sueldo Mas Comision:       "+empleado1.ingresos());

	}

}
