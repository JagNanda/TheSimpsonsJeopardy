package com.prog32758;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		HttpSession ses = request.getSession();
		String name = request.getParameter("username");
		Player player = new Player(name,0);
		ses.setAttribute("player", player);
		
		LoadGame game = new LoadGame();
		game.loadQuestions();
		ses.setAttribute("questions", game.getQuestions());
		
		
		//daily double stuff
		int ddNum1 = (int)(Math.random() * 25);
		int ddNum2 = (int)(Math.random() * 25);
		
		
		game.getQuestions().get(ddNum1).setDailyDouble(true);
		
		//to make sure ddNum2 is not the same as ddNum1
		while(ddNum2 == ddNum1)
		{
			ddNum2 = (int)(Math.random() * 25);
			if(ddNum2 != ddNum1)
			{
				break;
			}
		}
		
		//setting 2 random questions to dd
		game.getQuestions().get(ddNum2).setDailyDouble(true);
		
		System.out.println("ddNum1:" + ddNum1);
		System.out.println("ddNum2:" + ddNum2);
		
		
		request.getRequestDispatcher("GameBoard.jsp").forward(request,response);
		
		//this is for the win page. If this variable is equal to 25, then that means that all questions have been answered
		int numOfQuestionsNotClickable = 0;
		ses.setAttribute("numOfQuestionsNotClickable", numOfQuestionsNotClickable);
		
	}

}
