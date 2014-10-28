
/*
Programme    : FarenheitCelsius.Class
Fichier      : FarenheitCelsius.Java
---------------------------------------------------------------------
Auteur       : MOHAMMED-ISMAIL BEN SALAH
Compilateur  : Eclipse Luna 4.40
Date         : 16/09/2014
Version      : 1.0
---------------------------------------------------------------------
Description  : Il convertit les farenheits en celsius
--------------------------Modifications------------------------------
Version      : 1.0 - DATE
Modification : Version initiale
*********************************************************************/

import java.util.Scanner;

class FarenheitCelsius 
{
  public static void main(String[] args) 
  {
	  //Variables 
	  double Faren_temp;
	  double Celsius_temp;
	  
	  System.out.print("Programme de conversion de Farenheit en Celsius\n");
	  System.out.print("Veuillez rentrer la valeur en Farenheit de la température : ");
	  Scanner input = new Scanner(System.in);
	  
	  Faren_temp = input.nextDouble();
	  
	  Celsius_temp = (5.0/9)*(Faren_temp - 32);
  
	  System.out.println("La température en Celsius vaut : " + Celsius_temp);
	  input.close();
  }

}
