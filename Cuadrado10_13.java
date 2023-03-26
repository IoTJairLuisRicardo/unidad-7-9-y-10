package unidad10;

public class Cuadrado10_13 extends Figuras10_13{
	
	  private double lado;

	     public void Cuadrado(double lado) {
	        this.  lado = lado;
	    }

	    public double obtenerLado() 
	    {
	        return lado;
	    }

	    public void establecerLado(double lado) 
	    {
	        this.lado = lado;
	    }

	    public double obtenerÁrea() {
	        return  lado * lado;
	    }

	     public String obtenerDescripcion() {
	        return String. format("Cuadrado de lado %.2f", lado);
	    }

}
