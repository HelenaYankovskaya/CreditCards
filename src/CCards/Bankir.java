package CCards;

public class Bankir {
    CardsMaker cardsMaker;

    public void setCardsMaker(CardsMaker cardsMaker1) {
        this.cardsMaker = cardsMaker1;
    }

    CrCards complectCard() {

        cardsMaker.createCard();
        cardsMaker.makeSummaOverdraft();
        cardsMaker.makeColor();
        cardsMaker.makeName();
        cardsMaker.makePaymentInternet();
        cardsMaker.makePayAbroad();

        CrCards crCards = cardsMaker.getCards();

        return crCards;
    }
}