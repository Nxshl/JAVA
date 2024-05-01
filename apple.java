import java.util.Scanner;


public class apple{
    String name;
    int model;
    int make;


    void show(){
        System.out.println("The name of the product is " + name + " and the model name " + model + " with a make year " + make);
    }

    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        apple a = new apple();

        System.out.println("Enter the name of the device: ");
        a.name = obj.nextLine();
        System.out.println("Enter the model: ");
        a.model = obj.nextInt();
        System.out.println("Enter the make: ");
        a.make = obj.nextInt();


        a.show();
        obj.close();

    }

}