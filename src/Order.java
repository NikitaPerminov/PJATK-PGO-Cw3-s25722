import java.util.ArrayList;

public class Order {

    private int orderNumber;
    private Client client;
    private ArrayList<ProductMenu> products = new ArrayList<>();
    private boolean paid;

    private static int nextOrderNumber=1;

    public static int getNextOrderNumber() {
        return nextOrderNumber;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                '}';
    }

    public void markAsPaid(){
        this.paid = true;
    }

    public void addProduct(ProductMenu p){
        if(this.products.contains(p)){
            throw new IllegalArgumentException("Product already exists in the order");
        }
        this.products.add(p);
    }

    public double countPrice(){
        double sum = 0;
        for(ProductMenu p: products){
            sum += p.getPrice();
        }
        return sum;
    }

    public int numberOfProducts(){
        return this.products.size();
    }

    public Order(Client client) {
        this.setOrderNumber(Order.nextOrderNumber);
        this.setClient(client);
        Order.nextOrderNumber++;

    }

    public Client getClient() {
        return client;
    }

    private void setClient(Client client) {
        this.client = client;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    private void setOrderNumber(int orderNumber) {
        if(orderNumber<=0){
            throw new IllegalArgumentException("Order cannot be null or empty");
        }
        this.orderNumber = orderNumber;
    }

}
