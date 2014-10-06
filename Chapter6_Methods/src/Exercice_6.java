/*
Programme    : Exercice_6.Class
Fichier      : Exercice_6.Java
---------------------------------------------------------------------
Auteur       : MOHAMMED-ISMAIL BEN SALAH
Compilateur  : Eclipse Luna 4.40
Date         : 30/09/2014
Version      : 1.0
---------------------------------------------------------------------
Descript0ion  : On teste différent trucs avec les tableaux et les méthodes
--------------------------Modifications------------------------------
Version      : 1.0 - DATE
Modification : Version initiale
*********************************************************************/

public class Exercice_6
{

	public static void main(String[] args) 
	{
	  double[] myTab = new double[]  {1.0,2.0,3.0};
	  
	  System.out.println("La somme de 0 à 10 est : " + Calculate(0, 10));
      	 
	}
	
	public static int Calculate(int begin_nb,int end_nb)
	{
	  int result=0,i;	
	  
	  for(i=begin_nb;i<=end_nb;i++)
	  {
		  result += i;
	  }
	  
	  return result;
	}

}

