package com.auction.sniper;

import org.jivesoftware.smack.XMPPException;
import org.junit.After;
import org.junit.Test;

public class AuctionSniperEndToEndTest {
	private final FakeAuctionServer auction=new FakeAuctionServer("item-54321");
private final ApplicationRunner application=new ApplicationRunner();
	
	@Test
	public void sniperJoinsAuctionUntilAuctionCloses() throws XMPPException, InterruptedException {
		auction.startSellingItem();
		application.startBiddingIn(auction);
		auction.hasReceivedJoinRequestFromSniper();
		auction.announceClosed();
		application.showSniperHasLostAuction();
	}
	
	@After
	public void closeeAuction()
	{
		auction.close();
	}
	
	@After
	public void closeApplication()
	{
		application.close();
	}

}
