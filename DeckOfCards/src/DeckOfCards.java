
/*
Programme    : DeckOfCards.Class
Fichier      : DeckOfCards.Java
---------------------------------------------------------------------
Auteur       : MOHAMMED-ISMAIL BEN SALAH
Compilateur  : Eclipse Luna 4.40
Date         : 06/10/2014
Version      : 1.0
---------------------------------------------------------------------
Description  : Exercice 7.4 Deck de cartes
--------------------------Modifications------------------------------
Version      : 1.0 - DATE
Modification : Version initiale
*********************************************************************/
import java.util.Scanner;

public class DeckOfCards 
{
  public static void main(String[] args)
  {
    int [] Deck = new int [52];
    String[] Type = {"Pique","Coeur","Carreau","Trèfle"};
    String[] Valeur = {"As","2","3","4","5","6","7","8","9","10","Valet","Dame","Roi"};
    int i,temp,index,nb_cartes;
    
    //On initialise le deck de cartes
    for(i=0;i<Deck.length;i++)
    {
      Deck[i]=i;
    }
    
    //On mélange le deck
    for(i=0;i<Deck.length;i++)
    { 	
      index = (int)(Math.random()*Deck.length);
      
      //Mélange des cartes
      temp = Deck[i];
      Deck[i]=Deck[index];
      Deck[index]=Deck[i];
    }
    
    //On indique le nombre de cartes à tirer
    Scanner input = new Scanner(System.in);
    System.out.print("Veuillez rentrer le nombre de cartes à tirer : ");
    
    do
    {
      nb_cartes = input.nextInt();	
    }while(nb_cartes<=0);
    
    for(i=0;i<nb_cartes;i++)
    {
      String s_type = Type[Deck[i]/13];
      String s_val  = Valeur[Deck[i]%13];
      System.out.println("Carte : "+s_val+" de "+s_type);
    }
    
    
  }

}
