public class Order {

    private String item;
    private Double amount;

    public Order(String item, Double amount) {
        this.item = item;
        this.amount = amount;
    }

    public String getItem() {
        return item;
    }

    public Double getAmount() {
        return amount;
    }

}
