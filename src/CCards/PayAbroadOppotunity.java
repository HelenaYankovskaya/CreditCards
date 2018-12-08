package CCards;

public class PayAbroadOppotunity implements PayAbroad{
    private boolean state;

    @Override
    public void on() {
        state = true;
    }

    @Override
    public void off() {
        state = false;
    }
    @Override
    public void printState() {
        if (state == true) {
            System.out.println("++++С помощью этой карточки можно расплачиваться за границей+++++");
        } else  System.out.println("-----Этой картой можно пользоваться только в Республике Беларусь------");
    }
}
