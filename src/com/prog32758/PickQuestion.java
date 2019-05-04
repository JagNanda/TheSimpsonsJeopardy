package com.prog32758;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PickQuestion
 */
@WebServlet("/PickQuestion")
public class PickQuestion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PickQuestion() {
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
		int questionIndex = Integer.parseInt(request.getParameter("question")); //the value/index is stored here
		@SuppressWarnings("unchecked")
		ArrayList<Question> questions = (ArrayList<Question>)ses.getAttribute("questions");
		
		Question theQuestion = questions.get(questionIndex);
		theQuestion.setClickable(false);
		ses.setAttribute("theQuestion", questions.get(questionIndex));

		
		if(theQuestion.isDailyDouble())
		{
			request.getRequestDispatcher("ddAmount.jsp").forward(request,response);
		}
		else
		{
			request.getRequestDispatcher("Question.jsp").forward(request, response);
		}
		
	}


}
