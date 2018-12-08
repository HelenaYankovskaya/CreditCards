package CCards;

public class MasterCard extends CardsMaker  {

    PayAbroadOppotunity payAbroadOppotunity = new PayAbroadOppotunity();

    @Override
    void makeSummaOverdraft() {
    cards.setSummaOverdraft(5000);
    }

    @Override
    void makePaymentInternet() {
    cards.setPaymentInternet(true);
    }

    @Override
    void makeName() {
    cards.setName("Master");
    }

    @Override
    void makeColor() {
   cards.setColor("Blue");
    }

    @Override
    void makePayAbroad() {
        payAbroadOppotunity.on();
        payAbroadOppotunity.printState();
    }
}






