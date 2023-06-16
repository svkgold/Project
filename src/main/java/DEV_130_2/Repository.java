package DEV_130_2;

import java.sql.*;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Repository {

    public Set<Items> findAllItems(){

        List<Items> item = new LinkedList<>();

        try { Connection connection = DriverManager.getConnection
                ("jdbc:postgresql://localhost:5432/orders", "postgres", "admin");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select  * from items");
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String articles = resultSet.getString(2);
                String item_name = resultSet.getString(3);
                String color = resultSet.getString(4);
                int price = resultSet.getInt(5);
                int stock_balance = resultSet.getInt(6);
                Items items = new Items(id, articles, item_name, color, price, stock_balance);
                item.add(items);
                //     System.out.println(id +  articles + item_name + color + price + stock_balance);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new HashSet<>(item);
    }

    public Set<Items> findItemsOrdersByIdAndColor(){

        List<Items> item = new LinkedList<>();

        try { Connection connection = DriverManager.getConnection
                ("jdbc:postgresql://localhost:5432/orders", "postgres", "admin");

            PreparedStatement statement = connection.prepareStatement();

            ResultSet resultSet = statement.executeQuery(
                    "SELECT *\n" +
                    "FROM ITEMS AS I\n" +
                    "JOIN ORDERS AS O ON\n" +
                    "I.ID=O.ID\n" +
                    "WHERE I.ID=3 and color is not null");

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String articles = resultSet.getString(2);
                String item_name = resultSet.getString(3);
                String color = resultSet.getString(4);
                int price = resultSet.getInt(5);
                int stock_balance = resultSet.getInt(6);
                Items items = new Items(id, articles, item_name, color, price, stock_balance);
                item.add(items);
                //     System.out.println(id +  articles + item_name + color + price + stock_balance);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new HashSet<>(item);

    }
}
