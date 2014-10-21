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
	  
	  my_time.start();
	  for(long i=0;i<1000000000;i++){}
	  my_time.end();
	  
	  System.out.println("Le temps écoule est " + my_time.getElapsedTime() +" milisecondes"); 
	}

}
