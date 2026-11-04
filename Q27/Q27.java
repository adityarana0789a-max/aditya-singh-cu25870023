public class Q27 {
    public static void main(String[] args) {
        double costPrice = 500, sellingPrice = 650;
        if (sellingPrice > costPrice)
            System.out.println("Profit: " + (sellingPrice - costPrice));
        else if (sellingPrice < costPrice)
            System.out.println("Loss: " + (costPrice - sellingPrice));
        else System.out.println("No profit, no loss");
    }
}
