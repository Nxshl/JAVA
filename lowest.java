import java.util.Scanner;

public class lowest{


    int p1;
    int p2;


    
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the price1: ");
        int p1 = obj.nextInt();
        System.out.println("Enter the price2: ");
        int p2 = obj.nextInt();


        if (p1 > p2){
            System.out.println("Product 1 has bigger value which is " + p1);
        }
        else {
            System.out.println("Product 2 has bigger value which is " + p2);
        }

        obj.close();
    }
}