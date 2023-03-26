package unidad10;

public class Empleado10_12
{

	private final String nombre;
	private final String apellidoPaterno;
	private final String numeroSocial;
	private final int fechaNacimiento;
	//constructor
	public Empleado10_12 (String nombre, String apellidoPaterno, String numeroSocial, int fechaNacimiento)
	{
		this.nombre=nombre;
		this.apellidoPaterno=apellidoPaterno;
		this.numeroSocial=numeroSocial;
		this.fechaNacimiento = fechaNacimiento;
		
	}
	
	//obtener................................ 
	public String obtenerNombre()
	{
		return nombre;
	}
	public String obtenerApellidoPaterno()
	{
		return apellidoPaterno;
	}
	public String obtenerNumeroSocial()
	{
		return numeroSocial;
	}
	public int obtenerfechaNacimiento()
	{
		return fechaNacimiento;
		
	}
	
	@Override
	public String toString()
	{
		return String.format("%s %s%nnumero de seguro social: %s",obtenerNombre(), obtenerApellidoPaterno(),obtenerNumeroSocial(),obtenerfechaNacimiento());
	}

	public double ingresos() {
		return 0;
	} 
		
	

	
	
	
}
