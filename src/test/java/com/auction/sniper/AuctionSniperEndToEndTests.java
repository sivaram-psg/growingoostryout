package com.auction.sniper;

import org.junit.After;
import org.junit.Test;

public class AuctionSniperEndToEndTests {

	private final FakeAuctionServer auction=new FakeAuctionServer("item54321");
	private final ApplicationRunner application=new ApplicationRunner();
	@Test
	public void sniperjoinsAuctionUntilAuctionCloses() throws Exception{
		auction.startSellinItem();
		application.startBiddingIn(auction);
		auction.hasReceivedJoinRequestFromSniper();
		auction.announceClosed();
		application.showsSniperHasLostAuction();
	}

	@After public void stopAuction()
	{
	auction.stop();	
	}
	
	@After
	public void stopApplication()
	{
		application.stop();
	}
}
