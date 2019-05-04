package com.prog32758;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AnswerSelect
 */
@WebServlet("/AnswerSelect")
public class AnswerSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnswerSelect() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession ses = request.getSession();
		
		//answer picked in question.jsp
		String answerPicked = request.getParameter("answer");
		//the question that was answered
		Question theQuestion = (Question)ses.getAttribute("theQuestion");
		String correctAnswer = theQuestion.getCorrectAnswer();
		Player player = (Player)ses.getAttribute("player");
		int score = player.getScore();
		int questionValue =  theQuestion.getValue();
		
		//if answer picked = correct answer then add to score
		if(answerPicked.equals(correctAnswer))
		{
			//if daily double, 
			if(theQuestion.isDailyDouble())
			{				
				//if daily double correct, add amount bet to score
				int ddAmount = Integer.parseInt((String)ses.getAttribute("ddAmount"));
				score += ddAmount;
//				score += questionValue;
//				score += questionValue;		
			}
			else
			{	
				score += questionValue;
			}
		}
		else if(answerPicked.equals("skip"))
		{
			System.out.println("score unchanged");
		}
		else
		{
			//if daily double, 
			if(theQuestion.isDailyDouble())
			{				
				//if daily double incorrect, deduct amount bet to score
				int ddAmount = Integer.parseInt((String)ses.getAttribute("ddAmount"));
				score -= ddAmount;
//				score -= questionValue;
//				score -= questionValue;
			}
			else
			{
				score -= questionValue;
			}
		}
		
		player.setScore(score);
			

		theQuestion.setClickable(false);
		
		
		//check if all questions have been answered
		int numOfQuestionsNotClickable = (int)ses.getAttribute("numOfQuestionsNotClickable");
		 numOfQuestionsNotClickable += 1;
		ses.setAttribute("numOfQuestionsNotClickable", numOfQuestionsNotClickable);
		
		if(numOfQuestionsNotClickable == 25)
		{
			request.getRequestDispatcher("Win.jsp").forward(request,response);
		}
		
		
		request.getRequestDispatcher("GameBoard.jsp").forward(request, response);
		
		
		
	}

}
