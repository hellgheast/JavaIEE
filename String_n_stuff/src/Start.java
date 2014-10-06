/*
Programme    : Start.Class
Fichier      : Start.Java
---------------------------------------------------------------------
Auteur       : MOHAMMED-ISMAIL BEN SALAH
Compilateur  : Eclipse Luna 4.40
Date         : 23/09/2014
Version      : 1.0
---------------------------------------------------------------------
Descript0ion  : On teste différent trucs avec les Strings
--------------------------Modifications------------------------------
Version      : 1.0 - DATE
Modification : Version initiale
*********************************************************************/
import java.util.Scanner;

public class Start 
{
  public static void main(String[] args) 
  {
	/*
    String tata = "Welcome to Java";
    String nom_prenom;
    
    Scanner input = new Scanner(System.in);
    nom_prenom = input.nextLine();
    nom_prenom = nom_prenom.concat(" "+input.nextLine());
    
    System.out.println("Mon nom et prénom est : "+nom_prenom);
    */

    String base1,base2;
	String number,final_number="";
	int nombre = 0;
	
	Scanner input = new Scanner(System.in);
	number = input.nextLine();

	// Partie de test de l'entrée 
	do
	{
		base1 = input.nextLine();	
	}while (base1.equals("dec")== false && base1.equals("bin")==false && base1.equals("hex")==false);
	
	do
	{
		base2 = input.nextLine();	
	}while (base2.equals("dec")== false && base2.equals("bin")==false && base2.equals("hex")==false);
	
	input.close();
	

	//Partie de test 1
	if (base1.equals("dec"))
	{
	  nombre = Integer.parseInt(number,10);
	}
	else if (base1.equals("bin"))
	{
	  nombre = Integer.parseInt(number,2);	
	}
	else if (base1.equals("hex"))
	{
     nombre = Integer.parseInt(number,16);
	}
	
	//Partie de test
	
	if (base2.equals("dec"))
	{
	  final_number = Integer.toString(nombre, 10);
	}
	else if (base2.equals("bin"))
	{
	  final_number = Integer.toString(nombre,2);	
	}
	else if (base2.equals("hex"))
	{
     final_number = Integer.toString(nombre, 16);
	}
	
	
	//Programme d'affichage
	System.out.printf("La valeur %s en %s vaut %s en %s",number,base1,final_number,base2);
	
	
  }

}
