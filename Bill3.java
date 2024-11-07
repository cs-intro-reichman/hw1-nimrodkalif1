
public class Bill3 {
    public static void main(String[] args) {
        String name1 = args[0];
        String name2 = args[1];
        String name3 = args[2];
        double total = Double.parseDouble(args[3]);

        double dividedPayment = Math.ceil(total/3);
        System.out.println(String.format("Dear %s, %s, %s: pay %.1f shekels each.", name1, name2, name3, dividedPayment));
    }
}
