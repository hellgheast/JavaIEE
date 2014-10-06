import java.util.Scanner;

/*
Programme    : CalculMoyenne.Class
Fichier      : CalculMoyenne.Java
---------------------------------------------------------------------
Auteur       : MOHAMMED-ISMAIL BEN SALAH
Compilateur  : Eclipse Luna 4.40
Date         : 16/09/2014
Version      : 1.0
---------------------------------------------------------------------
Description  : Il calcule la moyenne entre trois flottants
--------------------------Modifications------------------------------
Version      : 1.0 - DATE
Modification : Version initiale
*********************************************************************/


public class CalculMoyenne 
{
  public static void main(String[] args) 
  {
      
    //Variables
    double value[] = new double[3] ;  
    double moyenne;
	
    //Programme
	System.out.println("Programme de calcul de moyenne");
	
	Scanner input = new Scanner(System.in);
	System.out.print("Veuillez rentrer les trois nombres :");
	
	value[0] = input.nextDouble();
	value[1] = input.nextDouble();
	value[2] = input.nextDouble();
	
	moyenne = (value[0]+value[1]+value[2])/3;
	
	System.out.print("\nLa moyenne de " + value[0] + " " + value[1]+ " " + value[2] + " vaut : " + moyenne);
	input.close();
	
  }

}
