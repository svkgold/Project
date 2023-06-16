package DEV_130_2;

public class Main {
    public static void main(String[] args)  {

        Repository repository = new Repository();
        repository.findAllItems().forEach( System.out::println);
        System.out.println("-----------------------------");
        repository.findItemsOrdersByIdAndColor().forEach( System.out::println);
    }
}