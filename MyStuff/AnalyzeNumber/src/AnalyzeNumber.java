
/*
Programme    : AnalyzeNumber.Class
Fichier      : AnalyzeNumber.Java
---------------------------------------------------------------------
Auteur       : MOHAMMED-ISMAIL BEN SALAH
Compilateur  : Eclipse Luna 4.40
Date         : 06/10/2014
Version      : 1.0
---------------------------------------------------------------------
Description  : Exercice 7.3 Analyse de Nombres
--------------------------Modifications------------------------------
Version      : 1.0 - DATE
Modification : Version initiale
*********************************************************************/

import java.util.Scanner;

public class AnalyzeNumber 
{
  public static void main(String[] args) 
  {
    int nbValeurs;
    double moyenne;
    double somme=0.0;
    int i=0;
    int compteur=0;
    
    Scanner input = new Scanner(System.in);
    System.out.printf("Veuillez entrer le nombre de valeurs : ");
    nbValeurs = input.nextInt();
    
    double [] TableauValeurs = new double [nbValeurs];
    
    System.out.printf("Veuillez entrer les valeurs : ");
    
    for (i = 0;i<nbValeurs;i++)
    {
      TableauValeurs[i] = input.nextDouble();
      somme += TableauValeurs[i];
    }
    
    moyenne = somme / nbValeurs;
    
    for(i=0;i<nbValeurs;i++)
    {
      if(TableauValeurs[i]>moyenne)
      {
        compteur++;	  
      }
    }
    
    System.out.println("La valeur de la moyenne vaut "+moyenne);
    System.out.println("Le nombre de chiffres au dessus de la moyenne est "+compteur);
    
    
    
  }

}
