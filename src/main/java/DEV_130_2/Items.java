package DEV_130_2;

import java.util.Objects;

public class Items {

    private int id;
    private String articles;
    private String item_name;
    private String color;
    private int price;
    private int stock_balance;

    public Items(int id, String articles, String item_name, String color, int price, int stock_balance) {
        this.id = id;
        this.articles = articles;
        this.item_name = item_name;
        this.color = color;
        this.price = price;
        this.stock_balance = stock_balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArticles() {
        return articles;
    }

    public void setArticles(String articles) {
        this.articles = articles;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock_balance() {
        return stock_balance;
    }

    public void setStock_balance(int stock_balance) {
        this.stock_balance = stock_balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Items items = (Items) o;
        return id == items.id && Objects.equals(articles, items.articles) && Objects.equals(color, items.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, articles, color);
    }

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", articles='" + articles + '\'' +
                ", item_name='" + item_name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", stock_balance=" + stock_balance +
                '}';
    }
}