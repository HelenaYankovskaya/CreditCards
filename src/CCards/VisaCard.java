package CCards;

public class VisaCard   extends CardsMaker {

    PayAbroadOppotunity payAbroadOppotunity = new PayAbroadOppotunity();

    @Override
    void makeSummaOverdraft() {
        cards.setPaymentInternet(true);
    }

    @Override
    void makePaymentInternet() {
   cards.setSummaOverdraft(3000);
    }

    @Override
    void makeName() {
    cards.setName("Visa");
    }

    @Override
    void makeColor() {
        cards.setColor("Gold");
    }

    @Override
    void makePayAbroad() {
        payAbroadOppotunity.off();
        payAbroadOppotunity.printState();
    }
}







