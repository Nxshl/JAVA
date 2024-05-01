import java.util.Scanner;

public class product{

    String name;
    int price;

    int accept(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the product name: ");
        name = obj.nextLine();
        System.out.println("Enter the product price: ");
        price = obj.nextInt();
        return price;
    }

    void display(){
        System.out.println("name: " + price);
        System.out.println("price: " + price);   
    }


class products{
    public static void main(String[] args){
        product1 p1 = new product1();
        product1 p2 = new product1();
        product1 p3 = new product1();

    }
}
}