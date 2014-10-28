/*
Programme    : StopWatch.Class
Fichier      : StopWatch.Java
---------------------------------------------------------------------
Auteur       : MOHAMMED-ISMAIL BEN SALAH
Compilateur  : Eclipse Luna 4.40
Date         : 21/10/2014
Version      : 1.0
---------------------------------------------------------------------
Description  : On fait la classe chronométre
--------------------------Modifications------------------------------
Version      : 1.0 - DATE
Modification : Version initiale
*********************************************************************/

package com.hearc.hellgheast;

public class StopWatch 
{
	//Attribut
	private long startTime;
	private long endTime;
	
	//Constructeur
	StopWatch() 
	{
	  startTime = System.currentTimeMillis();
	}
	
	//Méthodes 
	
	public void start()
	{
	  startTime = System.currentTimeMillis();
	}
	
	public void end()
	{
		endTime = System.currentTimeMillis();
	}
	
	//Getters
	public long getStart()
	{
	  return startTime;	
	}
	
	public long getEnd()
	{
	  return endTime;
	}
	
	public long getElapsedTime()
	{
		return endTime - startTime;
	}
}
