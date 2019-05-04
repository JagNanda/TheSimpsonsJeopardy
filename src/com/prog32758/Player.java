package com.prog32758;

import java.io.Serializable;

public class Player implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	int score;
	
	public Player()
	{
		name="";
		score=0;
	}
	
	public Player(String name, int score)
	{
		this.name = name;
		this.score = score;
	}

	
	public String getName()
	{
		return name;
	}

	
	public void setName(String name)
	{
		this.name = name;
	}

	
	public int getScore()
	{
		return score;
	}

	
	public void setScore(int score)
	{
		this.score = score;
	}
	
	
	
}
