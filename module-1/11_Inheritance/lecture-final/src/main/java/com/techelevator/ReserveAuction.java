package com.techelevator;

public class ReserveAuction extends Auction {

    private int reservePrice = 0;

    public ReserveAuction(String itemForSale, int reservePrice) {
        super(itemForSale);
        this.reservePrice = reservePrice;
    }

    @Override
    public boolean placeBid(Bid offeredBid) {

        //this checks that each bid meets the minimum reserve price
        // and if it doesn't then the bid is ignored
        boolean isValidBid = false;
        if (offeredBid.getBidAmount() >= reservePrice) {
            isValidBid = super.placeBid(offeredBid);
        } else {
            System.out.println("Bid is invalid. Offered bid must meet minimum reserve price");
        }
        return isValidBid;
    }
}