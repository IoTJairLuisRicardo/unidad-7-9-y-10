package unidad9;


  public class EmpleadoBaseMasComision9_14 extends EmpleadoPorComision9_14 
   {
	  private double salarioBase;

  public EmpleadoBaseMasComision9_14(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,double ventasBrutas, double tarifaComision, double salarioBase)
    { 
    	  super(primerNombre, apellidoPaterno, numeroSeguroSocial, ventasBrutas,tarifaComision);
 
       this.salarioBase = salarioBase;
    }

  public double ingresos() 
    {
       return salarioBase + super.ingresos();
    }

  public String toString()
    {
     return String.format("empleado con salario base más comisión: %s%nsalario base:$%,.2f",super.toString(), salarioBase);
    }
}

