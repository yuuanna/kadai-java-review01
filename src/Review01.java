
public class Review01 {

    public static void main(String [] args) {
        int price = 1500;
        double ritu = 0.1;
        int zeigaku = tax(price,ritu);
        int zeikomikakaku = price + zeigaku;
        System.out.println(price + "円の商品の税込価格は" + zeikomikakaku + "円（消費税は" + zeigaku + "円）です。");
    }
    public static int tax(int price, double ritu) {
        double zeigaku = price * ritu;
        return (int) zeigaku;
    }

}
