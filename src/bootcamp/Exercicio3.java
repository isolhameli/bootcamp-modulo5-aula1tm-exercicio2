package bootcamp;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio3 {
    private static NumberFormat formatter = new DecimalFormat("#0.00");
    public static void main(String[] args) {
        HashMap<String, HashMap<String, Float>> hashMap = readData();
        double total = calculateSpending(hashMap);
        System.out.println("\nTotal: " + formatter.format(total));
    }

    public static HashMap readData(){
        String name;
        Float quantity, price;
        Scanner scanner = new Scanner(System.in);
        HashMap<String, HashMap<String, Float>> hashMap = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite um nome para o produto\n");
            name = scanner.nextLine();
            System.out.println("Digite um preco para o produto\n");
            price = scanner.nextFloat();
            System.out.println("Digite uma quantidade para o produto\n");
            quantity = scanner.nextFloat();
            HashMap<String, Float> innerMap = new HashMap<>();
            innerMap.put("Preco", price);
            innerMap.put("Quantidade", quantity);
            hashMap.put(name, innerMap);
            scanner.nextLine();
        }
        return hashMap;
    }

    public static double calculateSpending(HashMap<String, HashMap<String, Float>> hashMap){
        double total = 0;
        System.out.println("======================\nCalculos");
        for (Map.Entry<String, HashMap<String, Float>> entry : hashMap.entrySet()) {
            double innerPrice = entry.getValue().get("Preco");
            double innerQuantity = entry.getValue().get("Quantidade");
            double subtotal = innerPrice * innerQuantity;
            System.out.println(entry.getKey());
            System.out.println("Preco: " + formatter.format(innerPrice));
            System.out.println("Quantidade: " + (int) (innerQuantity));
            System.out.println("Subtotal: " + formatter.format(subtotal)+"\n");

            total += subtotal;
        }

        return total;
    }
}
