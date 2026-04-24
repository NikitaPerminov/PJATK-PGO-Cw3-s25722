public class Main {
    public static void main(String[] args) {

        ProductMenu p1 = new ProductMenu("K-01", "Espresso", 9.0, "kawa");
        ProductMenu p2 = new ProductMenu("K-02", "Cappuccino", 13.5, "kawa");
        ProductMenu p3 = new ProductMenu("D-01", "Sernik", 16.0, "deser");

        Client client = new Client(100, "Julia", "Mazur", "j.mazur@mail.pl");
        /*
        Order order = new Order(client);
        Order.addProduct(p1);
        Order.addProduct(p2);
        Order.addProduct(p3);

        System.out.println(client);
        System.out.println(order);
        System.out.println("Łączna wartość: " + order.countPrice());
        System.out.println("Liczba pozycji: " + order.numberOfProducts());
        System.out.println("Liczba produktów utworzonych w systemie: " + ProductMenu.getnumberOfProducts());

        ProductMenu copyEspresso = new ProductMenu("K-01", "Espresso duplikat", 9.0, "kawa");
        System.out.println("Czy produkty są równe? " + p1.equals(copyEspresso));

        order.markAsPaid();
        System.out.println(order);

        */
    }
}