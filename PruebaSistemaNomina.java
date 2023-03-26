package unidad10;

public class PruebaSistemaNomina {

	public static void main(String[] args) 
	{
		// crea objetos de las subclases
		  Fecha fechaNacimieto= new Fecha(1, 2,2000);

		  
		 EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Jair", "olivarse", "19530658", 800.00, 1);
		  EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("luis", "Mendez", "19530659", 16.75, 40, 2/2/2001);
		  
		  EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Ricardo", "versunza", "19530660", 10000, .06, 3/3/2003);
		  
		  EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision ("bob", "lewis", "444-444-444", 5000, .04, 300, 4/4/2004);
		  
		  

		  	System.out.println("Empleados procesados por separado:\n");

		  	System.out.printf("%n%s%n%s: $%,.2f%n%n",empleadoAsalariado, "ingresos", empleadoAsalariado.ingresos(),fechaNacimieto);

		  	System.out.printf("%s%n%s: $%,.2f%n%n",empleadoPorHoras, "ingresos", empleadoPorHoras.ingresos());
		  	
		  	System.out.printf("%s%n%s: $%,.2f%n%n",empleadoPorComision, "ingresos", empleadoPorComision.ingresos());
	
		  	System.out.printf("%s%n%s: $%,.2f%n%n",empleadoBaseMasComision,"ingresos", empleadoBaseMasComision.ingresos());
		
		// crea un arreglo Empleado de cuatro elementos
		  	Empleado10_12[] empleados = new Empleado10_12[4];
		
		// inicializa el arreglo con objetos Empleado
		  empleados[0] = empleadoAsalariado;
		  empleados[1] = empleadoPorHoras;
		  empleados[2] = empleadoPorComision;
		  empleados[3] = empleadoBaseMasComision;
		
	 System.out.println("Empleados procesados en forma polimorfica:\n");
	
	 // procesa en forma genérica a cada elemento en el arreglo de empleados
		
	 	for (Empleado10_12 empleadoActual : empleados)
		 {
	 		System.out.println(empleadoActual);  // invoca a toString
		
	 		// determina si el elemento es un EmpleadoBaseMasComision
	 			if (empleadoActual instanceof EmpleadoBaseMasComision)
	 				{
	 					// conversión descendente de la referencia de Empleado
	 					// a una referencia de EmpleadoBaseMasComision
	 					EmpleadoBaseMasComision empleado =(EmpleadoBaseMasComision) empleadoActual; 
	 					empleado.establecerSalarioBase(1.10 * empleado.obtenerSalarioBase());
	 		
	 		
	 					System.out.printf("el nuevo salario base con 10%% de aumento es: $%,.2f%n",empleado.obtenerSalarioBase());
	 				} // fin de if
	 				
	 			System.out.printf("ingresos $%,.2f%n%n", empleadoActual.ingresos());
	 	  } // fin de for
	 				
	 	
	 	// obtiene el nombre del tipo de cada objeto en el arreglo de empleados
	 		for (int j = 0; j < empleados.length; j++)
	 			{
	 				System.out.printf("El empleado %d es un %s%n", j,empleados[j].getClass().getName());
	 			 } // fin de main
	 				

	}		
	

}
