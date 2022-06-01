package com.techelevator;

public class Application {

    public static void main(String[] args) {

        // Create a new general auction
        System.out.println("Starting a general auction");
        System.out.println("-----------------");

        Auction generalAuction = new Auction("Tech Elevator t-shirt");

        generalAuction.placeBid(new Bid("Josh", 1));
        generalAuction.placeBid(new Bid("Fonz", 23));
        generalAuction.placeBid(new Bid("Rick Astley", 13));
        //....
        //....
        // This might go on until the auction runs out of time or hits a max # of bids

        BuyoutAuction buyoutAuction = new BuyoutAuction("Fancy Rock", 100);
        buyoutAuction.placeBid(new Bid("Josh", 10));
        buyoutAuction.placeBid(new Bid("Fonz", 23));
        buyoutAuction.placeBid(new Bid("Rick Astley", 1300));
        buyoutAuction.placeBid(new Bid("Christopher", 100));


        ReserveAuction reserveAuction = new ReserveAuction("Fancy Rock", 10);
        reserveAuction.placeBid(new Bid("Josh", 1));
        reserveAuction.placeBid(new Bid("Fonz", 5));
        reserveAuction.placeBid(new Bid("Rick Astley", 10));
        reserveAuction.placeBid(new Bid("Christopher", 100));
    }
}
