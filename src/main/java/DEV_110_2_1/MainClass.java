package DEV_110_2_1;

public class MainClass extends Person {

    public static void main(String[] args) {

      //  Teachers[] teachers = new Teachers[]{new Teachers(), new Teachers(), new Teachers()};
       // teachers[0].(new Teachers(Ronald Turner, M, Computer, science, PhD, Programming paradigms))



      print();

    }

    public static void print(){
        StringBuilder str = new StringBuilder();
        String a= String.valueOf(str.append(name));
        String b= String.valueOf(str.append(woman));


        System.out.println("This is " + a + ". " + b);

    }
}
