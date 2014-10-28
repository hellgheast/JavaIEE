import java.util.Scanner; // On importe la classe Scanner

/*
Programme    : SimpleProgram.Class
Fichier      : SimpleProgram.Java
---------------------------------------------------------------------
Auteur       : MOHAMMED-ISMAIL BEN SALAH
Compilateur  : Eclipse Luna 4.40
Date         : 16/09/2014
Version      : 1.0
---------------------------------------------------------------------
Description  : Décrire ce que fait votre programme
--------------------------Modifications------------------------------
Version      : 1.0 - DATE
Modification : Version initiale
*********************************************************************/

public class SimpleProgram 
{
  public static void main (String[] args )
  {
	//Variables 
	double radius;
	double area;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Veuillez rentrer le rayon du cercle : ");
	
	//Sélection du rayon 
	radius = input.nextDouble();
	input.close();
	
	//Calcul du rayon
	area = radius * 3.14;
	
	//Affichage du résultat
	System.out.println("Rayon vaut " + radius + "\nL'aire vaut " + area);
	
  }
}
