package CCards;

 public abstract class CardsMaker  {
     CrCards cards;


     void createCard() {
         cards = new CrCards();
     }
     abstract void makeSummaOverdraft();
     abstract void makePaymentInternet();
     abstract void makeName();
     abstract void makeColor();
     abstract void makePayAbroad();


     CrCards getCards(){
         return cards;
     }
 }


