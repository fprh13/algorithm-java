package public_algorithm.kakaoGoorm.first_class.javaEx02;

public class Product {
    private Long id;
    private String name;
    private int price;
    private String company;
    private String createAt;
    private int stock;

    public Product(Long id, String name, int price, String company, String createAt, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.company = company;
        this.createAt = createAt;
        this.stock = stock;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", company='" + company + '\'' +
                ", createAt='" + createAt + '\'' +
                ", stock=" + stock +
                '}';
    }
}
