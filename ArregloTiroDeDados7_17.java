package unidad7;

import java.util.Random;

public class ArregloTiroDeDados7_17 {

	public static void main(String[] args) 
	{
		Random numeroAleatorio = new Random();
		
		int dado1,dado2;
		
		
		int matrizEntera[][]= {{0,1,2,3,4,5,6},
				               {1,2,3,4,5,6,7},
                               {2,3,4,5,6,7,8},
		                       {3,4,5,6,7,8,9},
		                       {4,5,6,7,8,9,10},
		                       {5,6,7,8,9,10,11},
		                       {6,7,8,9,10,11,12}};
		System.out.print("POSIBLES SUMAS DEL DADO"
				+ "\n\n"+matrizEntera[0][0]+"  "+matrizEntera[0][1]+"  "+matrizEntera[0][2]+"  "+matrizEntera[0][3]+"  "+matrizEntera[0][4]+"   "+matrizEntera[0][5]+"   "+matrizEntera[0][6]
				+   "\n"+matrizEntera[1][0]+"  "+matrizEntera[1][1]+"  "+matrizEntera[1][2]+"  "+matrizEntera[1][3]+"  "+matrizEntera[1][4]+"   "+matrizEntera[1][5]+"   "+matrizEntera[1][6]
			    +   "\n"+matrizEntera[2][0]+"  "+matrizEntera[2][1]+"  "+matrizEntera[2][2]+"  "+matrizEntera[2][3]+"  "+matrizEntera[2][4]+"   "+matrizEntera[2][5]+"   "+matrizEntera[2][6]
	    		+   "\n"+matrizEntera[3][0]+"  "+matrizEntera[3][1]+"  "+matrizEntera[3][2]+"  "+matrizEntera[3][3]+"  "+matrizEntera[3][4]+"   "+matrizEntera[3][5]+"   "+matrizEntera[3][6]
		   		+   "\n"+matrizEntera[4][0]+"  "+matrizEntera[4][1]+"  "+matrizEntera[4][2]+"  "+matrizEntera[4][3]+"  "+matrizEntera[4][4]+"   "+matrizEntera[4][5]+"   "+matrizEntera[4][6]
			 	+   "\n"+matrizEntera[5][0]+"  "+matrizEntera[5][1]+"  "+matrizEntera[5][2]+"  "+matrizEntera[5][3]+"  "+matrizEntera[5][4]+"   "+matrizEntera[5][5]+"  "+matrizEntera[5][6]
			 	+   "\n"+matrizEntera[6][0]+"  "+matrizEntera[6][1]+"  "+matrizEntera[6][2]+"  "+matrizEntera[6][3]+"  "+matrizEntera[6][4]+"  "+matrizEntera[6][5]+"  "+matrizEntera[6][6]);
		
		
		 dado1=numeroAleatorio.nextInt(6);
		 System.out.println("\n\nnumero obtenido: "+dado1);

		 
		 dado2=numeroAleatorio.nextInt(6);
		 
		 
		 System.out.println("numero obtenido: "+dado2);
		int suma;
		suma=dado1+dado2;
		 System.out.println("\nLa suma de los dos lados es : "+ suma);

		
	}

}
