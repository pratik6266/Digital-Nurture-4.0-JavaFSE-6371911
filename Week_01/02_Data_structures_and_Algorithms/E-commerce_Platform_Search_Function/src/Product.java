public class Product {
    private int productId;
    private String productName;
    private String category;

    public Product(int id, String name, String category){
        this.productId = id;
        this.productName = name;
        this.category = category;
    }

    public int getId(){
        return this.productId;
    }

    public String getProductName(){
        return this.productName;
    }

    public String getCategory(){
        return this.category;
    }
}
