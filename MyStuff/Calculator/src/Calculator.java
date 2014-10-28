/*
Programme    : Start.Class
Fichier      : Start.Java
---------------------------------------------------------------------
Auteur       : MOHAMMED-ISMAIL BEN SALAH
Compilateur  : Eclipse Luna 4.40
Date         : 30/09/2014
Version      : 1.0
---------------------------------------------------------------------
Descript0ion  : On teste les arguments 
--------------------------Modifications------------------------------
Version      : 1.0 - DATE
Modification : Version initiale
*********************************************************************/



public class Calculator 
{

	public static void main(String[] args) 
	{
		  int nb1,nb2,result = 0;
		  
		  System.out.println("La commande est : "+ args[0] +" "+ args[1] +" " + args[2]);
		  
		  System.out.println("L'opération est :" + args[1].charAt(0) );
		  
		  switch (args[1].charAt(0))
		  {
		     case '+':
		     {
		    	 
		    	 
		       nb1 = Integer.parseInt(args[0]);
		       nb2 = Integer.parseInt(args[2]);
		       
		       result = nb1+nb2;
		       break;	 
		     }
		     
		     case '-':
		     {
		       nb1 = Integer.parseInt(args[0]);
			   nb2 = Integer.parseInt(args[2]);
			   
			   result = nb1 - nb2;
		       break;
		     }
		     
		     case '*':
		     {
		       nb1 = Integer.parseInt(args[0]);
			   nb2 = Integer.parseInt(args[2]);
				   	
		       result = nb1 * nb2;	 
		       break;
		     }
		     
		     case '/':
		     {
		       nb1 = Integer.parseInt(args[0]);
			   nb2 = Integer.parseInt(args[2]);
			   
			   result = nb1 / nb2;	 
		       break;
		     }
		  }
		  
		  System.out.printf("Le résultat est " + result);
	}

}
