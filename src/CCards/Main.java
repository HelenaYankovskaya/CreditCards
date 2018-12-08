package CCards;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Bankir bankir = new Bankir();
        Scanner vvod = new Scanner(System.in);
        System.out.println("Выберите карту: 1- MasterCard; 2-VisaCard");
        int n = vvod.nextInt();

        if (n == 1) {
        bankir.setCardsMaker(new MasterCard());
          CrCards card = bankir.complectCard();
        System.out.println(card);

        } else
            {bankir.setCardsMaker(new VisaCard());
                CrCards card1 = bankir.complectCard();
                System.out.println(card1);

    }
}
}