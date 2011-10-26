package com.auction.sniper;

import java.awt.Component;

import javax.swing.JFrame;

import org.hamcrest.Matcher;

import com.objogate.wl.swing.AWTEventQueueProber;
import com.objogate.wl.swing.driver.ComponentDriver;
import com.objogate.wl.swing.driver.JFrameDriver;
import com.objogate.wl.swing.gesture.GesturePerformer;

public class AuctionSniperDriver extends JFrameDriver {

	

	@SuppressWarnings("unchecked")
	public AuctionSniperDriver(int timeOutMillis) {
		super(new GesturePerformer(),JFrameDriver.topLevelFrame(named("Auction Sniper Main")),new AWTEventQueueProber(timeOutMillis,100));
		}

	}
