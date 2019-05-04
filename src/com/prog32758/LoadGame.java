package com.prog32758;

import java.util.ArrayList;

public class LoadGame
{
	ArrayList<Question> questions;
	
	public LoadGame()
	{
		questions = new ArrayList<Question>();
	}
	
	public void loadQuestions()
	{
		questions.add(new Question("Homer",100,"What is Homer's favourite drink?","Water","Soda","Duff Beer","Wine","Duff Beer"));
		questions.add(new Question("Bart",100,"Bart's favourite catchphrase is","D'oh!","Ay Caramba!","Eat my pants!","Donuts!","Ay Caramba!"));
		questions.add(new Question("Other characters",100,"Who runs the Kwik-E-Mart","Apu","Lovejoy","Flanders","Comic Book Guy","Apu"));
		questions.add(new Question("Springfield",100,"Springfield has a strong rivalry against which city?","Browneville","Shelbyville","Oakham City","Alaska","Shelbyville"));
		questions.add(new Question("Episodes",100,"The one who shot Mr.Burns in the episode 'Who Shot Mr.Burns' is","Carl","Moe","Chief Wiggum","Maggie","Maggie"));
		
		questions.add(new Question("Homer",200,"What is Homer's full name?","Homer Gaylord Simpson","Homer Jay Simpson","Homer Heuward Simpson","Homer H. Simpson","Homer Jay Simpson"));
		questions.add(new Question("Bart",200,"Bart's favourite television celebrity is","Scratchy","Itchy","Krusty","Duffman","Krusty"));
		questions.add(new Question("Other Characters",200,"Who is Mr. Burns assissant","Barney","Smithers","Burns Jr.","Homer","Smithers"));
		questions.add(new Question("Springfield",200,"The name of the largest church in Springfield is","The Springfield Church","The First Church of Springfield","Waterway Church","The Only Church","The First Church of Springfield"));
		questions.add(new Question("Episodes",200,"In the episode 'Bart to the Future' what job does Lisa have?","Musician","Doctor","Astronaut","President of the United States","President of the United States"));
		
		questions.add(new Question("Homer",300,"The voice actor for Homer is...","Dan Castellaneta","Joshua Chambers","Stephen Simmons","Naphtali Hutauruk","Dan Castellaneta"));
		questions.add(new Question("Bart",300,"What does bart do in the beginning of the show intro?","Write on the blackboard","Read comics","Fly","Fight","Write on the blackboard"));
		questions.add(new Question("Other Characters",300,"Who was the Plow King?","Lenny","Carl","Maggie","Barney","Barney"));
		questions.add(new Question("Springfield",300,"Who is the founder of Springfield?","Jebediah Springfield","George Springfield","Quimby Springfield","Colin Springfield","Jebediah Springfield"));
		questions.add(new Question("Episodes",300,"In every episode this character has appeared in they were shown to have 5 fingers, who was it?","God","Pilmy","Bart's evil twin","Frank Grimes","God"));
		
		questions.add(new Question("Homer",400,"Homer was born on...","May 12, 1956","September 3, 1958","September 5, 1958","July 17, 1981","May 12, 1956"));
		questions.add(new Question("Bart",400,"How old is Bart?","12","10","11","9","10"));
		questions.add(new Question("Other Characters",400,"What is the name of Cletus' wife?","Brandine","Francine","Stacy","Becky","Brandine"));
		questions.add(new Question("Springfield",400,"The estimated population of Springfield is around","45,000","50,000","75,000","120,000","50,000"));
		questions.add(new Question("Episodes",400,"Which city had a fight with Springfield over a lemon tree in 'Lemon of Troy'?","Capital City","Ogdenville","Shelbyville","Brockway","Shelbyville"));
		
		questions.add(new Question("Homer",500,"The creator of the show named Homer after his father...","Homer Armstrong","Homer Simpson","Homer Burton","Homer Groening","Homer Groening"));
		questions.add(new Question("Bart",500,"What was the name of Bart's comic strip in I am Furious Yellow?","The Yellow Man","Poptart","Angry Dad","Big Grumpy","Angry Dad"));
		questions.add(new Question("Other Characters",500,"Who teaches music at SpringField Elementary","Skinner","Hoover","CrabApple","Largo","Largo"));
		questions.add(new Question("Springfield",500,"Which state did Matt Groening claim Springfield to be in?","Washington","California","Oregon","Illinois","Oregon"));
		questions.add(new Question("Episodes",500,"In 'Homer's Night Out', how much did Homer weigh?","345","239","286","303","239"));
	}
	
	public ArrayList<Question> getQuestions()
	{
		return questions;
	}
}
