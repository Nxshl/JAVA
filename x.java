import java.util.Scanner;

public class studentss(){

    void display(){
        System.out.println("Your name is " + name );
        System.out.println("Your marks is " + marks );

    }

    public static void main(String[] args){

        Scanner obx = new Scanner(system.in);

        System.out.println("Enter the name: ");
        String name = obx.nextLine();

        System.out.println("Please enter your marks: ");
        int marks = obx.nextInt();
        
        obx.close();
        display();
    }
}