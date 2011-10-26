package com.auction.sniper;

import javax.swing.SwingUtilities;

import com.auction.sniper.ui.MainWindow;

public class Main
{
	private MainWindow ui;
	
	public Main() throws Exception
	{
		startUserInterface();
	}
	
	public static void main(String... args) throws Exception
	{
		Main main=new Main();
	}
	
	private void startUserInterface() throws Exception
	{
		SwingUtilities.invokeAndWait(new Runnable(){
			public void run()
			{
				ui = new MainWindow();
			}
		});
	}
}