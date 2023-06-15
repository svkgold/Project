package DEV_130_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
        System.out.println("Test");
        List<Items> item = new LinkedList<>();

        try { Connection connection = DriverManager.getConnection
                    ("jdbc:postgresql://localhost:5432/orders", "postgres", "admin");

            Statement statement = connection.createStatement();
            System.out.println(statement.executeQuery("select  * from items"));


             Items items = new Items(1, "123", "Стол", "Белый", 500, 200);

            System.out.println(items);


        } catch (SQLException e) {
            e.printStackTrace();

            item.forEach( System.out::println);

        }


    }
}
