package com.prog32758;

import java.io.Serializable;

public class Question implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String category;
	private int value;
	private String question;
	private String answer1;
	private String answer2;
	private String answer3;
	private String answer4;
	private String correctAnswer;
	private boolean clickable = true;
	private boolean dailyDouble = false;
	
	
	public Question()
	{
		
	}

	public Question(String category, int value, String question, String answer1, String answer2, String answer3,
			String answer4, String correctAnswer)
	{
		this.category = category;
		this.value = value;
		this.question = question;
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.answer3 = answer3;
		this.answer4 = answer4;
		this.correctAnswer = correctAnswer;
		this.clickable = true;
		this.dailyDouble = false;
	}

	public String getCategory()
	{
		return category;
	}
	
	public void setCategory(String category)
	{
		this.category = category;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public void setValue(int value)
	{
		this.value = value;
	}
	
	public String getQuestion()
	{
		return question;
	}
	
	public void setQuestion(String question)
	{
		this.question = question;
	}
	
	public String getAnswer1()
	{
		return answer1;
	}
	
	public void setAnswer1(String answer1)
	{
		this.answer1 = answer1;
	}
	
	public String getAnswer2()
	{
		return answer2;
	}
	
	public void setAnswer2(String answer2)
	{
		this.answer2 = answer2;
	}
	
	public String getAnswer3()
	{
		return answer3;
	}
	
	public void setAnswer3(String answer3)
	{
		this.answer3 = answer3;
	}
	
	public String getAnswer4()
	{
		return answer4;
	}
	
	public void setAnswer4(String answer4)
	{
		this.answer4 = answer4;
	}
	
	public String getCorrectAnswer()
	{
		return correctAnswer;
	}
	
	public void setCorrectAnswer(String correctAnswer)
	{
		this.correctAnswer = correctAnswer;
	}

	
	public boolean isClickable()
	{
		return clickable;
	}

	
	public void setClickable(boolean isClickable)
	{
		this.clickable = isClickable;
	}

	
	public boolean isDailyDouble()
	{
		return dailyDouble;
	}

	
	public void setDailyDouble(boolean dailyDouble)
	{
		this.dailyDouble = dailyDouble;
	}
	
	
	
	
	
	
}
