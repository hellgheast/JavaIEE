
/*
Programme    : Main.Class
Fichier      : Main.Java
---------------------------------------------------------------------
Auteur       : MOHAMMED-ISMAIL BEN SALAH
Compilateur  : Eclipse Luna 4.40
Date         : 06/10/2014
Version      : 1.0
---------------------------------------------------------------------
Descript0ion  : Exercice 1.2 
--------------------------Modifications------------------------------
Version      : 1.0 - DATE
Modification : Version initiale
*********************************************************************/




public class Main 
{

	int arg_count;
	String[] name;
	//J'ajoute des commentaires dans mon code
	
	public static void main(String[] args) 
	{
	  String[] name= new String[args.length];//On cr�e un tableau d'une taille dynamique
	  
      for(int i = 0; i<args.length;i++)
      {
    	 name[i] = args[i]; 
      }
      
      System.out.println("Nom Fourni :"+PrintString(args));
      
      for(int i = 0; i<args.length;i++)
      {
    	 if(i==0)
         {
    	   name[i] = properCapitalize(name[i]);
    	 }
    	 if(i== args.length-1)
    	 {
    	  name[i] = properCapitalize(name[i]);
    	 }

      }
      
      System.out.println("Nom Corrig� :"+PrintString(name));
      
	}

	
	// Converti de fa�on appropri�e les lettres
	// Majuscules/minuscules d'un �l�ment d'un nom
	private static String properCapitalize(String elem) 
	{
	  char temp;
	  String correct,s_temp;
	  
	  
	  temp = Character.toUpperCase(elem.charAt(0)); //Conversion de la lettre en Majuscule
	  s_temp = elem.substring(1, elem.length());	//D�coupage de la Ch�ine
	  correct = Character.toString(temp) + s_temp.toLowerCase(); //Concat�nation
	  
	  return correct;
	}
	

	
	// Affiche sur une ligne les �l�ments d'un nom
	public static String PrintString(String[] array) 
	{
	  String res = "";
	  for (int i=0; i<array.length; i++)
	  {
	    if (i>=0)
	    {
	      res += " ";
	      res += array[i];
	    }
	  }
	  
	  return res;
	}
	

}
