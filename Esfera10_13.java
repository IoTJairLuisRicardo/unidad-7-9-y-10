package unidad10;

public class Esfera10_13 extends Figuras10_13{
	
	private double radio;

     public void Esfera (double radio) 
     {
        this.  radio = radio;
     }

    public double obtenerRadio() 
    {
        return radio; 
    }

    public void establecerRadio(double radio) 
    {
        this.  radio = radio;
    }

    public double obtenerAreaSuperficial() {
        return 4 * Math. PI * radio  * radio;
    }

    public double obtenerVolumen() {
        return 4.0 / 3.0 * Math. PI * radio * radio  * radio ;
    }

     public String obtenerDescripcion() {
        return String. format("Esfera de radio %.2f", radio);
    }

}
