package unidad10;

public class Figuras10_13 
{
	
	public abstract class Figura
	{
	    public abstract String obtenerDescripcion();
	}

	public abstract class FiguraBidimensional extends Figuras10_13 {
	    public abstract double obtenerArea();
	}

	public abstract class FiguraTridimensional extends Figuras10_13 {
	    public abstract double obtenerAreaSuperficial();
	    public abstract double obtenerVolumen();
	}

}
