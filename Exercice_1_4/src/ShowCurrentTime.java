/*
Programme    : ShowCurrentTime.Class
Fichier      : ShowCurrentTime.Java
---------------------------------------------------------------------
Auteur       : MOHAMMED-ISMAIL BEN SALAH
Compilateur  : Eclipse Luna 4.40
Date         : 17/09/2014
Version      : 1.0
---------------------------------------------------------------------
Description  : Il indique le temps actuel avec une prise en compte de la time zone
--------------------------Modifications------------------------------
Version      : 1.0 - DATE
Modification : Version initiale
*********************************************************************/

import java.util.Scanner;

public class ShowCurrentTime 
{
  public static void main(String[] args) 
  {
    long tot_msec;
    long tot_sec;
    long tot_min;
    long tot_hour;
   
    long cur_sec;
    long cur_min;
    long cur_hour;
    
    long timezone;
     
    Scanner input = new Scanner (System.in);
    do
    {
    	System.out.print ("Veuillez entrer la zone de temps : ");
    	timezone = input.nextLong();
    }while (timezone < -12 && timezone > 14);
    input.close();
    
    tot_msec = System.currentTimeMillis();
    tot_sec = tot_msec /1000;  
   
    cur_sec = tot_sec % 60;
    
    tot_min = tot_sec / 60;
    cur_min = tot_min % 60;
    
    tot_hour = tot_min /60;
    cur_hour = tot_hour % 24;
    
    cur_hour += timezone;
    
    System.out.println("L'heure actuelle est " + cur_hour +"::"+cur_min+"::"+cur_sec );
    
  }

}
