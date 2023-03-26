package unidad10;

public class EmpleadoAsalariado extends Empleado10_12
{
	
	private double salarioSemanal;
	
	//constructor
	public EmpleadoAsalariado(String nombre, String apellidoPaterno, String numeroSocial, double salarioSemanal, int fechaNacimiento)
	{
		super(nombre, apellidoPaterno, numeroSocial, fechaNacimiento);

		if(salarioSemanal<0.0)
		{
			throw new IllegalArgumentException("El salario semanal debe res  mayor o igual a 0.0");
		}
		
		this.salarioSemanal=salarioSemanal;

	}
	
	//establecer salario
	public void EstablecerSalarioSemanal(double salarioSemanal)
	{
		if(salarioSemanal<0.0)
		{
			throw new IllegalArgumentException("El salario semanal debe res  mayor o igual a 0.0");
		}
		
		this.salarioSemanal=salarioSemanal;
	}
	
	//obtener salario
	public double obtenerSalarioSemanal()
	{
		return salarioSemanal;
	}
	
	
	//calcula los ingres; sobre escribe el metodo abstracto ingreso en Empleado
	@Override
	public double ingresos()
	{
		return obtenerSalarioSemanal();
	}
	
	@Override
	public String toString()
	{
	return String.format("empleado asalariado: %s%n%s: $%,.2f",super.toString(), "Salario semanal", obtenerSalarioSemanal());
	}

	
	
	

}
