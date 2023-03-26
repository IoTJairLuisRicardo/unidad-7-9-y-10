package unidad10;

public class Circulo10_13 extends Figuras10_13{

	 private double radio;

	    public void Circulo(double radio) {
	        this.  radio = radio;
	    }

	   public double obtenerRadio() {
	        return radio;

	   }

	    public void establecerRadio(double radio ) {
	        this .  radio = radio;
	    }

	    public double obtenerÁrea() {
	        return Math. PI * radio  * radio;
	    }

	     public String obtenerDescripcion() {
	        return String. format("Círculo de radio %.2f", radio);
	    }
}
