package com.strategy; 

public class Window 
{ 
	Button button = new Button(200, 100)
	TextBox textbox  = new TextBox(100, 50)

	public static void main (String args[])
	{
		button.control();
		textbox.control();
	}
}
