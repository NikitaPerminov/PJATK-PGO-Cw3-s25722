import java.util.Objects;

public class ProductMenu {

    private String code;
    private String productName;
    private double price;
    private String category;

    private static int numberOfProducts;

    public static int getNumberOfProducts() {
        return numberOfProducts;
    }

    @Override
    public String toString() {
        return "ProductMenu{" +
                "code='" + code + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ProductMenu that)) return false;
        return Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(code);
    }

    public ProductMenu(String code, String productName, double price, String category) {
        this.setCode(code);
        this.setProductName(productName);
        this.setPrice(price);
        this.setCategory(category);
        ProductMenu.numberOfProducts++;
    }

    public String getCategory() {
        return category;
    }

    private void setCategory(String category) {
        if(category==null || category.isEmpty()){
            throw new IllegalArgumentException("Category cannot be null or empty");
        }
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        if(price<=0){
            throw new IllegalArgumentException("Price cannot be less than 0");
        }
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    private void setProductName(String productName) {
        if(category==null || category.isEmpty()){
            throw new IllegalArgumentException("Category cannot be null or empty");
        }
        this.productName = productName;
    }

    public String getCode() {
        return code;
    }

    private void setCode(String code) {
        if(code==null || code.isEmpty()){
            throw new IllegalArgumentException("code cannot be null or empty");
        }
        this.code = code;
    }
}
