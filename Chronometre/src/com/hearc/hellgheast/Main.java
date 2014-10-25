/*
Programme    : Main.Class
Fichier      : Main.Java
---------------------------------------------------------------------
Auteur       : MOHAMMED-ISMAIL BEN SALAH
Compilateur  : Eclipse Luna 4.40
Date         : 21/10/2014
Version      : 1.0
---------------------------------------------------------------------
Description  : On teste la classe StopWatch
--------------------------Modifications------------------------------
Version      : 1.0 - DATE
Modification : Version initiale
*********************************************************************/

package com.hearc.hellgheast;

public class Main 
{

	public static void main(String[] args) 
	{
	  StopWatch my_time = new StopWatch();
	  //Déclaration du tableau
	  int [] Tab = new int [100000];
	 
	  //Initialisation du tableau
	  for(int i = 0;i<Tab.length;i++)
	  {
		  Tab[i] = (int) (1000*Math.random());
		  if(i%5 == 0)
		  {
			  System.out.printf("\n");
		  }
		  System.out.print(i+":"+Tab[i]+" ");
	  }
	  
	  my_time.start();
	  
	  //Tri par sélection
	  tri_selection(Tab,Tab.length);
	  
	  System.out.printf("\n");
	  for(int i = 0;i<Tab.length;i++)
	  {
		if(i%5 == 0)
		{
	      System.out.printf("\n");
		}
	    System.out.print(i+":"+Tab[i]+" ");
	  }
	  
	  my_time.end();
	  
	  System.out.println("Le temps écoule est " + my_time.getElapsedTime() +" milisecondes"); 
	}

	
	/**
	*   Échange deux éléments d'un tableau
	*
	*   int tab[] :: tableau dans lequel on effectue l'échange
	*   int x :: indice du premier élément
	*   int y :: indice du second élément
	*
	*   return void
	**/
	public static void echanger(int tab[], int x, int y)
	{
	    int tmp;
	    
	    tmp = tab[x];
	    tab[x] = tab[y];
	    tab[y] = tmp;
	}
	
	/**
	*   Renvoie l'indice du plus grand élément du tableau
	*
	*   int tab[] :: tableau dans lequel on effectue la recherche
	*   int taille :: taille du tableau
	*
	*   return int l'indice du plus grand élément
	**/
	 public static int  max(int tab[], int taille)
	{
	    // on considère que le plus grand élément est le premier
	    int i=0, indice_max=0;
	    
	    while(i < taille)
	    {
	        if(tab[i] > tab[indice_max])
	            indice_max = i;
	        i++;
	    }
	    
	    return indice_max;
	}
	
	/**
	*   Trie le tableau donné selon l'algorithme de tri par sélection
	*
	*   int tab[] :: tableau à trier
	*   int taille :: taille du tableau
	*
	*   return void
	**/
	public static void tri_selection(int tab[], int taille)
	{
	    int indice_max;
	    
	    // à chaque tour de boucle, on va déplacer le plus grand élément
	    // vers la fin du tableau, on diminue donc à chaque fois sa taille
	    // car le dernier élément est obligatoirement correctement
	    // placé (et n'a donc plus besoin d'être parcouru/déplacé)

	    for(; taille > 1 ; taille--) // tant qu'il reste des éléments non triés
	    {
	        indice_max = max(tab, taille);
	    
	        echanger(tab, taille-1, indice_max); // on échange le dernier élément avec le plus grand
	    }
	}
	
}


