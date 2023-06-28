import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s= scan.nextLine();
        System.out.println(method(s));
    }
    static  String  method (String s){
        System.out.println(s.toUpperCase());
        System.out.println(s.trim());
        if (s.equals("A")){
            System.out.println(s.contains("A"));
        }else {
            System.out.println("Не содержит");
        }return s;
    }
}