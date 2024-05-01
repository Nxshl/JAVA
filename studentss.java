import java.util.Scanner;

public class studentss(){

    String name;
    int marks;

    void display(){
        System.out.println("Your name is " + name );
        System.out.println("Your marks is " + marks);

    }

    public static void main(String[] args){

        Scanner obx = new Scanner(System.in);
        Main a = new Main();

        System.out.println("Enter the name: ");
        String name = obx.nextLine();

        System.out.println("Please enter your marks: ");
        int marks = obx.nextInt();
        obx.close();


        studentss sobx = new studentss();
        studentss.name = name;
        studentss.marks = marks;

        display();
    }
}