package com.auction.sniper;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class MainWindow extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private final JLabel sniperStatus=createLabel("LOST");
	
	public MainWindow()
	{
		super("Auction Sniper");
		setName("Auction Sniper Main");
		add(sniperStatus);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private JLabel createLabel(String intialText) {
	JLabel result=new JLabel(intialText);
	result.setName("LOST");
	result.setBorder(new LineBorder(Color.BLACK));
	return result;
	}
}