package unidad10;

public class Cubo10_13 {
	
	 private double Lado;

	    public void Cubo(double lado)
	    {
	        this.Lado = lado;
	    }

	    public double obtenerLado() {
	        return Lado;
	    }

	    public void establecerLado(double lado)
	    {
	        this.Lado = lado;
	    }

	    public double obtenerAreaSuperficial() 
	    {
	        return 6 * Lado  * Lado;
	    }

	    public double obtenerVolumen() 
	    {
	        return Lado *  Lado * Lado;
	    }

	     public String obtenerDescripcion() {
	        return String. format("Cubo de lado %.2f", Lado);
	    }

}
