package unidad10;

import unidad10. Figuras10_13. Figura;
import unidad10. Figuras10_13. FiguraBidimensional;
import unidad10. Figuras10_13. FiguraTridimensional;


public class PruevaFiguras10_13 {
	
	public class Principal {

	public static void main(String[] args) {

	    Figura[] figuras = new Figura[4];

	    Circulo10_13 circulo = new Circulo10_13();
	    circulo.establecerRadio(5);

	    Cuadrado10_13 cuadrado = new Cuadrado10_13();
	    cuadrado.establecerLado(4);

	    Cubo10_13 cubo = new Cubo10_13();
	    cubo.establecerLado(3);

	    Esfera10_13 esfera = new Esfera10_13();
	    esfera.establecerRadio(2);

	    figuras[0] = circulo;
	    figuras[1] = cuadrado;
	    figuras[2] = cubo;
	    figuras[3] = esfera;

	    for (Figura figura : figuras) {
	        System.out.println(figura.obtenerDescripcion());

	        if (figura instanceof FiguraBidimensional) {
	            FiguraBidimensional figuraBidimensional = (FiguraBidimensional) figura;
	            System.out.println("Área: " + figuraBidimensional.obtenerArea());
	        }

	        if (figura instanceof FiguraTridimensional) {
	            FiguraTridimensional figuraTridimensional = (FiguraTridimensional) figura;
	            System.out.println("Área superficial: " + figuraTridimensional.obtenerAreaSuperficial());
	            System.out.println("Volumen: " + figuraTridimensional.obtenerVolumen());
	        }

	        System.out.println();
	    }
	    }
	}

}