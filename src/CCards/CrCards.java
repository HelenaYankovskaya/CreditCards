package CCards;

public class CrCards {

    private int summaOverdraft;
    private boolean paymentInternet;
    private String name;
    private String color;


    public void setSummaOverdraft(int summaOverdraft) {
        this.summaOverdraft = summaOverdraft;
    }

    public void setPaymentInternet(boolean paymentInternet) {
        this.paymentInternet = paymentInternet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ваша кредитная карта {" +
                "наименование ='" + name + '\'' +
                ", сумма овердрафта=" + summaOverdraft +
                ", оплата по интернету =" + paymentInternet +
                ", Цвет ='" + color + '\'' +
                '}';
    }
}

