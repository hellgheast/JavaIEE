/*
Programme    : CalculTaxe.Class
Fichier      : CalculTaxe.Java
---------------------------------------------------------------------
Auteur       : MOHAMMED-ISMAIL BEN SALAH
Compilateur  : Eclipse Luna 4.40
Date         : 23/09/2014
Version      : 1.0
---------------------------------------------------------------------
Descript0ion  : Il indique les taxes suivant la classe sociale
--------------------------Modifications------------------------------
Version      : 1.0 - DATE
Modification : Version initiale
*********************************************************************/
import java.util.Scanner;

public class CalculTaxe 
{

  public static void main(String[] args) 
  {
    int statut;
    int impot;
    double taxe = 0;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Veuillez indiquer le statut social");
	System.out.println("0 : Célibataire 1: Couple qui remplissent ensemble 2: Couple qui rempli séparément 3:Tête de la maison");
	
	statut = input.nextInt();
	
	System.out.println("Veuillez indiquer votre gain durant l'année");
	
	do
	{
	impot = input.nextInt();
	}while(impot < 0);
	
	if (statut == 0)
	{
		if (impot < 8351)
		{
		  taxe = 0.1*(double)impot;	
		}
		else if (impot < 33951)
		{
		  taxe = 0.15*(double)impot;
		}
		else if (impot < 82251)
		{
		  taxe = 0.25*(double)impot;
		}
		else if (impot < 171551)
		{
		  taxe = 0.28*(double)impot;
		}
		else if (impot < 372951) 
		{
		  taxe = 0.33*(double)impot;
		}
		else
		{
		  taxe = 0.35*(double)impot;	
		}
		
	}
	else if (statut == 1)
	{
		
	}
	else if (statut == 2)
	{
		
	}
	else if (statut == 3)
	{
		
	}
	else
	{
		System.out.println("Statut non défini.");
	}
	

	System.out.println("La valeur de l'impôt vaut "+ taxe);	
	input.close();
  }

}
