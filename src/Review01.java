
public class Review01 {

    public static void main(String[] args) {
        //消費税率を指定
        double taxRate = 0.1;
        //商品価格(税抜)を指定
        int taxEx = 1500;
        //消費税額を算定＆代入
        int vat = tax(taxRate,taxEx);
        //税込価格を算定
        int taxIn = taxEx + vat;

        System.out.println(taxEx + "円の商品の税込価格は" + taxIn + "円（消費税は" + vat + "円）です。");

    }

    public static int tax(double taxRate,int taxEx) {
        //商品価格(税抜)×消費税率
        return (int)(taxEx * taxRate);
    }

}
